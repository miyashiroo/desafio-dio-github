package Desafio_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double h = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            h += 1.0/ i;
        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
    }
}
