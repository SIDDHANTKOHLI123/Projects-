
const coursesService = require('../services/courses.service');

function getCourseById(query) {
    return coursesService.getCourseById(query);
}

function searchCourseByName(body) {
    return coursesService.searchCourseByName(body);

}

function getAllCourses(query) {
    return coursesService.getAllCourses(query);
}

function saveNewCourse(body) {
    const updateDate = new Date();
    return coursesService.saveNewCourse({...body, updateDate});

}

module.exports = {
    getCourseById,
    searchCourseByName,
    getAllCourses,
    saveNewCourse
}