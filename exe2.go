// carro.go
package main

import "fmt"

// Definindo a estrutura Carro
type Carro struct {
    Marca     string
    Modelo    string
    Ano       int
    Velocidade int
}

// Função para acelerar
func (c *Carro) Acelerar(incremento int) {
    c.Velocidade += incremento
    fmt.Printf("Acelerando... Velocidade atual: %d km/h\n", c.Velocidade)
}

// Função para frear
func (c *Carro) Frear(decremento int) {
    c.Velocidade -= decremento
    if c.Velocidade < 0 {
        c.Velocidade = 0 // Velocidade não pode ser negativa
    }
    fmt.Printf("Freando... Velocidade atual: %d km/h\n", c.Velocidade)
}

// Função para exibir a velocidade atual
func (c Carro) ExibirVelocidade() {
    fmt.Printf("Velocidade atual: %d km/h\n", c.Velocidade)
}

func main() {
    // Criando um carro
    carro := Carro{Marca: "Toyota", Modelo: "Corolla", Ano: 2020, Velocidade: 0}

    // Testando métodos
    carro.Acelerar(50)  // Aumenta a velocidade em 50 km/h
    carro.Frear(20)     // Diminui a velocidade em 20 km/h
    carro.ExibirVelocidade()  // Exibe a velocidade atual
}
