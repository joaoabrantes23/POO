package main

import (
    "fmt"
)

type Imprimivel interface {
    Imprimir()
}

type Relatorio struct {
    Conteudo string
}

func (r Relatorio) Imprimir() {
    fmt.Println("Imprimindo Relatório:", r.Conteudo)
}

type Contrato struct {
    Detalhes string
}

func (c Contrato) Imprimir() {
    fmt.Println("Imprimindo Contrato:", c.Detalhes)
}

func main() {
    var relatorio Imprimivel = Relatorio{Conteudo: "Relatório de Vendas 2024"}
    var contrato Imprimivel = Contrato{Detalhes: "Contrato de Prestação de Serviços"}

    relatorio.Imprimir()
    contrato.Imprimir()
}
