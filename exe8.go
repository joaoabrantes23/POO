package main

import (
    "fmt"
)

type Empregado struct {
    Nome   string
    Cargo  string
    Salario float64
}

type Empresa struct {
    Nome      string
    Empregados []Empregado
}

func (e *Empresa) AdicionarEmpregado(empregado Empregado) {
    e.Empregados = append(e.Empregados, empregado)
}

func (e Empresa) ListarEmpregados() {
    fmt.Printf("Empregados da empresa %s:\n", e.Nome)
    for _, empregado := range e.Empregados {
        fmt.Printf("Nome: %s, Cargo: %s, Salário: R$ %.2f\n", empregado.Nome, empregado.Cargo, empregado.Salario)
    }
}

func main() {
    empresa := Empresa{Nome: "JVA Solutions"}

    emp1 := Empregado{Nome: "João Silva", Cargo: "Desenvolvedor", Salario: 5000}
    emp2 := Empregado{Nome: "Maria Oliveira", Cargo: "Gerente", Salario: 8000}

    empresa.AdicionarEmpregado(emp1)
    empresa.AdicionarEmpregado(emp2)

    empresa.ListarEmpregados()
}
