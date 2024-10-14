class Empregado:
    def __init__(self, nome, cargo, salario):
        self.nome = nome
        self.cargo = cargo
        self.salario = salario

    def __str__(self):
        return f"Nome: {self.nome}, Cargo: {self.cargo}, Salário: R$ {self.salario:.2f}"

class Empresa:
    def __init__(self, nome):
        self.nome = nome
        self.empregados = []

    def adicionar_empregado(self, empregado):
        self.empregados.append(empregado)

    def listar_empregados(self):
        print(f"Empregados da empresa {self.nome}:")
        for empregado in self.empregados:
            print(empregado)

if __name__ == "__main__":
    empresa = Empresa("JVA Solutions")

    emp1 = Empregado("João Silva", "Desenvolvedor", 5000)
    emp2 = Empregado("Maria Oliveira", "Gerente", 8000)

    empresa.adicionar_empregado(emp1)
    empresa.adicionar_empregado(emp2)

    empresa.listar_empregados()
