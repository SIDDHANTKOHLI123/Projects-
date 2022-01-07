import Nav from './components/Navbar';
import './App.css';
import {BrowserRouter as Router,Switch,Route } from 'react-router-dom';
import Footer from './components/footer';
import About from "./pages/About";
import Login from "./pages/Login";
import Register from "./pages/Register";
import Contact from "./pages/Contact";
import Profile from './pages/Profile';
import Youtube1 from './pages/Youtube/Youtube1';
import Youtube2 from './pages/Youtube/Youtube2';
import Youtube3 from './pages/Youtube/Youtube3';
import Youtube4 from './pages/Youtube/Youtube4';
import Youtube5 from './pages/Youtube/Youtube5';
import Youtube6 from './pages/Youtube/Youtube6';
import MyCourses from './pages/MyCourses';
import CourseCheck from './pages/Course';


import Home from "./pages/Home";

function App() {
 
  return (
    <div className="App">
      <Router> {/*this is used to Route to a page*/}
      <Nav />
      
      <Switch>
      <Route path="/" exact component={Home} />
      <Route path="/about" exact component={About} />
      <Route path="/Contact" exact component={Contact}/>
      <Route path="/Login" exact component={Login} />
      <Route path="/Register" exact component={Register} />
      <Route path="/Profile" exact component={Profile} />
      <Route path="/Youtube1" exact component={Youtube1}/>
      <Route path="/Youtube2" exact component={Youtube2}/>
      <Route path="/Youtube3" exact component={Youtube3}/>
      <Route path="/Youtube4" exact component={Youtube4}/>
      <Route path="/Youtube5" exact component={Youtube5}/>
      <Route path="/Youtube6" exact component={Youtube6}/>
      <Route path="/MyCourses" exact component={MyCourses}/> 
      <Route path="/Course" exact component={CourseCheck}/>
      
      </Switch>
      
      </Router>
      
      <Footer />
    </div>
  );
}

export default App;
