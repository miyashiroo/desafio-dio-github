package br.com.shiro.atribuicoesReferencias;

public class Main {
    public static void main(String[] args) {

       /*
        As atribuições em Java são por cópia de valor sempre;
        Com tipo primitivo copiamos o valor em memória
        Com objetos copiamos o valor da referencia em memória, sem duplicar o objeto.
        */
        // Exemplos:


        int intA= 1;
        int intB = intA;

        System.out.println(" intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println(" intA = " + intA + " intB = " + intB);

        meuObj objA = new meuObj(1);
        meuObj objB = objA;

        System.out.println("objA = " + objA + " objB= " + objB );
        objA.setNum(3);
        System.out.println("objA = " + objA + " objB= " + objB );
        // O java quando trata de atribuição de tipos primitivos copia exatamente o valor, já em objetos ele copia a
        // referencia






    }
}
