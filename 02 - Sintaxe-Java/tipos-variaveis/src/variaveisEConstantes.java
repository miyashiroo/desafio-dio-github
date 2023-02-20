public class variaveisEConstantes {

    /*
    No Java as contantes são sinalizadas com a descrição : final

    por convenção a constante é escrita em CAIXA ALTA
    Ela não pode ser modificada
     */

    public static void main(String[] args) {
        // assim será alterado:
        double VALOR_DE_PI = 3.14;
        VALOR_DE_PI = 56;
        System.out.println(VALOR_DE_PI);

        // assim não será mais alterável:
        final double VALOR_DE_PI_REAL = 3.14;
        // VALOR_DE_PI_REAL = 2.3; vai dar erro

    }
}
