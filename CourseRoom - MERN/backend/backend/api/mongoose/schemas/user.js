'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

let userSchema = {
    userName: String,
    email: String,
    phone: String,
    firstName: String,
    lastName: String,
    password: String,
    sessionToken: String
};

// TODO: check if need to change permissions to masterkey

let user = new Schema(userSchema);

user.index({email_id: 1});
user.index({userName: 1});

module.exports = user;

