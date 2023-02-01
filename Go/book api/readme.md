Dependencies to be ceated

1) make a go. mod file which will store all the dependencies :
     go mod init go-bookstore

2) Dependencies to be installed :
    go get "github.com/jinzhu/gorm"
    go get "github.com/jinzhu/gorm/dialects/mysql"
    go get "github.com/gorilla/mux"