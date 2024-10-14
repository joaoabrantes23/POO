package main

import (
	"fmt"
)

type SaldoInsuficienteException struct {
	mensagem string
}

func (e *SaldoInsuficienteException) Error() string {
	return e.mensagem
}

type ContaBancaria struct {
	Titular string
	Saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
	c.Saldo += valor
	fmt.Printf("Depósito de R$%.2f realizado. Saldo atual: R$%.2f\n", valor, c.Saldo)
}

func (c *ContaBancaria) Sacar(valor float64) error {
	if valor > c.Saldo {
		return &SaldoInsuficienteException{"Saldo insuficiente para realizar o saque."}
	}
	c.Saldo -= valor
	fmt.Printf("Saque de R$%.2f realizado. Saldo atual: R$%.2f\n", valor, c.Saldo)
	return nil
}

func main() {
	conta := ContaBancaria{Titular: "João", Saldo: 1000}

	if err := conta.Sacar(1200); err != nil {
		fmt.Println(err.Error()) 
	}
}
