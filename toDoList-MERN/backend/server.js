import app from './api/app.js';

const port  = 3001;
//from here the assignment starts here we provide port  30001 to it and later print port number below

app.listen(port, () => {
    console.log(`Example app running at http://localhost:${port}`);
})
