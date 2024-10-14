package main

import (
	"fmt"
	"sync"
)

type Configuracao struct {
	Variavel string
}

var instancia *Configuracao
var once sync.Once

func GetInstancia() *Configuracao {
	once.Do(func() {
		instancia = &Configuracao{Variavel: "Valor da Configuração"}
	})
	return instancia
}

func main() {
	config1 := GetInstancia()
	config2 := GetInstancia()

	fmt.Println("Configuração 1:", config1.Variavel)
	fmt.Println("Configuração 2:", config2.Variavel)
	fmt.Println("As instâncias são iguais?", config1 == config2) 
}
