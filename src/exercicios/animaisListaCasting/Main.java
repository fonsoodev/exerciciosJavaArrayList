package exercicios.animaisListaCasting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("João");
        Cachorro cachorro2 = new Cachorro("Bolt");
        Cachorro cachorro3 = new Cachorro("Tobias");
        Cachorro cachorro4 = new Cachorro("Bob covardi");
        Cachorro cachorro5 = new Cachorro("Caramelo");
        Girafa girafadoida = new Girafa("Melman");

        // Animal boltAtor = (Animal) cachorro2;

        //Aqui eu crio uma referência de um boltAtor e falo pro java que agora ele é um (ANIMAL qualquer)
        // então o java não deixa ele latir, pois se uma girafa, ela não late, isso quebraria o código.

        // System.out.println(boltAtor.latir();
        //Ele nem reconhece o método! e nem compila, pois a classe animal não tem o método latir

        // Cachorro boltDeVoltaPraCasa = (Cachorro) boltAtor;
        // Aqui eu falo para ele que o boltDeVolta vai receber o boltAtor (aqui eu digo que é pra enxergar como Cachorro de novo)
        // O java deixa ele latir
        // System.out.println("Ele sabe latir? : " + boltDeVoltaPraCasa.latir());

        ArrayList<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(cachorro1);
        listaDeAnimais.add(cachorro2);
        listaDeAnimais.add(cachorro3);
        listaDeAnimais.add(cachorro4);
        listaDeAnimais.add(cachorro5);
        listaDeAnimais.add(girafadoida);

        for(Animal animal : listaDeAnimais) {
            System.out.println("Proximo animal: " + animal);

            if (animal instanceof Cachorro cachorroDeVerdade){
                System.out.println("Sei latir: "+ cachorroDeVerdade.latir());
            } else {
                System.out.println(animal + " é qualquer coisa menos um cachorro...");
            }

        }


    }
}
