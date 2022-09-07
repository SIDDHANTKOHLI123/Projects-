package com.cfamily.pigudfcheck;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;

public class CountTotalCheck extends EvalFunc<Integer>{

	@Override
	public Integer exec(Tuple input) throws IOException {
		// TODO Auto-generated method stub
		 int count = 0;
		 
		 if (input == null || input.size() == 0)    {  
		      return 0;      
		      
		 }
		 String check;
	try{
	  check=(String) input.get(0);
	}
	catch(Exception e) {
		return 0;
	}
	System.out.println(check);
	if(check.isEmpty()) {
		return 0;
	}
	else{
		count++;
		for( int i= 0; i < check.length(); i++)
     {
         if(check.charAt(i) == ',')
             count++;
     }
	
		return new Integer(count);
	}
	}
}
