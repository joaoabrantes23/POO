from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncionarioHorista(Funcionario):
    def __init__(self, nome, valor_por_hora, horas_trabalhadas):
        super().__init__(nome)
        self.valor_por_hora = valor_por_hora
        self.horas_trabalhadas = horas_trabalhadas

    def calcular_salario(self):
        return self.valor_por_hora * self.horas_trabalhadas

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_mensal):
        super().__init__(nome)
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal

if __name__ == "__main__":
    f1 = FuncionarioHorista("Carlos", 20.0, 160)
    f2 = FuncionarioAssalariado("Ana", 3000.0)

    print("Salário de {}: {}".format(f1.nome, f1.calcular_salario()))
    print("Salário de {}: {}".format(f2.nome, f2.calcular_salario()))
