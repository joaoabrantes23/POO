package main

import (
	"fmt"
)

type Produto struct {
	Nome  string
	Preco float64
}

func (p Produto) Somar(outro Produto) Produto {
	return Produto{
		Nome:  p.Nome + " & " + outro.Nome,
		Preco: p.Preco + outro.Preco,
	}
}

func main() {
	produto1 := Produto{"Produto A", 10.50}
	produto2 := Produto{"Produto B", 15.75}

	produtoSoma := produto1.Somar(produto2)
	fmt.Printf("Produto: %s, Preço: R$%.2f\n", produtoSoma.Nome, produtoSoma.Preco) // Saída: Produto: Produto A & Produto B, Preço: R$26.25
}
