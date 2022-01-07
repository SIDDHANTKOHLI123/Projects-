import {useState} from 'react' 
import {useHistory} from 'react-router-dom'
import '../Styles/Register.scss'
function Register(){

    const history = useHistory()

    const[userName,setUserName]=useState("");
    const [firstName,setFirstName]= useState("");
    const [lastName,setLastName]=useState("");
    const [email,setEmail]=useState("");
    const [password,setPassword]= useState("");
    const[phone,setphone]=useState("");
    

    async function registerUser(event){
        event.preventDefault();
        const response = await fetch('http://localhost:3001/auth/signup', {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json',
			},
			body: JSON.stringify({
                userName,
                email,
                phone,
				firstName,
                lastName,
				password,
                
			}),
		})

		const data = await response.json();

        console.log('data', data);
        console.log(data);

		if (data.success) {
            console.log(data);
            let path = `/Login`; 
            history.push(path);
            
            alert('Register successful')
            
		}
        else{
            alert("Data field missing or dupilicate userName or email")
        }
        
	
    }

   

return(
    <div className="registerForm">
        <h1>Register User</h1>
        <form onSubmit={registerUser}>

        <input 
        value={userName}
        onChange={(e) => setUserName(e.target.value)}
        type="text"
        placeholder= "USER NAME" />
        <br/>

        <input 
        value={email}
        onChange={(e)=>setEmail(e.target.value)}
        type="email"
        placeholder= "EMAIL@id" />
        <br/>

        <input 
        value={phone}
        onChange={(e) => setphone(e.target.value)}
        type="text"
        placeholder= "Phone Number" />
        <br/>


        <input 
        value={firstName}
        onChange={(e) => setFirstName(e.target.value)}
        type="text"
        placeholder= "FIRST NAME" />
        <br/>

       <input 
        value={lastName}
        onChange={(e) => setLastName(e.target.value)}
        type="text"
        placeholder= "LAST NAME" />
        <br/>

       

        <input 
        value={password}
        type="password"
        onChange={(e)=>setPassword(e.target.value)}
        placeholder= "password" />
        <br/>

        

        <input type="submit" value="Register"/>
        </form>
    </div>
)

}

export default Register;