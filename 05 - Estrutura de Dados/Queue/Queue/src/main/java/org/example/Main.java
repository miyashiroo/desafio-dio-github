package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("ford"));
        queueCarros.add(new Carro("hass"));
        queueCarros.add(new Carro("renault"));


        System.out.println(queueCarros);
        System.out.println(queueCarros.offer(new Carro("dale")));
        System.out.println(queueCarros);
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);



    }
}