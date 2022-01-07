import React from 'react'
import "../Styles/Home/freeCourse.scss"
import logo from "../assets/Home/machineLearning.png"
import logotwo from "../assets/Home/userExperience.png"
import logothree from "../assets/Home/cyberSecurity.jpg"



function freeCourse( ){
    return (
        <div className= "card-container">
            
            <div className="coursesfree">
            <div className="image-container">
                <img src={logo} alt =''></img>
            </div>
            <div className ="card-content">
            <div className = "card-title">
               <h3>Machine Learning</h3>
            </div>
            <div className ="card-body">
               <p>This course provides a broad introduction to machine learning, datamining, and statistical pattern recognition.Learn the nuances of M.L and become a master</p>
           </div>
            </div>
            
           <div className ="btn">
           <button type ="button"  onClick={event =>  window.location.href='/Youtube1'}><a>View More</a></button>
               </div>
               </div>
               <div className="coursesfree">
               <div className="image-container">
                <img src={logotwo} alt =''></img>
            </div>
            <div className ="card-content">
            <div className = "card-title">
               <h3>Graphic Design</h3>
            </div>
            <div className ="card-body">
               <p>Graphic design uses visual compositions to solve problems and communicate ideas through typography, imagery, color and form</p>
           </div>
            </div>
            
           <div className ="btn">
           <button type ="button"  onClick={event =>  window.location.href='/Youtube2'}><a>View More</a></button>
               </div>
               </div>
               <div className="coursesfree">
               <div className="image-container">
                <img src={logothree} alt =''></img>
            </div>
            <div className ="card-content">
            <div className = "card-title">
               <h3>Cyber Security</h3>
            </div>
            <div className ="card-body">
               <p>Cybersecurity technology and best practices protect critical systems and sensitive information from an ever-growing volume of continually evolving threats.</p>
           </div>
            </div>
            
           <div className ="btn">
           <button type ="button"  onClick={event =>  window.location.href='/Youtube3'}><a>View More</a></button>
               </div>
               </div>
        </div>
    )
}



export default freeCourse;
