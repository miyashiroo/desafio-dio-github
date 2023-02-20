public class OperadorTernario {
    public static void main(String[] args) {
        // Como se fosse uma condição if normal, porém de uma forma em que toda a sua estrutura
        // estará escrita numa única linha

        // Representado pelos simbolos ?:

        // <Expressãoo condicional> ? <caso seja true> : <caso condição seja false>

        // Exemplo da estrura IF/ELSE
        int a,b;
        a = 5;
        b = 6;

        String resultado = "";


        if(a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println( resultado);

        a = 6;
        b = 6;

        resultado = a==b ? "verdadeiro": "falso";

        System.out.println(resultado);





    }
}
