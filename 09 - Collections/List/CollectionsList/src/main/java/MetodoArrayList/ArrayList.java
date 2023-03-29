package MetodoArrayList;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<Double> notas = new java.util.ArrayList<Double>();
        notas.add(7d);
        notas.add(5d);
        notas.add(7.5);
        notas.add(4d);
        notas.add(3d);
        notas.add(10d);
        notas.add(8d);
        System.out.println(notas);

        System.out.println("Exiba a posição da nota 5 -> " + notas.indexOf(5d));
        System.out.println("Adiciona a Lista a nota 8.0 na posição 4 : ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        notas.set(notas.indexOf(5d),11d );
        System.out.println(notas);

//        System.out.println("Confira se a nota 5 está na lista ?? "+ notas.contains(5d));
//
//        for (Double nota: notas) {
//            System.out.println(nota);
//
//        }
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("exiba a menor nota: " + Collections.min(notas));
        System.out.println("exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();

        double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exibir a media das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 3");
        notas.remove(3d);
        System.out.println(notas);


        System.out.println("Remova a posicao 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            double next = iterator1.next();
            if (next < 7d) iterator1.remove();
        }


        System.out.println(notas);

        notas.clear();
        System.out.println(notas);

        System.out.println(notas.isEmpty());




    }
}
