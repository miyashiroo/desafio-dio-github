package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProgramaIntellij {
    public static void main(String[] args) {
/*        int a  = 5;
        int b = 3;

        System.out.println("Hello World Galere!" + (a+b));
    }*/
        Gato gato = new Gato();
        Livro livro = new Livro("Algoritmos iniciante", 300);
        System.out.println(livro);
        System.out.println(gato);
    }
}

class Livro {
    private String nome;
    private Integer numPaginas;

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}
