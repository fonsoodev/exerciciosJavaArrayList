package exercicios.contaBancaria;
import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {

            ContaBancaria c1 = new ContaBancaria("777", 1500.50);
            ContaBancaria c2 = new ContaBancaria("666", 5300.00);
            ContaBancaria c3 = new ContaBancaria("222", 250.25);
            ContaBancaria c4 = new ContaBancaria("6767", 7100.90);

            ArrayList<ContaBancaria> listaContas = new ArrayList<>();
            listaContas.add(c1);
            listaContas.add(c2);
            listaContas.add(c3);
            listaContas.add(c4);

            // O PULO DO GATO Começamos assumindo que a primeira conta da lista é a maior de todas
            ContaBancaria contaMaiorSaldo = listaContas.get(0);

            // aqui é nossa esteira que vem trazendo os objetos, se qualquer outra for maior, ele imprime a outra
            // sem repetição de código, a lógica tá melhorando
            for (ContaBancaria contaAtual : listaContas) {

                if (contaAtual.getSaldo() > contaMaiorSaldo.getSaldo()) {
                    contaMaiorSaldo = contaAtual;
                }
                //A cada loop vai pegando a conta mais alta, e dando o resultado para contaMaiorSalario até o final, quando chegar no ultimo loop,
                // a maior sempre vai estar lá, pois se for menor, o loop pula fora
            }


            System.out.println("CONTA DO BANCO: ");
            System.out.println("A conta com o maior saldo encontrada foi:");
            System.out.println(contaMaiorSaldo);
            // aqui a gente imprime o objeto por conta do toString lá na classe ContaBancaria
    }
}
