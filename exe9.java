interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    private String conteudo;

    public Relatorio(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Relatório: " + conteudo);
    }
}

class Contrato implements Imprimivel {
    private String detalhes;

    public Contrato(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Contrato: " + detalhes);
    }
}

public class exe9 {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio("Relatório de Vendas 2024");
        Imprimivel contrato = new Contrato("Contrato de Prestação de Serviços");

        relatorio.imprimir();
        contrato.imprimir();
    }
}
