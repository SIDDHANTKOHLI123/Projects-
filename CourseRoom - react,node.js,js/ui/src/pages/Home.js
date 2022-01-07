import Description from '../components/description';
import FreeCourse from '../components/freecourse';
import Communityprofile from '../components/community';
import CourseSelection from '../components/courseselection';

function Home(){
    return(
      <>
        <Description />
      <h1 className="menuTitle">Discover Market Skills</h1>
      <FreeCourse />
      <h1 className="courseselTitle">Popular Courses for Better Career</h1>
      <CourseSelection/>
      <h1 className="Title">Learn from the Peers</h1>
      <Communityprofile />
      </>
    )
}
export default Home;