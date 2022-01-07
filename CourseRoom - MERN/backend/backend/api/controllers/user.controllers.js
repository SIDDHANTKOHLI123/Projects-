// import * as userService from '../services/user.service.js';
// import { request, response } from 'express';

const userService = require('../services/user.service.js')


// function get(body){
//     console.log("control");
//     return userService.get(body)
// }
// function update(body){
//     return userService.update(body)
// }

// function remove(body){
//     return userService.remove(body)
// }




const errorhandler = (message, response) => {
    response.status(500);
    response.json({ error:message });
}
const setSuccessResponse = (data, response) => {
    response.status(200); //if status 200 is there then only it will run
    response.json(data);//dats is sent in a json format
}


const get = async (request, response) => {
    try {
        console.log("hello")
        const id = request.params.id;
        const user = await userService.get(id);
        setSuccessResponse(user, response); // this si to get contet from server
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }
};

const update = async (request, response) => {
    try {
        const id = request.params.id;
        const user = {...request.body, id};
        const updateduser = await userService.update(user);
        setSuccessResponse(updateduser, response); //this is for post
    }
    catch(e) {
        errorhandler(e.message, response); // in case of error then response is sent
    }
};

const remove = async (request, response) => {
    try {
        const id = request.params.id;
        const user = await userService.remove(id);
        setSuccessResponse({message: `  User ${id} removed successfully`}, response); //this is to delete
    }
    catch(e) {
        errorhandler(e.message, response);  
    }
    
};

module.exports = {
    get,
    update,
    remove
}

