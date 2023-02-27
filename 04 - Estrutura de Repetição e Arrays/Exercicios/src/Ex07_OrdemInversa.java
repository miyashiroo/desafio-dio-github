import java.util.Arrays;
import java.util.Scanner;

public class Ex07_OrdemInversa {
    /*
    rdem Inversa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de posições que quer no vetor: ");

        int vetor[] = new int[scan.nextInt()];


        for (int i = 0; i < vetor.length; i++){ // tem que ser < pq se for <= o vetor começa do 0 aí vai ultrapassar a contagem do tamanho do vetor
            System.out.println("Digite o numero inteiro que vai na posição [" + i + "] do array");
            vetor[i] = scan.nextInt();
        }

        System.out.println("O array digitado foi: " + Arrays.toString(vetor));
        int arrayInverso[] = new int[vetor.length];
        int contadorInverso = vetor.length -1;

        for (int i = 0; i < vetor.length ;i++) {
            arrayInverso[i] = vetor[contadorInverso];
            contadorInverso--;

        }
        System.out.println("O array inverso é: " + Arrays.toString(arrayInverso));

    }
}
