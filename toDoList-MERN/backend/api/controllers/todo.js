import { request, response } from 'express';
import * as todoService from '../services/todo.js';

const errorhandler = (message, response) => {
    response.status(500);
    response.json({ error:message });
}

const setSuccessResponse = (data, response) => {
    response.status(200); //if status 200 is there then only it will run
    response.json(data);//dats is sent in a json format
}

export const index = async (request, response) => {

    try {
        const todos = await todoService.search();//spread operator works in both arrat and objects
        setSuccessResponse(todos, response);
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }

};

export const save = async(request, response) => {
    try {
        const todo = {...request.body};
        const newTodo = await todoService.create(todo);
        setSuccessResponse(newTodo, response); // this is to save
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }
};

export const get = async (request, response) => {
    try {
        const id = request.params.id;
        const todo = await todoService.get(id);
        setSuccessResponse(todo, response); // this si to get contet from server
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }
};

export const update = async (request, response) => {
    try {
        const id = request.params.id;
        const todo = {...request.body, id};
        const updatedtodo = await todoService.update(todo);
        setSuccessResponse(updatedtodo, response); //this is for post
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }
};

export const remove = async (request, response) => {
    try {
        const id = request.params.id;
        const todo = await todoService.remove(id);
        setSuccessResponse({message: `Todo ${id} removed successfully`}, response); //this is to delete
    }
    catch(e) {
        errorhandler(e.message, response);  
    }
    
};