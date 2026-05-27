package exercicios.mediaProdutos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produtos produtobarato = new Produtos("Salgadinho",1);
        Produtos produtocaro = new Produtos("Chocolate",20);
        Produtos produtoBom = new Produtos("Fubá de Milho",3);

        ArrayList<Produtos> listaCompras = new ArrayList<>();

        listaCompras.add(produtobarato);
        listaCompras.add(produtocaro);
        listaCompras.add(produtoBom);

        double valorTotal = 0;

        for (Produtos itemDaLista : listaCompras) {
            System.out.println(itemDaLista);
            valorTotal += itemDaLista.getPreco();
        }

        System.out.println("Média dos Preços: " + valorTotal /listaCompras.size());
    }
}
