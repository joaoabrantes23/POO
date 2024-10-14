class SaldoInsuficienteException(Exception):
    def __init__(self, mensagem):
        super().__init__(mensagem)


class ContaBancaria:
    def __init__(self, titular, saldo=0):
        self.titular = titular
        self._saldo = saldo

    def depositar(self, valor):
        self._saldo += valor
        print(f'Depósito de R${valor:.2f} realizado. Saldo atual: R${self._saldo:.2f}')

    def sacar(self, valor):
        if valor > self._saldo:
            raise SaldoInsuficienteException("Saldo insuficiente para realizar o saque.")
        self._saldo -= valor
        print(f'Saque de R${valor:.2f} realizado. Saldo atual: R${self._saldo:.2f}')

    def obter_saldo(self):
        return self._saldo


if __name__ == "__main__":
    conta = ContaBancaria("João", 1000)

    try:
        conta.sacar(1200)
    except SaldoInsuficienteException as e:
        print(e)  
