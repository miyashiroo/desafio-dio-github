package set;

import org.example.Carro;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> setCarros = new HashSet<>();

        setCarros.add(new Carro("renault"));
        setCarros.add(new Carro("red bull"));
        setCarros.add(new Carro("hass"));
        setCarros.add(new Carro("honda"));

        System.out.println(setCarros);

        Set<Carro> treeSetCarro= new TreeSet<>();
        treeSetCarro.add(new Carro("renault"));
        treeSetCarro.add(new Carro("mclarendsds"));
        treeSetCarro.add(new Carro("frod"));
        treeSetCarro.add(new Carro("toyota"));

        System.out.println(treeSetCarro);


    }
}
