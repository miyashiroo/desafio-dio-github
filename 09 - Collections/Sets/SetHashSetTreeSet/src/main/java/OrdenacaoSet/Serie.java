package OrdenacaoSet;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String Genero;
    private int QtdEpisodio;

    public Serie(String nome, String genero, int qtdEpisodio) {
        this.nome = nome;
        Genero = genero;
        QtdEpisodio = qtdEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return Genero;
    }

    public int getQtdEpisodio() {
        return QtdEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", Genero='" + Genero + '\'' +
                ", QtdEpisodio=" + QtdEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return QtdEpisodio == serie.QtdEpisodio && Objects.equals(nome, serie.nome) && Objects.equals(Genero, serie.Genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, Genero, QtdEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getQtdEpisodio(), serie.getQtdEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());
    }



}