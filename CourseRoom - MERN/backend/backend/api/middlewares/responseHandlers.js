

const errorhandler = (message, response) => {
    response.status(500);
    response.json({ error:message });
}

const setSuccessResponse = (data, response) => {
    response.status(200); //if status 200 is there then only it will run
    response.json(data);//dats is sent in a json format
}