// import * as userController from '../controllers/user.controllers.js';
const userController = require('../controllers/user.controllers.js');
const router = require('express').Router();
console.log("jhbsan")
router.route('/:id')
    .get(userController.get) //in case of id then we can get , update and de;ete
    .put(userController.update)
    .delete(userController.remove);

// export default router;
module.exports = router;
