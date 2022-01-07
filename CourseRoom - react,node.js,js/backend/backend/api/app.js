const express = require('express');
const cookieParser = require('cookie-parser') ;
const cors = require('cors') ;
var resolveAndResponse = require('./middlewares/resolveandresponse');

var app = express();
app.use(express.json());
app.use(express.urlencoded({extended: false}));
app.use(cookieParser());
app.use(cors());
app.use(resolveAndResponse);
let mongoConnection = require('./mongoose/mongoConnection');
let auth = require('./routes/auth.route');
let courses = require('./routes/courses.routes');
let userCourses = require('./routes/userCourses.routes');
let user = require('./routes/user.route');
app.use('/auth', auth);
app.use('/courses',courses);
app.use('/userCourses', userCourses);
app.use('/user', user);
const port  = 3001;
//from here the assignment starts here we provide port  30001 to it and later print port number below

app.listen(port, () => {
    console.log(`Example app running at http://localhost:${port}`);
})

module.exports = app;

//this is basic app of our , we create express object and then then pass is to app ,