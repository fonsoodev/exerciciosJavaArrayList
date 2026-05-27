package exercicios.figurasGeometricas;

public class Quadrado implements Forma{

    double altura;
    public Quadrado(double tamanho){
        this.altura = tamanho;
    }

    public double calcularArea(){
        return altura*altura;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }


}
