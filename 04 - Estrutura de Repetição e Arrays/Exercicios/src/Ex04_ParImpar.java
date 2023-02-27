import java.util.Scanner;

public class Ex04_ParImpar {

    /*
        Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e
        a quantidade de números impares.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int quantidadeNumeroPar = 0;
        int quantidadeNumeroImpar = 0;
        int contadorNumeros = 0;
        System.out.println("Digite a quantidade que vc quer calcular: ");
        quantidadeNumeros = scan.nextInt();


        do {
            System.out.println("Digite o numero para ver se é impar ou par:");
            int numeroParaVerificar = scan.nextInt();
            int parOuImpar = numeroParaVerificar % 2;

            if (parOuImpar == 0 ){
                quantidadeNumeroPar++;
            } else {
                quantidadeNumeroImpar++;
            }

            contadorNumeros++;


        }while(quantidadeNumeros != contadorNumeros);

        System.out.println("A quantidade de numero par é: " + quantidadeNumeroPar);
        System.out.println("A quantidade de numero impar é: " + quantidadeNumeroImpar);


    }

}
