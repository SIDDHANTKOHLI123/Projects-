
const userMongooseStore = require('./userMongoose.store');

function getUserByEmail(email) {
    return userMongooseStore.getUserByEmail(email).then(user => {
        if(user) {return user.toObject();}
    });
}

function saveNewUser(userInfo) {
    return userMongooseStore.saveNewUser(userInfo).then(user => {
        if(user) {return user.toObject();}
    });
}

function getUserByUserName(userName) {
    return userMongooseStore.getUserByUserName(userName).then(user => {
        if(user) {return user.toObject();}
    });
}

function updateSessionToken(user, token) {
    return userMongooseStore.updateSessionToken(user, token).then(user => {
        if(user) {return user.toObject();}
    });
}
module.exports = {
    getUserByEmail,
    saveNewUser,
    getUserByUserName,
    updateSessionToken
}