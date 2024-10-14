class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            return "Número inválido"
        elif n == 0 or n == 1:
            return 1
        else:
            resultado = 1
            for i in range(2, n + 1):
                resultado *= i
            return resultado

if __name__ == "__main__":
    numero = 5
    print(f"O fatorial de {numero} é: {Matematica.fatorial(numero)}")  # Saída: O fatorial de 5 é: 120
