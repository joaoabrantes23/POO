public class exe6 {

    public static class Motor {
        private int potencia;

        public Motor(int potencia) {
            this.potencia = potencia;
        }

        public int getPotencia() {
            return potencia;
        }

        public void setPotencia(int potencia) {
            this.potencia = potencia;
        }
    }

    public static class Carro {
        private String marca;
        private String modelo;
        private Motor motor;

        public Carro(String marca, String modelo, Motor motor) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
        }

        public void exibirDetalhes() {
            System.out.println("Carro: " + marca + " " + modelo + " com motor de " + motor.getPotencia() + " cavalos.");
        }
    }

    public static void main(String[] args) {
        Motor motor = new Motor(150); 
        Carro carro = new Carro("Toyota", "Corolla", motor);
        carro.exibirDetalhes();
    }
}
