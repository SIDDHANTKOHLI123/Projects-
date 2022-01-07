
const mongoConnection = require('../mongoose/mongoConnection');
const mongo = new mongoConnection();
const models = mongo.models;
const User = models.user;


const get = (id) => {
    const promise = User.findById(id).exec();
    return promise;
} //to get element by id this will be doen

const update = (user) => {
    user._id = user.id;
    const promise = User.findByIdAndUpdate(user.id, user).exec();
    return promise;
} 
//for post , first we get the element by id , then we find and update and then post it

const remove = (id) => {
    const promise = User.findByIdAndRemove(id).exec();
}
//remove removes this by id
module.exports = {
    get,
    update,
    remove
}
