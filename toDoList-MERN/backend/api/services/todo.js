import 
Todo from "../models/todo.js";

export const search = (params = {}) => {
    const promise = Todo.find(params).exec();
    return promise;
}; //this will find params if any to seach

export const create = (todo) => {
    const newTodo = new Todo(todo);
    return newTodo.save();
} //to screate it will create new object then it will be saved

export const get = (id) => {
    const promise = Todo.findById(id).exec();
    return promise;
} //to get element by id this will be doen

export const update = (todo) => {
    todo._id = todo.id;
    const promise = Todo.findByIdAndUpdate(todo.id, todo).exec();
    return promise;
} 
//for post , first we get the element by id , then we find and update and then post it

export const remove = (id) => {
    const promise = Todo.findByIdAndRemove(id).exec();
}
//remove removes this by id