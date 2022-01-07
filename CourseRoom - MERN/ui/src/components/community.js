import React from 'react'
import  "../Styles/Home/community.scss"
import women from "../assets/Home/woman.png"
import male from "../assets/Home/male.jpg"
import women2 from "../assets/Home/women2.jpg"


function Communityprofile(){
    return(
        <div className ="profile-container">
            <div className="profile">
            <div className="profile-image">
                <img className ="imageround" src ={women} alt =""/>
            </div>
            <div className= "profile-title">
                <h2> Julia Ryerson</h2>
                <h3>Web Developer</h3>
            </div>
            <div className="profile-text">
                <p>Started at ground zero . With CourseRoom , I learnt online and eventually developed enough knowledge and skills to transition into well paid career</p>
            </div>
            </div>

            <div className="profile">
            <div className="profile-image">
                <img className ="imageround" src ={women2} alt =""/>
            </div>
            <div className= "profile-title">
                <h2> Kara Amber</h2>
                <h3>Cloud Analyst</h3>
            </div>
            <div className="profile-text">
                <p>CourseRoom handsdown has given me the opportunity to expand my skilset and learn the most demanding skills in my field.</p>
            </div>
            </div>

            <div className="profile">
            <div className="profile-image">
                <img className ="imageround" src ={male} alt =""/>
            </div>
            <div className= "profile-title">
                <h2> James Harden</h2>
                <h3>Data Science</h3>
            </div>
            <div className="profile-text">
                <p>Recruiter saw my professional certificate on LinkedIn and they were impressed by the skills I learnt</p>
            </div>
            </div>
        </div>
    )

}

export default Communityprofile ;