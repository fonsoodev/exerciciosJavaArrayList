package exercicios.figurasGeometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo(15);

        Quadrado quadrado1 = new Quadrado(10);

        ArrayList<Forma> listaDeFormas = new ArrayList<>();

        listaDeFormas.add(circulo1);
        listaDeFormas.add(quadrado1);

        for(Forma forma : listaDeFormas){
            System.out.println("Área do " + forma.getNome() + " é: " + forma.calcularArea());
        }


    }
}
