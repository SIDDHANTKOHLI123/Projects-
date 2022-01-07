

const userCoursesService = require('../services/userCourses.service');

function getUserCourses(query, user) {
    const {userId, email} = user;
    query = {...query, userId};
    return userCoursesService.getUserCourses(query, user);
}

function registerCourse(body, user) {
    const {userId, email} = user;
    body = {...body, userId};
    return userCoursesService.registerCourse(body);
}

module.exports = {
    getUserCourses,
    registerCourse
}