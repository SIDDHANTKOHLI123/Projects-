import React from "react";
import "../Styles/About.scss";
import Peopleonsite from "../assets/About/poepleoncell.jpg"
function About() {
  return (
    <div className="about">
      <div
        className="aboutTop"
        style={{ backgroundImage: `url(${Peopleonsite})` }}
      ></div>
      <div className="aboutBottom">
        <h1> ABOUT US</h1>
        <p>
        With Course Room, you don’t need to move to a different city or commute long distances in order to attend the program of your choice. You can stay where you are and keep your current job while you work toward enhancing your career with an online college or graduate degree (However, some programs require fieldwork experience, which may necessitate relocation.) 
<br /><br />
On the other hand, if you want to become a digital nomad—someone who embraces a location-independent, technology-enabled lifestyle—online education may allow you to do that too. You can watch lectures and complete your coursework wherever you are—whether that’s at home, in a café, or on an exotic beach.
        </p>
      </div>
    </div>
  );
}

export default About;
