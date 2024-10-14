abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}

class FuncionarioHorista extends Funcionario {
    private double valorPorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorPorHora, int horasTrabalhadas) {
        super(nome);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorPorHora * horasTrabalhadas;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class exe11 {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioHorista("Carlos", 20.0, 160);
        Funcionario f2 = new FuncionarioAssalariado("Ana", 3000.0);

        System.out.println("Salário de " + f1.nome + ": " + f1.calcularSalario());
        System.out.println("Salário de " + f2.nome + ": " + f2.calcularSalario());
    }
}
