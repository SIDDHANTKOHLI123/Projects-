
const mongoConnection = require('../mongoConnection');
const mongo = new mongoConnection();
const models = mongo.models;
const courseListModel = models.courseList;

function saveNewCourse(courseInfo) {
    const newCourse = new courseListModel({...courseInfo});
    return newCourse.save();
}

function getAllCourses(query, options) {
    return courseListModel.find(query, {}, options).lean().exec();
}

function getCourseById(courseId) {
    return courseListModel.findOne(courseId).lean().exec();
}

function searchCourseByName(courseName) {
    return courseListModel.find({courseName}).lean().exec();
}

module.exports = {
    saveNewCourse,
    getAllCourses,
    getCourseById,
    searchCourseByName
}