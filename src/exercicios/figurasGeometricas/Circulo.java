package exercicios.figurasGeometricas;

public class Circulo implements Forma{
    double diametro = 0;
    double pi = 3.14;

    public Circulo(double diametro){
        this.diametro = diametro;
    }

    public double calcularArea(){
        return pi * (diametro/2);

    }

    public String getNome(){
        return "Circulo";
    }
}
