package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("chevro"));
        listaCarros.add(new Carro("force india"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford2").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Mercedes");
        Carro carro2 = new Carro("Mclaren");

        System.out.println(carro1.equals(carro2));

    }
}