package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroAppJava {

	public static void main(String[] args) {

		Gato gato = new Gato(null, null, null);
		System.out.println(gato);

		Livros livros = new Livros();

		System.out.println(livros);

	}

}

class Livros {
	private String nome;
	private String npag;
}
