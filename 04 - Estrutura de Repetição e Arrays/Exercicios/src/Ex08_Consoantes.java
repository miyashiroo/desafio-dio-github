import java.util.Scanner;

public class Ex08_Consoantes {
    /*
   Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.

     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int totalConsoantes = 0;
        int contador = 0;

        do {
            System.out.println("Digite a letra requerida: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
            )) {
                consoantes[contador] = letra;
                totalConsoantes++;
            }
            contador++;


        } while (contador < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante: consoantes) {
            if (consoante != null){
                System.out.print( consoante + " ");
            }
        }

        System.out.println("Quantidade de consoante : " + totalConsoantes);
        System.out.println(consoantes.length);


    }
}
