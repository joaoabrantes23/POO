public class exe10 {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        exe10 calc = new exe10();
        
        int resultado1 = calc.somar(5, 10);
        int resultado2 = calc.somar(5, 10, 15);

        System.out.println("Soma de 5 e 10: " + resultado1);
        System.out.println("Soma de 5, 10 e 15: " + resultado2);
    }
}
