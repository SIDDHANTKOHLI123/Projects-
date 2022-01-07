
const userMongooseService = require('../mongoose/user/userMongoose.service');
const bcrypt = require('bcrypt');
const jwt = require('jsonwebtoken');
const config = require('../configs/app.config');



module.exports = {
    login,
    signup
}

async function login(body) {
    const {userName, password} = body;
    if(!userName || !password) {
        return {success: false, message: 'User name and password cannot be null'};
    }
    //while at time of login if there is no userName or password , success is returned false to controller
    let user = await userMongooseService.getUserByUserName(userName);
    if (!user) {
        return {success: false, message: 'User does not exist'};
    }
    //it is checked if user exist or not by calling .getUserByUsername
    const isPasswordCorrect = await comparePassword(password, user.password);
    if(!isPasswordCorrect) {
        return {success: false, message: 'Incorrect Pasword'};
    }
    user = await addSessionToken(user);
    return {success: true, data: user};
}
//then password is checked if password matches then success found is true and data from data base is found and imported and a sessionToken is added

function createSessionToken(user) {
    const token = jwt.sign(
        { userId: user._id, email: user.email },
        config.TOKEN_KEY,
        {
            expiresIn: "2h",
        }
    );
    return token;
}

async function addSessionToken(user) {
    const token = createSessionToken(user);
    return await userMongooseService.updateSessionToken(user, token);
}
//when user login is accepted a function addSessionToken is called and 

async function encryptPassword(password) {
    try {
        const salt = await bcrypt.genSalt(10);
        const encryptedPassword = bcrypt.hash(password, salt);
        return encryptedPassword;
    } catch(e) {
      console.error(`Error Encrypting password ${JSON.stringify(e)}`);
      return null;
    }

}

async function comparePassword(plainPass, hashword) {
    const isPasswordCorrect = await bcrypt.compare(plainPass, hashword);
    return isPasswordCorrect;
}


async function signup(body) {
    let {email, userName, password, phone, firstName, lastName} = body;
    if (!email || !userName || !password || !phone || !firstName || !lastName) {
        return {success: false, message: 'Required fields cannot be empty'};
    }
    const [isEmailInUse, isUserNameInUse] = await Promise.all([
        userMongooseService.getUserByEmail(email),
        userMongooseService.getUserByUserName(userName)
    ]);
    if(isEmailInUse) {
        return {success: false, message: 'Email address already in use'};
    }
    if(isUserNameInUse) {
        return {success: false, message: 'User name already in use'};
    }
    password = await encryptPassword(password);
    let newUser = await userMongooseService.saveNewUser({email, userName, password, phone, firstName, lastName});
    if (newUser) {
        newUser = await addSessionToken(newUser);
        return {success: true, data: newUser};
    }
    return {success: false, message: 'Error saving user'};
}