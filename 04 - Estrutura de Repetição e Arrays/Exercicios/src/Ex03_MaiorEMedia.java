import java.util.Scanner;

public class Ex03_MaiorEMedia {

    /*
    Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números.


     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int contadorNumero = 0;
        int maiorNumero = 0;
        int somaNumeros = 0;

        do {
            System.out.println("Digite um numero: ");
            int numeroTemporario = scan.nextInt();;
            if(numeroTemporario > maiorNumero){
                maiorNumero = numeroTemporario;
            }
            somaNumeros = somaNumeros + numeroTemporario;
            contadorNumero++;



        } while (contadorNumero < 5);

        System.out.println("O maior numero é o : " + maiorNumero);
        System.out.println("A média dos numeros é " + (somaNumeros/5));

    }
}
