import todoRouter from './todo.js';

export default (app) => {
    /* todos routes */
    app.use('/', todoRouter);
}