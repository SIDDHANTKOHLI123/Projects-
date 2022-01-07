import React from "react";

const formatDate = (date) => new Date(date).toLocaleDateString();

function myCourseList ({courseID,courseName,purchaseDate}){

    return (
        <div className="courseCategoryItem">
          <h3> {courseID} </h3>
          <h1> {courseName} </h1>
          <p>Course Registered Date: {formatDate(purchaseDate)} </p>            
        </div>
    )
}

export default myCourseList;