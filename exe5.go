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

func emitirSomDosAnimais(animais []Animal) {
    for _, animal := range animais {
        animal.Som()  
    }
}

func main() {
    animais := []Animal{Cachorro{}, Gato{}}

    emitirSomDosAnimais(animais)
}
