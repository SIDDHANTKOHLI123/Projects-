import React, { useEffect, useState } from "react";
import  OurCourseCategoryItem from "../helper/OurCourseCategoryItem";
import '../Styles/OurCourse.css';


function TotalCourse() {
    const [Courses, setCourses] = useState([]);

    useEffect(() => {
        fetch('http://localhost:3001/courses/getAllCourses', {
          headers: {
            'x-access-token': localStorage.getItem('sessionToken')
          }
        }).then(response => response.json()).then(data => { console.log(data);  setCourses(data.data);   });
      }, [])

      return(
            <div className="ourcourse">
              <h1 className="courseTitle">Our Courses</h1>
              
              <div className="courseList">
              {Courses.map((myCourseList, key) => {
                  return (
                      <OurCourseCategoryItem
                      key={key}
                      courseId={myCourseList._id}
              courseName={myCourseList.courseName}
              instructor={myCourseList.instructor}
              description={myCourseList.description}
              updateDate={myCourseList.updateDate}
              imageLink={myCourseList.imageLink}
              price={myCourseList.price}
              />
              );
            })}
          </div>
          </div>


      );

}

export default TotalCourse;