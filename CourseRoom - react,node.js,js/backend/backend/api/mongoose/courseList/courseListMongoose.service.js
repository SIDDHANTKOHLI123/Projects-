
const courseListMongooseStore = require('./courseListMongoose.store');

function saveNewCourse(courseInfo) {
    return courseListMongooseStore.saveNewCourse(courseInfo);
}

function getAllCourses(query) {
    const {rpp, page} = query;
    const mongoOptions = {};
    if (rpp && page) {
        mongoOptions['limit'] = rpp;
        mongoOptions['skip'] = (page -1) * rpp;
    }
    return courseListMongooseStore.getAllCourses({}, mongoOptions);
}

function getCourseById(courseId) {
    return courseListMongooseStore.getCourseById(courseId);
}

function searchCourseByName(courseName) {
    return courseListMongooseStore.searchCourseByName(courseName);
}

module.exports = {
    saveNewCourse,
    getAllCourses,
    getCourseById,
    searchCourseByName
}