package org.example;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");

        System.out.println(minhaListaCircular);
        minhaListaCircular.add("c3");

        System.out.println(minhaListaCircular);

        System.out.println(minhaListaCircular.get(0));
        System.out.println(minhaListaCircular.get(1));
        System.out.println(minhaListaCircular.get(2));
        System.out.println(minhaListaCircular.get(6));

    }
}