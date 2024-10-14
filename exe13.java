public class exe13 {
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            long resultado = 1;
            for (int i = 2; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
    }
}
