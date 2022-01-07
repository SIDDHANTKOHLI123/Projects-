
const mongoConnection = require('../mongoConnection');
const mongo = new mongoConnection();
const models = mongo.models;
const userModel = models.user;

function getUserByEmail(email) {
    return userModel.findOne({email});
}

function saveNewUser(userInfo) {
    const newUser = new userModel({...userInfo});
    return newUser.save();
}

function getUserByUserName(userName) {
    return userModel.findOne({userName});
}

function updateSessionToken(user, token) {
    return userModel.findOneAndUpdate({email: user.email}, {sessionToken: token});
}

module.exports = {
    getUserByEmail,
    saveNewUser,
    getUserByUserName,
    updateSessionToken
}