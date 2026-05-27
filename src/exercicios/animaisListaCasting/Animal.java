package exercicios.animaisListaCasting;

public class Animal {
    String nome;
    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

}
