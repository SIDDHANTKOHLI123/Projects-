package utils

import (
	"encoding/json"
	"io/ioutil"
	"net/http"
)

//used if we want to get data from sent by user that is in json then we use utils

func ParseBody( r *http.Request, x interface{}){
	if body, err :=ioutil.ReadAll(r.Body); err==nil{
		if err:= json.Unmarshal([]byte(body),x); err!=nil{
			return 
		}
	}
}