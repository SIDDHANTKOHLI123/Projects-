import react from 'react';
import NewTodo from '../New-Todo/NewTodoItem';
import './NewTodoWrapper.scss';

class NewTodoWrapper extends react.Component {

    render(){
        //returns new todo component
    return (
        <div className="wrapper">
            <NewTodo />
        </div>
    )
}
}

export default NewTodoWrapper;
