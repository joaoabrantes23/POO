public class exe12 {
    private String nome;
    private double preco;

    public exe12(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public exe12 somar(exe12 outro) {
        return new exe12(this.nome + " & " + outro.nome, this.preco + outro.preco);
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$" + String.format("%.2f", preco);
    }

    public static void main(String[] args) {
        exe12 produto1 = new exe12("Produto A", 10.50);
        exe12 produto2 = new exe12("Produto B", 15.75);

        exe12 produtoSoma = produto1.somar(produto2);
        System.out.println(produtoSoma);  
    }
}
