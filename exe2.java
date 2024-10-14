public class exe2 {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public exe2(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0; 
    }

    public void acelerar(int incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando... Velocidade atual: " + this.velocidade + " km/h");
    }

    public void frear(int decremento) {
        this.velocidade -= decremento;
        if (this.velocidade < 0) {
            this.velocidade = 0; 
        }
        System.out.println("Freando... Velocidade atual: " + this.velocidade + " km/h");
    }

    public void exibirVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    public static void main(String[] args) {

        exe2 carro = new exe2("Toyota", "Corolla", 2020);

        carro.acelerar(50); 
        carro.frear(20);     
        carro.exibirVelocidade(); 
    }
}
