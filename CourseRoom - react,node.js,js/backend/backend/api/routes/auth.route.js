const router = require('express').Router();

router.post('/login', login);
router.post('/signup', signup);
module.exports = router;

const authController = require('../controllers/auth.controller');

function login(req, res, next) {
    const body =  req.body;
    res.resolveAndResponse(
        authController.login(body),
        next
    );
}

function signup(req, res, next) {
    const body =  req.body;

    res.resolveAndResponse(
        authController.signup(body),
        next
    );
}