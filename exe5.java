import java.util.ArrayList;

class Animal {
    public void som() {
        System.out.println("O animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("O gato mia: Miau!");
    }
}

public class exe5 {
    public static void emitirSomDosAnimais(ArrayList<Animal> animais) {
        for (Animal animal : animais) {
            animal.som();  
        }
    }

    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        emitirSomDosAnimais(animais);  
    }
}
