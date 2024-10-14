class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super().__new__(cls)
            cls._instancia.variavel = "Valor da Configuração"
        return cls._instancia

if __name__ == "__main__":
    config1 = Configuracao()
    config2 = Configuracao()

    print(f"Configuração 1: {config1.variavel}")
    print(f"Configuração 2: {config2.variavel}")
    print(f"As instâncias são iguais? {config1 is config2}") 
