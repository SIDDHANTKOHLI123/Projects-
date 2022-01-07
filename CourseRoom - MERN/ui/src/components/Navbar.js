
import React, { useContext, useState } from "react";
import logo from "../assets/logo.png";
import { Link, useHistory } from 'react-router-dom';
import '../Styles/Navbar.scss';
import ReorderIcon from '@mui/icons-material/Reorder';
import { Button } from "@mui/material";
import { AppContext } from "../context/AppContext";

function Navbar() {
    const [openLinks, setOpenLinks] = useState(false);
    const history = useHistory();

    const { isUserLoggedIn, logout } = useContext(AppContext);

    console.log('status', isUserLoggedIn);

    const toggleNavbar = () => {
        setOpenLinks(!openLinks);
    };
    return (
        <div className="navbar">

            <div className="leftSidenav" id={openLinks ? "open" : "close"}>
                <img src={logo} />

                <div className="hiddenLinks">
                    <Link to="/Course">Courses</Link>
                    <Link to="/about">About</Link>
                    <Link to="/Contact">Contact</Link>
                    {
                    isUserLoggedIn ?
                        <>
                            <Link to="/MyCourses">My Courses</Link>
                            <Link to="/Profile">Profile</Link>
                            <Button className="logout" onClick={() => { localStorage.removeItem('sessionToken'); logout(); history.push('/login') }}>Log Out</Button>

                        </>
                        :
                        <>
                            <Link to="/login">Login</Link>
                            <Link to="/register">Register</Link>
                        </>
                }


                </div>
            </div>
            <div className="rightSidenav">
                <Link to="/">Home</Link>
                <Link to="/Course">Courses</Link>
                <Link to="/about">About</Link>
                <Link to="/Contact">Contact</Link>
                {/* <input type="text" placeholder="Search.."></input>
                <button type="submit" className="search">Search</button> */}
                {
                    isUserLoggedIn ?
                        <>
                            <Link to="/MyCourses">My Courses</Link>
                            <Link to="/Profile">Profile</Link>
                            <Button className="logout" onClick={() => { localStorage.removeItem('sessionToken'); logout(); history.push('/login') }}>Log Out</Button>

                        </>
                        :
                        <>
                            <Link to="/login">Login</Link>
                            <Link to="/register">Register</Link>
                        </>
                }
                <button onClick={toggleNavbar}>
                    <ReorderIcon />
                </button>


            </div>

        </div>
    )
}



export default Navbar;