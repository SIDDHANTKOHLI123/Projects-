import { useContext } from "react";
import { AppContext } from "../context/AppContext";
const formatDate = (date) => new Date(date).toLocaleDateString();

function CourseCategoryItem ({ courseId, courseName, instructor, description, updateDate, price, imageLink}){
  const { setMyCourses } = useContext(AppContext);

  const handleBuyCourse = () => {
    const userData = JSON.parse(localStorage.getItem('userData'));

    const reqBody = {
      courseName,
      courseId,
      userId: userData._id,
      purchaseDate: new Date().toISOString(),
    }

    fetch('http://localhost:3001/userCourses/registerCourse', {
      method: 'POST',
      body: JSON.stringify(reqBody),
      headers: {
        'Content-Type': 'application/json',
        'x-access-token': localStorage.getItem('sessionToken')
      }
    })
    .then(response => response.json())
    .then(data => { 
      console.log(data); 
      setMyCourses((prev) => [...prev, data.data]);
      alert("Course registered successfully")
    });
  }

    return (
        <div className="courseCategoryItem">
          
          <h1> Course Name : {courseName} </h1>
          <h3> Instructor :{instructor} </h3>
          <p> Description <br/>{description} </p>
          <br/>
          <p> Updated Date: <br/>{formatDate(updateDate)} </p>  
          <img src={imageLink} alt={courseName}/>
          <p>Price : {price}</p>          
          <button onClick={handleBuyCourse}>Buy This Course</button>
          </div>
  );
}

export default CourseCategoryItem;

