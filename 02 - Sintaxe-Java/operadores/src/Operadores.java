public class Operadores {

    /*
    = -> atribuição
    + -> utilizado em váriavel texto, realizará a concatenação de textos
     */


    public static void main(String[] args) {
        String nomeCompleto = "JAVA" + "LINGUAGEM";
        System.out.println(nomeCompleto);
        String concatenacao = "?";

        concatenacao = 1+1+1+ "1";// 31 - >vira texto a partir das ""
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // 1111 -> ao somar o "" vira tudo texto
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; // vira tudo texto a partir das aspas
        System.out.println(concatenacao);

        concatenacao = "1"+ 1 + 1+1 ; // 1111 tudo texto
        System.out.println(concatenacao);

        concatenacao = "1" + (1+1+1); // vira texto, mas soma o parentese antes. Conforme norma matematica, resolve parenteses antes.
        System.out.println(concatenacao);





    }



}
