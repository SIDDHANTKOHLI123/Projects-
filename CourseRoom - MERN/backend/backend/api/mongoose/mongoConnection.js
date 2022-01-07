const mongoose = require('mongoose');
const config = require('../configs/db/mongo.config')
const userSchema = require("./schemas/user");

module.exports = class mongoConnection {

    constructor() {
        if(this.db) {
            console.log('db already there');
        }
        this.connectionPromise = new Promise( async (resolve, reject) => {
            console.log('Inside connected');
            this.db = mongoose.createConnection(config.MONGODB_URI);

            //********** SCHEMAS *************/
            const userSchema = require('./schemas/user');
            const courseListSchema = require('./schemas/courseList');
            const userCoursesSchema = require('./schemas/userCourses');

            //*** MODELS *****/
            const userModel = this.db.model('user', userSchema, 'user');
            const courseListModel = this.db.model('courseList', courseListSchema, 'courseList');
            const userCoursesModel = this.db.model('userCourses', userCoursesSchema, 'userCourses');

            this.models = {
                user: userModel,
                courseList: courseListModel,
                userCourses: userCoursesModel
            };
            try{
                await this.db;
            }catch (e){
                reject(e)
                throw e;
            }
            resolve();
        })
    }
}

