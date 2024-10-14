public class exe1 {
    private String marca;
    private String modelo;
    private int ano;

    // Carro
    public exe1(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    public static void main(String[] args) {
        exe1 carro1 = new exe1("Toyota", "Corolla", 2020);
        exe1 carro2 = new exe1("Honda", "Civic", 2018);
        exe1 carro3 = new exe1("Ford", "Mustang", 2022);

        carro1.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
    }
}
