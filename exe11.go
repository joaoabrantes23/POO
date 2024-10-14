package main

import (
	"fmt"
)

type Funcionario interface {
	CalcularSalario() float64
	Nome() string 
}

type FuncionarioHorista struct {
	nome             string
	valorPorHora     float64
	horasTrabalhadas int
}

func (f FuncionarioHorista) CalcularSalario() float64 {
	return f.valorPorHora * float64(f.horasTrabalhadas)
}

func (f FuncionarioHorista) Nome() string {
	return f.nome
}

type FuncionarioAssalariado struct {
	nome         string
	salarioMensal float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.salarioMensal
}

func (f FuncionarioAssalariado) Nome() string {
	return f.nome
}

func main() {
	f1 := FuncionarioHorista{"Carlos", 20.0, 160}
	f2 := FuncionarioAssalariado{"Ana", 3000.0}

	var funcionarios []Funcionario
	funcionarios = append(funcionarios, f1, f2)

	for _, f := range funcionarios {
		fmt.Printf("Salário de %s: %.2f\n", f.Nome(), f.CalcularSalario())
	}
}
