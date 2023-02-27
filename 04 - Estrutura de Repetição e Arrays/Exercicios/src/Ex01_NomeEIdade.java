import java.util.Scanner;

public class Ex01_NomeEIdade {
    /*
    Nome e Idade: Faça um programa que leia conjuntos de dois valores,
    o primeiro representando o nome do aluno e o segundo representando a sua idade.
    (Pare o programa inserindo o valor 0 no campo nome)
     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        boolean c = true;
        while (c){

            System.out.println("Digite o seu nome: ");
            nome = scan.next();
            if (nome.equals("0")) { // tem que usar o equals porque string é um objeto
                System.out.println("Programa encerrado");
                break;
            }
            System.out.println("Fala sua idade: ");
            idade = scan.nextInt();
            System.out.println("Vc é o: " + nome + " e tem " + idade + " anos");
            System.out.println("Vamos começar de novo. ");




        }


    }

    }


