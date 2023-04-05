package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1","0","4", "1", "2", "3", "9", "9", "6","5");

        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um set: ");

        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println); // set não repete elementos.

        System.out.println("Transforme esta de lista de string em uma lista de inteiros: ");
        List<Integer> collect = numerosAleatorios.stream().map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
        List<Integer> numerosPareseMaiorQueDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .collect(Collectors.toList());

        System.out.println(numerosPareseMaiorQueDois);

        System.out.println("mostre a média dos numeros");
        numerosAleatorios.stream().mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remover os numeros pares: ");
        System.out.println(collect);
        collect.removeIf(integer -> (integer % 2 != 0));
        System.out.println(collect);

        numerosAleatorios.

    }
}