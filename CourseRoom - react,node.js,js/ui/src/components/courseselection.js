import React from 'react'
import logo1 from "../assets/Home/ui.png"
import logo2 from "../assets/Home/sde.png"
import logo3 from "../assets/Home/dataAnalytics.png"
import "../Styles/Home/courseSelection.scss"


function courseSelection() {
    return (
        <div className="card-container">

        <div className="courseSel">
            <div className="image-container">
                <img src={logo1} alt=''></img>
            </div>
            <div className="card-content">
                <div className="card-title">
                    <h2>UI / UX Design Specialization</h2>
                </div>
                <div className="card-body">
                    <p>Design High-Impact User Experiences. Research, design, and prototype effective, visually-driven websites and apps.</p>
                </div>
            </div>

            <div className="btn">
                <button type ="button"  onClick={event =>  window.location.href='/Youtube4'}><a>View More</a></button>
                {/* <link to="/Youtube.js">View More</link> videoId="k_2ZIGw8wN8"*/}
            </div>
        </div>

        <div className="courseSel">
            <div className="image-container">
                <img src={logo2} alt=''></img>
            </div>
            <div className="card-content">
                <div className="card-title">
                    <h2>Software Development</h2>
                </div>
                <div className="card-body">
                    <p>Specializations and courses in software development for creating software, development tools and methodologies , programming languages .</p>
                </div>
            </div>

            <div className="btn">
            <button type ="button"  onClick={event =>  window.location.href='/Youtube5'}><a>View More</a></button>
            </div>
        </div>

        <div className="courseSel">
            <div className="image-container">
                <img src={logo3} alt=''></img>
            </div>
            <div className="card-content">
                <div className="card-title">
                    <h2>Data Analytics</h2>
                </div>
                <div className="card-body">
                    <p>This course will expose you to the data analytics practices executed in the business world. Explore key areas as the analytical process, data creation, storage, access and how the organization works with data.</p>
                </div>
            </div>

            <div className="btn">
            <button type ="button"  onClick={event =>  window.location.href='/Youtube6'}><a>View More</a></button>
            </div>
        </div>
    </div>
    )
}

export default courseSelection;
