public class exe14 {
    private static exe14 instancia;

    private String variavel;

    private exe14() {
        variavel = "Valor da Configuração";
    }

    public static exe14 getInstancia() {
        if (instancia == null) {
            instancia = new exe14();
        }
        return instancia;
    }

    public String getVariavel() {
        return variavel;
    }

    public static void main(String[] args) {
        exe14 config1 = exe14.getInstancia();
        exe14 config2 = exe14.getInstancia();

        System.out.println("Configuração 1: " + config1.getVariavel());
        System.out.println("Configuração 2: " + config2.getVariavel());
        System.out.println("As instâncias são iguais? " + (config1 == config2)); 
    }
}
