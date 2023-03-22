package Ex_01;

public class Calculadora {

    public int soma(int numero1,int numero2) {
        return  numero1 + numero2;

    }

    public int subtracao(int numero1,int numero2) {
        return  numero1 - numero2;

    }
    public int multiplicacao(int numero1,int numero2) {
        return  numero1 * numero2;

    }

    public double divisao(int numero1,int numero2) {
        return  (double) numero1 / numero2;

    }
    @Override
    public String toString() {
        return "Calculadora{}";
    }
}
