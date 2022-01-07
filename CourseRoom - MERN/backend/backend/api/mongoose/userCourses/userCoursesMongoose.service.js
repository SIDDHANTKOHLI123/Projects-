
const userCoursesMongooseStore = require('./userCoursesMongoose.store');

function getUserCourses(query) {
    const {userId, rpp, page} = query;
    const mongoOptions = {};
    if (rpp && page) {
        mongoOptions['limit'] = rpp;
        mongoOptions['skip'] = (page -1) * rpp;
    }
    return userCoursesMongooseStore.getUserCourses({userId}, mongoOptions);
}

function registerCourse(userCourse) {
    return userCoursesMongooseStore.registerCourse(userCourse);
}

module.exports = {
    getUserCourses,
    registerCourse
}