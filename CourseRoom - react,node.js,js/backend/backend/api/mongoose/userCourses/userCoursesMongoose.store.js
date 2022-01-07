
const mongoConnection = require('../mongoConnection');
const mongo = new mongoConnection();
const models = mongo.models;
const userCoursesModel = models.userCourses;

function getUserCourses(query, options) {
    return userCoursesModel.find(query, {}, options).lean().exec();
}

function registerCourse(userCourse) {
    const newUserCourse = new userCoursesModel({...userCourse});
    return newUserCourse.save();
}

module.exports = {
    getUserCourses,
    registerCourse
}