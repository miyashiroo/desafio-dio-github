package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();
        stackCarros.push(new Carro("mercedes"));
        stackCarros.push(new Carro("Renault"));
        stackCarros.push(new Carro("Hass"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek());

        System.out.println(stackCarros.isEmpty());

    }
}