import React, { useContext, useState } from "react";
import { useHistory } from "react-router-dom";
import { AppContext } from "../context/AppContext";

function Profile() {


  const { isUserLoggedIn, logout } = useContext(AppContext);

  const userData = JSON.parse(localStorage.getItem('userData'));
  console.log(userData);
  const [userName, setUserName] = useState(userData.userName);
  const [firstName, setFirstName] = useState(userData.firstName);
  const [lastName, setLastName] = useState(userData.lastName);
  const [email, setEmail] = useState(userData.email);
  const [password, setPassword] = useState(userData.password);
  const [phone, setphone] = useState(userData.phone);

  const history = useHistory();

  async function UpdateUserProfile(event) {
    event.preventDefault();

    const id = userData._id;
    const user = {
      firstName: firstName,
      lastName: lastName,
      email: email,
      phone: phone
    }
    const response = await fetch('http://localhost:3001/user/' + id, {
      method: 'PUT',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(user),
    }).then(
      res => {
        return res.json;
      }
    ).then(data => console.log("HIIIIIIIIIIIIIIIII" + data.lastName));

    const updatedUser = {
      firstName: firstName,
      lastName: lastName,
      email: email,
      phone: phone
    }
    alert("User profile updated")
    localStorage.setItem('userData', JSON.stringify(updatedUser));
    console.log("RESPONSE"+ response);
    //window.location = "/";
    //userData
  }

  async function DeleteUserProfile(event) {
    event.preventDefault();

    const id = userData._id;
    const user = {
      firstName: firstName,
      lastName: lastName,
      email: email,
      phone: phone
    }
    const response = await fetch('http://localhost:3001/user/' + id, {
      method: 'DELETE',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(user),
    }).then(
      res => {
        return res.json;
      }
    ).then(data => console.log("HIIIIIIIIIIIIIIIII" + data));
    
    alert("Profile deleted")
    localStorage.removeItem('sessionToken');
    logout(); 
    history.push('/login')
    
    console.log(response)
  }

  return (
    <div className="registerForm">
      <h1>Your Details/Update Profile</h1>
      <form onSubmit={UpdateUserProfile}>


        {/* <input
          value={userName}
          type="text"
          placeholder="USER NAME" />
        <br /> */}

        <input
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          type="email"
          placeholder="EMAIL@id" />
        <br />

        <input
          value={phone}
          defaultValue={phone}
          onChange={(e) => setphone(e.target.value)}
          type="text"
          placeholder="Phone Number" />
        <br />


        <input
          value={firstName}
          onChange={(e) => setFirstName(e.target.value)}
          type="text"
          placeholder="FIRST NAME" />
        <br />

        <input
          value={lastName}
          onChange={(e) => setLastName(e.target.value)}
          type="text"
          placeholder="LAST NAME" />
        <br />



        {/* <input
          value={password}
          type="password"
          onChange={(e) => setPassword(e.target.value)}
          placeholder="password" />
        <br /> */}



        <input type="submit" onClick={DeleteUserProfile} value="Deactivate Profile" />
      </form>
      <p className="clearfix">

        <input type="submit" onClick={UpdateUserProfile} value="Update Profile" />
      </p>
    </div>

  )

}

export default Profile;