package exercicios.listaPessoas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nome1 = "Afonso";
        String nome2 = "Joséfino";
        String nome3 = "Tobias";
        String nome4 = "Ricardo";
        String nome5 = "Pica Pau";

        ArrayList<String> listaPessoas = new ArrayList<>();
        listaPessoas.add(nome1);
        listaPessoas.add(nome2);
        listaPessoas.add(nome3);
        listaPessoas.add(nome4);
        listaPessoas.add(nome5);

        for (String pessoa : listaPessoas){
            System.out.println(pessoa);
        }

    }
}
