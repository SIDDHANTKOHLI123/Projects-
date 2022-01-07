import express from 'express';
import * as todoController from '../controllers/todo.js';

const router = express.Router();
router.route('/todo') //in caseof todo get, post , will be doene
    .get(todoController.index) 
    .post(todoController.save);

router.route('/todo/:id')
    .get(todoController.get) //in case of id then we can get , update and de;ete
    .put(todoController.update)
    .delete(todoController.remove);

export default router;