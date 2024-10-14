import java.util.ArrayList;
import java.util.List;

// Classe Professor
class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}

// Classe Escola
class Escola {
    private String nome;
    private List<Professor> professores;

    public Escola(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarProfessores() {
        System.out.println("Professores da escola " + nome + ": " + professores);
    }
}

// Classe principal para executar o código
public class exe7 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        Professor professor1 = new Professor("Professor João");
        Professor professor2 = new Professor("Professor Maria");

        escola1.adicionarProfessor(professor1);
        escola1.adicionarProfessor(professor2);
        escola2.adicionarProfessor(professor1); // Professor João leciona em ambas as escolas

        escola1.listarProfessores();
        escola2.listarProfessores();
    }
}
