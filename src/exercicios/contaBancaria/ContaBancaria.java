package exercicios.contaBancaria;

    public class ContaBancaria {
        private String numeroConta;
        private double saldo;

        public ContaBancaria(String numeroConta, double saldo) {
            this.numeroConta = numeroConta;
            this.saldo = saldo;
        }

        public String getNumeroConta() {
            return numeroConta;
        }

        public double getSaldo() {
            return saldo;
        }


        @Override
        public String toString() {
            return "Conta: " + numeroConta + " | Saldo: R$ " + String.format("%.2f", saldo);
        }
    }

