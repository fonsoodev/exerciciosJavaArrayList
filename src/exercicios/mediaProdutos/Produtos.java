package exercicios.mediaProdutos;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " R$: " + preco;
    }

    public double getPreco() {
        return preco;
    }
}
