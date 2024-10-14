public class exe3 {
    private String titular;
    private double saldo;

    public exe3(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        exe3 conta = new exe3("Maria", 1000);

        conta.depositar(500);
        conta.sacar(300);
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }
}
