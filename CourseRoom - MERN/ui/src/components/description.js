import logo from '../assets/Home/description.jpeg';
import '../Styles/Home/description.scss';
const description=()=>{
return (
    <div className="description">
        <div className="child1">
        <p>When you sit down to outline a course it can be a bit overwhelming. You have a million and one ideas. But where do you start? What should you say? What’s going to be the most helpful for your students?So here is <h1 className="courseRoom">Course Room</h1>to guide you</p>
        </div>
        <div className="child2">
        <img src={logo} ></img>
        </div>
        
    </div>

)
}

export default description;