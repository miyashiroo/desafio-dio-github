package ExercicioProposto_01;

import OrdenacaoSet.Serie;

import java.util.*;

public class Main {
    /*
        Crie uma conjunto contendo as cores do arco-íris e:
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
     */
    public static void main(String[] args) {
        Set<String> arcoIrises = new HashSet<>(Arrays.asList("vermelho","amarelo","laranja","verde", "azul", "indigo",
                "violeta"));
        System.out.println(arcoIrises);

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cor: arcoIrises
             ) {
            System.out.println(cor);

        }
        System.out.println("A quantidade de cores que o arco-íris tem: " + arcoIrises.size() );

        System.out.println("c) Exiba as cores em ordem alfabética;");
        Set<String> arcoIrises2 = new TreeSet<>();
        arcoIrises2.addAll(arcoIrises);
        for (String cor: arcoIrises2
        ) {
            System.out.println(cor);

        }
        System.out.println(" -----------------  ");
        System.out.println("d) Exiba as cores na ordem inversa da que foi informada;");
        Set<String> arcoIrisLinked = new LinkedHashSet<>(arcoIrises2);


        ArrayList<String> listaOrdem = new ArrayList<String>(arcoIrisLinked);
        System.out.println("Ordem Normal: ");
        for (String cor: listaOrdem
        ) {
            System.out.println(cor);

        }

        Collections.reverse(listaOrdem);
        System.out.println(" -----------------  ");
        System.out.println("Ordem Reversa: ");
        for (String cor: listaOrdem
        ) {
            System.out.println(cor);

        }




    }
}
