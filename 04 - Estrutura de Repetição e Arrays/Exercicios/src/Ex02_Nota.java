import java.util.Scanner;

public class Ex02_Nota {
    /*
  Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue
  pedindo até que o usuário informe um valor válido.


    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;

        while (true) {
            System.out.println("digite sua nota com numeros de 0 a 10: ");
            nota = scan.nextInt();
            if (nota < 11 && nota > -1) {
                System.out.println("Valeu! Sua nota é :" + nota);

                break;
            }


        }


    }
}
