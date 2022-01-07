
const authService = require('../services/auth.service');

module.exports = {
    login,
    signup
}

function login(body) {
    return authService.login(body);
}

function signup(body) {
    return authService.signup(body);
}

//login and signup are exported , in login and signup function body is passed and response from authService is returned