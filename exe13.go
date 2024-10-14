package main

import (
	"fmt"
	"log"
)

type Matematica struct{}

func (m Matematica) Fatorial(n int) (int, error) {
	if n < 0 {
		return 0, fmt.Errorf("Número inválido")
	} else if n == 0 || n == 1 {
		return 1, nil
	}

	resultado := 1
	for i := 2; i <= n; i++ {
		resultado *= i
	}
	return resultado, nil
}

func main() {
	m := Matematica{}
	numero := 5
	fatorial, err := m.Fatorial(numero)
	if err != nil {
		log.Fatal(err)
	}
	fmt.Printf("O fatorial de %d é: %d\n", numero, fatorial) 
}
