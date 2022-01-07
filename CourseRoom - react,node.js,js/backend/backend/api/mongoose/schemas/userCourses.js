'use strict';
const mongoose = require('mongoose');
const Schema = mongoose.Schema;

let userCoursesSchema = {
    courseName: String,
    courseId: String,
    userId: String,
    purchaseDate: Date
};

// TODO: check if need to change permissions to masterkey

let userCourses = new Schema(userCoursesSchema);

userCourses.index({userId: 1});

module.exports = userCourses;
