import react, { useState } from 'react';
import './NewTodo.scss';
import NewTodoForm from './NewTodoForm'

function NewTodo() {
    
    // useState allows us to have state variable in functional compnent
    // Two state variable to implement accordion functional
    const [isOpen, setIsOpen] = useState(false);

    // returns a new Todo Form
    return (
        <div className="inputfield">
            <input type="submit" name="" id="submit" value="Add New Todo" onClick={() => setIsOpen(!isOpen)}></input>
        
            {isOpen && (
                <div>
                    <NewTodoForm />
                </div>

            )}

            <p id="detail"></p>
        </div>
    )


}

export default NewTodo;