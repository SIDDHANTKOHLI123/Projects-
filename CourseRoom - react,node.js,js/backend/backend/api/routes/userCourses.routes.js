const router = require('express').Router();

const auth = require('../middlewares/auth');
router.get('/getUserCourses', auth, getUserCourses);
router.post('/registerCourse', auth, registerCourse)

const userCoursesController = require('../controllers/userCourses.controller');

async function getUserCourses(req, res, next) {
    const user  = req.user;
    const data = await userCoursesController.getUserCourses(req.query, user);
    return res.send(data);
}

async function registerCourse(req, res, next) {
    const user  = req.user;
    const data= await userCoursesController.registerCourse(req.body, user);
    return res.send(data);
    
}

module.exports = router;
