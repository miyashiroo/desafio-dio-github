public class MinhaClasse {
    public static void main(String[] args) {


    String nome = nomeCompleto("shiro", "san");
        System.out.println(nome);
    }
    public static String nomeCompleto(String primeiroNome,String segundoNome){
        return "Resultado do metodo é : " + primeiroNome.concat(" De ").concat(segundoNome);
    }
}
