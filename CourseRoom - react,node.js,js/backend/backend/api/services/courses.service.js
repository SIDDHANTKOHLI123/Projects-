
const courseListMongooseService = require('../mongoose/courseList/courseListMongoose.service');
const _ = require('lodash');

function getCourseById(query) {
    const {courseId} = query;
    if(_.isEmpty(courseId)) {
        return {success: false, message: 'CourseId is required for query'};
    }
    return courseListMongooseService.getCourseById(courseId).then(res => {
        return {success: true, data: res}
    });
}

function searchCourseByName(body) {
    const  {courseName} = body;
    if (_.isEmpty(courseName)) {
        return {success: false, message: 'CourseId is required for query'};
    }
    return courseListMongooseService.searchCourseByName(courseName).then(res => {
        return {success: true, data: res}
    });
}

function getAllCourses(query) {
    query = query ? query : {};
    return courseListMongooseService.getAllCourses(query).then(res => {
        return {success: true, data: res}
    });;
}

function saveNewCourse(courseInfo) {
    const  {courseName, instructor, description, updateDate, price, imageLink} = courseInfo;
    if (!courseName || !instructor || !price || !imageLink) {
        return {success: false, message: 'Required Fields missing'};
    }
    return courseListMongooseService.saveNewCourse({courseName, instructor, description, updateDate, price, imageLink}).then(res => {
        return {success: true, data: res.toObject()}
    });
}

module.exports = {
    getCourseById,
    searchCourseByName,
    getAllCourses,
    saveNewCourse
}