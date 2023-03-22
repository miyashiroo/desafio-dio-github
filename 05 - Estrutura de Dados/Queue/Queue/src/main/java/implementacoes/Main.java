package implementacoes;

import org.example.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarro = new ArrayList<>();

        listCarro.add(new Carro("renault"));
        listCarro.add(new Carro("ferrari"));
        listCarro.add(new Carro("force india"));
        listCarro.add(new Carro("hass"));

        System.out.println(listCarro.contains(new Carro("hass")));
        System.out.println(listCarro);

        System.out.println(listCarro.get(2));

    }

}
