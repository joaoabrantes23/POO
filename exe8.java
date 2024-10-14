import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$ " + salario;
    }
}

class Empresa {
    private String nome;
    private List<Empregado> empregados;

    public Empresa(String nome) {
        this.nome = nome;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        System.out.println("Empregados da empresa " + nome + ":");
        for (Empregado empregado : empregados) {
            System.out.println(empregado);
        }
    }
}

public class exe8 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("JVA Solutions");

        Empregado emp1 = new Empregado("João Silva", "Desenvolvedor", 5000);
        Empregado emp2 = new Empregado("Maria Oliveira", "Gerente", 8000);
        
        empresa.adicionarEmpregado(emp1);
        empresa.adicionarEmpregado(emp2);

        empresa.listarEmpregados();
    }
}
