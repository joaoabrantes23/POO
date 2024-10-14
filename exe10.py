class Calculadora:
    def somar_dois(self, a, b):
        return a + b

    def somar_tres(self, a, b, c):
        return a + b + c

if __name__ == "__main__":
    calc = Calculadora()
    
    resultado1 = calc.somar_dois(5, 10)
    resultado2 = calc.somar_tres(5, 10, 15)

    print("Soma de 5 e 10:", resultado1)
    print("Soma de 5, 10 e 15:", resultado2)
