package models

import (
	"github.com/jinzhu/gorm"
	"pkg/config"
)

var db *gorm.DB

type Book struct{
	gorm.Model
	Name string `gorm`
}