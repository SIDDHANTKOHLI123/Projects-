'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

let courseListSchema = {
    courseName: String,
    instructor: String,
    description: String,
    updateDate: Date,
    price: String,
    imageLink: String
};

// TODO: check if need to change permissions to masterkey

let courseList = new Schema(courseListSchema);

courseList.index({courseName: 1});

module.exports = courseList;
