import java.util.Scanner;

public class Ex06_Fatorial {
    /*
    Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
    Ex.: 5!=5.4.3.2.1=120


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero a ser fatorado: ");
        int numeroFatorial = scan.nextInt();
        int numeroFatoradoTotal = 1;

        for (int i = numeroFatorial; i > 0 ; i--){
            numeroFatoradoTotal =  numeroFatoradoTotal * i;

        }
        System.out.println("O resultado do fatorial de " + numeroFatorial + "!  será : " + numeroFatoradoTotal);
    }
}
