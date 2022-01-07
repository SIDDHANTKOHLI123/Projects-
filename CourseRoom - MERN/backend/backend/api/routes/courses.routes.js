const router = require('express').Router();

router.get('/getCourseById', getCourseById);
router.post('/searchCourseByName', searchCourseByName);
router.get('/getAllCourses', getAllCourses);
router.post('/saveNewCourse', saveNewCourse)
module.exports = router;

const coursesController = require('../controllers/courses.controller');

function getCourseById(req, res, next) {
    const query =  req.query;
    res.resolveAndResponse(
        coursesController.getCourseById(query),
        next
    );
}

function searchCourseByName(req, res, next) {
    const body =  req.body;

    res.resolveAndResponse(
        coursesController.searchCourseByName(body),
        next
    );
}

function getAllCourses(req, res, next) {
    const query =  req.query;

    res.resolveAndResponse(
        coursesController.getAllCourses(query),
        next
    );
}

function saveNewCourse(req, res, next) {
    const body = req.body;
    res.resolveAndResponse(
        coursesController.saveNewCourse(body),
        next
    );
}