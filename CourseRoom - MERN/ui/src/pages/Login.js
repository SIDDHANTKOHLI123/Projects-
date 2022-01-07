import { useContext, useState } from 'react'
import '../Styles/Login.scss';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import { useHistory } from "react-router-dom";
import { AppContext } from '../context/AppContext';

function Login() {

  const [userName, setUserName] = useState('');
  const [password, setPassword] = useState('');

  const { login } = useContext(AppContext); 

  const history = useHistory();

  const routeChange = () => {
    let path = `register`;
    history.push(path);
  }

  async function loginUser(event) {
    event.preventDefault();
    const response = await fetch('http://localhost:3001/auth/login', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify({
        userName,
        password,

      }),
    })

    const  data = await response.json()
    console.log(data);

    if (data.success) {
      console.log(5);
      localStorage.setItem('sessionToken', data.data.sessionToken)
      localStorage.setItem('userData', JSON.stringify(data.data))
      alert('Login successful');
      login();
      history.push("/");
    } else {

      console.log(6);
      alert('Please check your username and password')
    }
  }

  return (
    <div className="logindiv">

      <form className="loginform" onSubmit={loginUser} >
        <h1><span className="log-in">Log in</span> or <span className="sign-up">sign up</span></h1>

        <p className="float">
          <label for="userName"><i className="icon-lock"></i>UserName</label>
          <input
            value={userName}
            name="userName"
            type="text"
            onChange={(e) => setUserName(e.target.value)}
            placeholder="Enter userName id to login" />
          <br />
        </p>

        <p className="float">
          <label for="password"><i className="icon-lock"></i>Password</label>
          <input
            value={password}
            name="password"
            onChange={(e) => setPassword(e.target.value)}
            type="password"
            placeholder="password" />
          <br />
        </p>

        <p className="clearfix">

          <input type="submit" className="log-twitter" value="New user?Register" onClick={routeChange} />

          <input type="submit" value="Login" />
        </p>
      </form>


    </div>
  )
}

export default Login;