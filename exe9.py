from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def imprimir(self):
        print(f"Imprimindo Relatório: {self.conteudo}")

class Contrato(Imprimivel):
    def __init__(self, detalhes):
        self.detalhes = detalhes

    def imprimir(self):
        print(f"Imprimindo Contrato: {self.detalhes}")

if __name__ == "__main__":
    relatorio = Relatorio("Relatório de Vendas 2024")
    contrato = Contrato("Contrato de Prestação de Serviços")

    relatorio.imprimir()
    contrato.imprimir()
