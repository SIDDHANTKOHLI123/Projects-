import './App.scss';
import react from 'react';
import TodoItem from './Todo-Items/TodoItem';
import NewTodoWrapper from './NewTodoWrapper/NewTodoWrapper';
// import todos from './todosData';



class App extends react.Component {
  constructor() {
    super();

    // State variable is used to store all the todos data
    this.state = {
      todosData: []
    }
    // bidning the handleChange function with the class so that we can pass it as a callback without worrying about its context.
    this.handleChange = this.handleChange.bind(this)

  }

  // This method will be invoked as soon as we load the compnent
  componentWillMount() {
    // fetch all the database from the API
    fetch("http://localhost:3001/todo")
      .then(response => response.json())
      .then(data => {
      // storing todo data from API to the state variable
        this.setState({
          todosData: data
        })
      })
  }


// This method is invoked when we complete a todo
  handleChange(id) {
    this.setState(prevState => {
      const updatedTodos = prevState.todosData.map(todo => {
        if (todo._id == id) {
          //inverts the completed flag
          todo.completed = !todo.completed;
        
          // fetch method to update in the database
          fetch('http://localhost:3001/todo/' + todo._id, {
            method: 'PUT',
            headers: {
              'Content-Type': 'application/json',
            },
            body: JSON.stringify(todo),
          })
            .then(response => response.json())
            .then(data => {
              window.location.reload();
      
            })
            .catch(error => alert('Error posting data: ', error));
        }
        return todo;
      })
      return {
        todos: updatedTodos
      }
    })
  }

  
// Render all the components
  render() {
    const todocomponents = this.state.todosData.map(todo => <TodoItem key={todo._id} todo={todo} handleChange={this.handleChange} />)
    return (
      <div className="container">
        <NewTodoWrapper /> 
        <div className="wrapper2">
          <div className="todoList">
            {todocomponents}
          </div>
        </div>

      </div>

    )
  }
}

export default App;
