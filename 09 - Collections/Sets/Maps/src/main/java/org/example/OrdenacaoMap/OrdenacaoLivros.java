package org.example.OrdenacaoMap;

import java.util.*;

public class OrdenacaoLivros {
    public static void main(String[] args) {

        Map<String, Livros> meusLivros = new HashMap<>() {{
            put(" Keller, Tim", new Livros("Deuses Falsos", 300));
            put(" Lewis,CS", new Livros("As Cronicas de Narnia", 800));
            put(" Tolkien, JRR", new Livros("O Senhor dos Aneis: as Duas Torres", 400));

        }};

        for (Map.Entry<String, Livros> livro: meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome() + " -> " +
                    livro.getValue().getPaginas() + " Paginas");
        }

        System.out.println("Ordem de inserção: ");

        Map<String, Livros> meusLivrosOrdemInsersao = new LinkedHashMap<>() {{
            put(" Lewis,CS", new Livros("As Cronicas de Narnia", 800));
            put(" Keller, Tim", new Livros("Deuses Falsos", 300));
            put(" Tolkien, JRR", new Livros("O Senhor dos Aneis: as Duas Torres", 400));
        }};

        for (Map.Entry<String, Livros> livro : meusLivrosOrdemInsersao.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome() + " -> " +
                    livro.getValue().getPaginas() + " Paginas");
        }

        System.out.println("Ordem alfabetica dos autores");
        // Usa-se o TreMap pq vai trabalhar com a String
        Map<String, Livros> meusLivrosOrdemAlfabeticaAutores = new TreeMap<>(meusLivrosOrdemInsersao);

        for (Map.Entry<String, Livros> livro : meusLivrosOrdemAlfabeticaAutores.entrySet()) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome() + " -> " +
                    livro.getValue().getPaginas() + " Paginas");
        }
        // usa-se o tree set pq vai trabalhar com valor(No caso o valor do nome dentro de livros)
        System.out.println("Ordem alfabetica dos livros ");
        Set<Map.Entry<String,Livros>> meusLivrosOrdemNome = new TreeSet<>(new ComparatorLivro());
        meusLivrosOrdemNome.addAll(meusLivros.entrySet());
        System.out.println(meusLivrosOrdemNome);
        for (Map.Entry<String, Livros> livro : meusLivrosOrdemNome) {
            System.out.println(livro.getKey() + " -> " + livro.getValue().getNome() + " -> " +
                    livro.getValue().getPaginas() + " Paginas");
        }


    }






}
