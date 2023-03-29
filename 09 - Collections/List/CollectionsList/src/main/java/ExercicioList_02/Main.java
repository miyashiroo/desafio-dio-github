package ExercicioList_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<String>();

        System.out.println("1 - Telefonou para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("2 - Esteve no local do crime?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("3 - Mora perto da vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("4 - Devia para a vítima?");
        respostas.add(scan.next().toLowerCase());
        System.out.println("5 - Já trabalhou com a vítima?");
        respostas.add(scan.next().toLowerCase());

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();

        int contador = 0;
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.contains("s")) {
                contador++;
            };

        }
        
        if (contador == 2) {
            System.out.println("Pessoa suspeita");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Cumplice");
        } else if (contador == 5) {
            System.out.println("assassina");
        } else {
            System.out.println("inocente");
        }


        System.out.println(contador);



    }
}
