public class exe15 {

    static class SaldoInsuficienteException extends Exception {
        public SaldoInsuficienteException(String mensagem) {
            super(mensagem);
        }
    }

    static class ContaBancaria {
        private String titular;
        private double saldo;

        public ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        public void depositar(double valor) {
            saldo += valor;
            System.out.printf("Depósito de R$%.2f realizado. Saldo atual: R$%.2f%n", valor, saldo);
        }

        public void sacar(double valor) throws SaldoInsuficienteException {
            if (valor > saldo) {
                throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
            }
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado. Saldo atual: R$%.2f%n", valor, saldo);
        }

        public double obterSaldo() {
            return saldo;
        }

        public String obterTitular() {
            return titular; // Método que retorna o titular da conta
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        System.out.printf("Titular da conta: %s%n", conta.obterTitular()); // Exibe o titular da conta

        try {
            conta.sacar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage()); // Exibe a mensagem da exceção
        }
    }
}
