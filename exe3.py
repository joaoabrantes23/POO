class ContaBancaria:
    def __init__(self, titular, saldo_inicial):
        self.titular = titular
        self.__saldo = saldo_inicial 

    def depositar(self, valor):
        if valor > 0:
            self.__saldo += valor
            print(f"Depósito de R${valor} realizado. Saldo atual: R${self.__saldo}")
        else:
            print("Valor de depósito inválido.")

    def sacar(self, valor):
        if 0 < valor <= self.__saldo:
            self.__saldo -= valor
            print(f"Saque de R${valor} realizado. Saldo atual: R${self.__saldo}")
        else:
            print("Saldo insuficiente ou valor de saque inválido.")

    def get_saldo(self):
        return self.__saldo


conta = ContaBancaria("Maria", 1000)

conta.depositar(500)
conta.sacar(300)
print(f"Saldo final: R${conta.get_saldo()}")
