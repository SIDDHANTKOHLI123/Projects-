package topten;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class TopTenFriends {

	public static class TopTen_Map1 extends Mapper<LongWritable, Text, Text, Text> {

		private Text word = new Text(); // type of output key

		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			String[] line = value.toString().split("\t");
			if (line.length == 2) {
				String friend1 = line[0];
				List<String> values = Arrays.asList(line[1].split(","));
				for (String friend2 : values) {
					int f1 = Integer.parseInt(friend1);
					int f2 = Integer.parseInt(friend2);
					if (f1 < f2)
						word.set(friend1 + "," + friend2);
					else
						word.set(friend2 + "," + friend1);
					context.write(word, new Text(line[1]));
				}
			}
		}
	}

	public static class TopTen_Reduce1 extends Reducer<Text, Text, Text, IntWritable> {

		public void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int countMututalFriend = 0;
			for (Text friends : values) {
				List<String> temp = Arrays.asList(friends.toString().split(","));
				for (String friend : temp) {
					if (map.containsKey(friend))
						countMututalFriend += 1;
					else
						map.put(friend, 1);

				}
			}

			context.write(key, new IntWritable(countMututalFriend));
		}
	}

	public static class TopTen_Map2 extends Mapper<LongWritable, Text, IntWritable, Text> {
		private final static IntWritable one = new IntWritable(1);

		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
			{
				context.write(one, value);
							}
		}
	}

	public static class TopTen_Reduce2 extends Reducer<IntWritable, Text, Text, IntWritable> {

			public  void reduce(IntWritable key, Iterable<Text> values,
		Reducer<IntWritable, Text, Text, IntWritable>.Context context) throws IOException, InterruptedException {
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			int count = 1;
			for (Text line : values) {
				String[] fields = line.toString().split("\t");
				if (fields.length == 2) {
					map.put(fields[0], Integer.parseInt(fields[1]));
				}
			}
			
				ValueComparator bvc = new ValueComparator(map);
				TreeMap<String, Integer> sorted_map = new TreeMap<String,Integer>(bvc);
				sorted_map.putAll(map);

				for (Entry<String, Integer> entry : sorted_map.entrySet()) {
					
					if (count <= 10) {
						context.write(new Text(entry.getKey()), new IntWritable(entry.getValue()));
						
					}
					else
						break;
					count++;
				}
			}
		}	
	
//Defining ValueCopmarator explicitly so that we can sort the map in Descending Order
	public static class ValueComparator implements Comparator<String> {

		HashMap<String, Integer> base;

		public ValueComparator(HashMap<String, Integer> base) {
			this.base = base;
		}

		public int compare(String a, String b) {
			
			if (base.get(a) >= base.get(b)) {
				return -1;
			} else {
				return 1;
			}
		}

	}

	public static void main(String[] args) throws Exception{
		Configuration conf = new Configuration();
		String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
		// get all args
		if (otherArgs.length != 3) {
			System.err.println("Usage: TopTepFriends <inputfile HDFS path> <outputfile1 HDFS path> <outputfile2 HDFS path>");
			System.exit(2);
		}
		@SuppressWarnings("deprecation")
		Job job = new Job(conf, "TopTepFriends Phase 1");
		job.setJarByClass(TopTenFriends.class);
		job.setMapperClass(TopTen_Map1.class);
		job.setReducerClass(TopTen_Reduce1.class);

		job.setMapOutputKeyClass(Text.class);
		job.setMapOutputValueClass(Text.class);
		
		job.setOutputKeyClass(Text.class);
		
		job.setOutputValueClass(IntWritable.class);

		FileInputFormat.addInputPath(job, new Path(otherArgs[0]));
		// set the HDFS path for the output1 (this output file will contain count of the mutual friends between two friends)
		FileOutputFormat.setOutputPath(job, new Path(otherArgs[1]));
		boolean mapreduce = job.waitForCompletion(true);

		if (mapreduce) {
			Configuration conf1 = new Configuration();
			@SuppressWarnings("deprecation")
			Job job1 = new Job(conf1, "TopTenFriends Phase 2");
			job1.setJarByClass(TopTenFriends.class);
			job1.setMapperClass(TopTen_Map2.class);
			job1.setReducerClass(TopTen_Reduce2.class);
			job1.setInputFormatClass(TextInputFormat.class);
			job1.setMapOutputKeyClass(IntWritable.class);
			job1.setMapOutputValueClass(Text.class);
			
			job1.setOutputKeyClass(Text.class);
			
			job1.setOutputValueClass(IntWritable.class);
		
			//sending output of MapReduce phase1 as an input to MapReduce phase2 
			FileInputFormat.addInputPath(job1, new Path(otherArgs[1]));
			
			// set the HDFS path for the output2 (this output file will contain top ten count of the mutual friends between two friends)
			FileOutputFormat.setOutputPath(job1, new Path(otherArgs[2]));

			System.exit(job1.waitForCompletion(true) ? 0 : 1);

		}

	}

}