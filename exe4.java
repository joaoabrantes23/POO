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

public class exe4 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.som();  
        gato.som();  
    }
}
