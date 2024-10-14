package main

import "fmt"

type ContaBancaria struct {
    Titular string
    saldo   float64
}

func (c *ContaBancaria) Depositar(valor float64) {
    if valor > 0 {
        c.saldo += valor
        fmt.Printf("Depósito de R$%.2f realizado. Saldo atual: R$%.2f\n", valor, c.saldo)
    } else {
        fmt.Println("Valor de depósito inválido.")
    }
}

func (c *ContaBancaria) Sacar(valor float64) {
    if valor > 0 && valor <= c.saldo {
        c.saldo -= valor
        fmt.Printf("Saque de R$%.2f realizado. Saldo atual: R$%.2f\n", valor, c.saldo)
    } else {
        fmt.Println("Saldo insuficiente ou valor de saque inválido.")
    }
}

func (c *ContaBancaria) GetSaldo() float64 {
    return c.saldo
}

func main() {
    conta := ContaBancaria{Titular: "Maria", saldo: 1000}

    conta.Depositar(500)
    conta.Sacar(300)
    fmt.Printf("Saldo final: R$%.2f\n", conta.GetSaldo())
}
