package Desafio_02;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    //Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se
    // mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
    //
    //Entrada
    //A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto flutuante ( float ou double ).
    // Pelo menos um destes números será positivo.
    //
    //Saída
    //O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos
    // valores positivos digitados.
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 7; i++) {

            double verificar = Double.parseDouble(leitor.nextLine());

            if (verificar > 0){
                cont++;
                x += verificar;

            }



        }

        media = x / cont  ;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }



}
