package Desafio_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int PercentualImpostos = scan.nextInt();

        double custoConsumidor;

        double Distribuidor;
        double ValorImpostos;

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = PercentualImpostos * custoFabrica / 100;
        custoConsumidor = Distribuidor + ValorImpostos + custoFabrica;

        System.out.println(custoConsumidor);
    }
    
}
