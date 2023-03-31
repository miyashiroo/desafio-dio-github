package MetodosSets;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Criando um conjunto e adicionando as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,7.5,4d,8d,9d,10d,10d,0d)); // não repete elementos.
        System.out.println(notas);

        System.out.println("Exibindo a posição de 10d");
        // não possui a posição no metodo set. Não tem como adicionar tal nota a posição e nem substituir uma nota pela
        // outra. Não possui metodo get.

        System.out.println("Conferir se um elemento está contido na lista => " + notas.contains(4d));

        System.out.println("Exibir a menor nota: " + Collections.min(notas));
        System.out.println("Exibir a maior nota: "+ Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()){
            Double next = iterator.next();
            soma+= next;
        }
        System.out.println("Exibindo a soma: " + soma);
        System.out.println("Exibindo a media: " + soma / notas.size());

        System.out.println("Removendo elmentos: ");
        notas.remove(0d);
        System.out.println(notas);

        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7){
                iterator1.remove();
            }
        }

        System.out.println(notas);

        System.out.println("Eixibindo todas as notas na ordem que foram informados: ");
        // o metodo set não suporta isto, para fazer isso precisamos fazer uma LinkedHashSet.
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,7.5,4d,8d,9d,10d,10d,0d));
        System.out.println(notas2);

        System.out.println("Exibir as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);






    }
}
