class Professor:
    def __init__(self, nome):
        self.nome = nome

    def __str__(self):
        return self.nome

class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def adicionar_professor(self, professor):
        self.professores.append(professor)

    def listar_professores(self):
        print(f"Professores da escola {self.nome}: {', '.join(str(p) for p in self.professores)}")

if __name__ == "__main__":
    escola1 = Escola("Escola A")
    escola2 = Escola("Escola B")

    professor1 = Professor("Professor João")
    professor2 = Professor("Professor Maria")

    escola1.adicionar_professor(professor1)
    escola1.adicionar_professor(professor2)
    escola2.adicionar_professor(professor1)  

    escola1.listar_professores()
    escola2.listar_professores()
