package main

import "fmt"

type Professor struct {
    Nome string
}

type Escola struct {
    Nome      string
    Professores []Professor
}

func (e *Escola) AdicionarProfessor(professor Professor) {
    e.Professores = append(e.Professores, professor)
}

func (e Escola) ListarProfessores() {
    fmt.Printf("Professores da escola %s: ", e.Nome)
    for _, professor := range e.Professores {
        fmt.Printf("%s ", professor.Nome)
    }
    fmt.Println()
}

func main() {
    escola1 := Escola{Nome: "Escola A"}
    escola2 := Escola{Nome: "Escola B"}

    professor1 := Professor{Nome: "Professor João"}
    professor2 := Professor{Nome: "Professor Maria"}

    escola1.AdicionarProfessor(professor1)
    escola1.AdicionarProfessor(professor2)
    escola2.AdicionarProfessor(professor1) 

    escola1.ListarProfessores()
    escola2.ListarProfessores()
}
