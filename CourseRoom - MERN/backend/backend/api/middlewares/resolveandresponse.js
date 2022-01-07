
module.exports = function (req, res, next) {

    res.resolveAndResponse = function (promise, next) {
        promise
            .then(function (data) {
                    res.json(data);
            })
            .catch(function (err) {
                console.error( "Could not compose an error message: " + JSON.stringify( err ) );
                next(err);
            })
    };
    next();
};
