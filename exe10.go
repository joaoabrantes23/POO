package main

import "fmt"

func somarDois(a int, b int) int {
    return a + b
}

func somarTres(a int, b int, c int) int {
    return a + b + c
}

func main() {
    resultado1 := somarDois(5, 10)
    resultado2 := somarTres(5, 10, 15)

    fmt.Println("Soma de 5 e 10:", resultado1)
    fmt.Println("Soma de 5, 10 e 15:", resultado2)
}
