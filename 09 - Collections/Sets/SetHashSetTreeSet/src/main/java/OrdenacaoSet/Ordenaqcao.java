package OrdenacaoSet;

import java.util.*;

public class Ordenaqcao {
    public static void main(String[] args) {
        System.out.println("Ordem Aleatoria: ");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 55));
            add(new Serie("The Wire", "policial", 70));
            add(new Serie("Naruto", "anime", 55));
        }};

        for (Serie serie: minhasSeries ) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getQtdEpisodio());

        }


        System.out.println("Ordem de inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 55));
            add(new Serie("The Wire", "policial", 70));
            add(new Serie("Naruto", "anime", 55));
        }};

        for (Serie serie: minhasSeries1 ) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getQtdEpisodio());

        }

        System.out.println( "Ordem natural(Tempo Episodio)");
        Set<Serie> minhasseries2 = new TreeSet<>(minhasSeries);
        for (Serie serie: minhasseries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getQtdEpisodio());

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Ordem nome/genero/ QtdEpisodio");

        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroQtdEpisodios());
        minhasSeries3. add(new Serie("Naruto", "fantasia", 55));
        minhasSeries3.add(new Serie("Got", "policial", 55));
        minhasSeries3.add(new Serie("The Wire", "policial", 70));


        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getQtdEpisodio());

        }








    }
}


