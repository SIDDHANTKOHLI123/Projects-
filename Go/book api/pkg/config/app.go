package config

import(
	"github.com/jinzhu/gorm"
	"github.com/jinzhu/gorm/dialects/mysql"
)

//to connect to mysql config file

var (
	db * gorm.DB
)

func Connect(){
	d, err := gorm.Open("mysql","root:root/simplerest?charset=utf8&parseTime=True&loc=Local")
	if err !=nil{
		panic(err)
	}
	db = d
}

func GetDB() *gorm.DB{
	return db
}