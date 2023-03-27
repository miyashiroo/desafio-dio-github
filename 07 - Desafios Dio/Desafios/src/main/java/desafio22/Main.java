package desafio22;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:

        for (int i = 0; i < 6; i++) {
            double verificar = Double.parseDouble(leitor.nextLine());
            if ( verificar > 0) {
                cont++;
                x += verificar;
            }


        }

        media = x / cont ;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }

}