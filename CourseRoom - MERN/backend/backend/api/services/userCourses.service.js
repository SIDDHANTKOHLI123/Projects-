

const userCoursesMongooseService = require('../mongoose/userCourses/userCoursesMongoose.service');

function getUserCourses(query) {
    const {userId, rpp, page} = query;
    if(!userId) {
        return {success: false, message: 'UserId is required for query'};
    }
    return userCoursesMongooseService.getUserCourses(query).then(res => {
        return {success: true, data: res}
    });;
}

function registerCourse(body) {
    const {userId, courseName, courseId} = body;
    const purchaseDate = new Date();
    if(!userId || !courseName || !courseId) {
        return {success: false, message: 'Required Fields missing for registration'};
    }
    const userCourse = {userId, courseName, courseId, purchaseDate}
    return userCoursesMongooseService.registerCourse(userCourse).then(res => {
        return {success: true, data: res}
    });;
}

module.exports = {
    getUserCourses,
    registerCourse
}