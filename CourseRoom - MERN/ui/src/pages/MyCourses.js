import React, { useContext, useEffect } from "react";
import { AppContext } from "../context/AppContext";
import MyCourseList from "../helper/myCourseList";
function MyCourses() {
  const { myCourses, setMyCourses } = useContext(AppContext);

  useEffect(() => {
    fetch('http://localhost:3001/userCourses/getUserCourses', {
      headers: {
        'x-access-token': localStorage.getItem('sessionToken')
      }
    }).then(response => response.json()).then(data => { console.log(data); setMyCourses(data.data); });
  }, [])

  return (
    <div className="ourcourse">
      <h1 className="courseTitle">My Courses</h1>
      <div className="courseList">
        {myCourses.map((myCourseList, key) => {
          return (
            <MyCourseList

              key={key}
              courseID={myCourseList.courseID}
              courseName={myCourseList.courseName}
              purchaseDate={myCourseList.purchaseDate}

            />
          );
        })}
      </div>
      )
    </div>
  )



}
export default MyCourses;