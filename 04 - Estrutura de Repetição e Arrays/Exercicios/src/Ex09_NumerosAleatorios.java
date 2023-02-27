import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex09_NumerosAleatorios {

    /*
    Números Aleatórios: Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
    Ao final, mostre os números e seus sucessores.


     */

    public static void main(String[] args) {

        Random random = new Random();

        int vetor[] = new int[20];
        int vetorSucessores[] = new int[20];

        for (int i = 0; i < vetor.length; i++){
            int numeroAleatorio = random.nextInt(100);
            vetor[i] = numeroAleatorio;
            vetorSucessores[i] = numeroAleatorio + 1;


        }

        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(vetorSucessores));
    }
}
