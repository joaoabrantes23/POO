package main

import "fmt"

type Animal interface {
    Som()
}

type Cachorro struct{}

func (c Cachorro) Som() {
    fmt.Println("O cachorro late: Au Au!")
}

type Gato struct{}

func (g Gato) Som() {
    fmt.Println("O gato mia: Miau!")
}

func main() {
    var cachorro Animal = Cachorro{}
    var gato Animal = Gato{}

    cachorro.Som()  
    gato.Som()   
}
