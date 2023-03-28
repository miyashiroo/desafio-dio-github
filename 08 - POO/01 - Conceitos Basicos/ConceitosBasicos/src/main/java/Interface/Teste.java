package Interface;

public class Teste implements Operacoes{

    @Override
    public int adicao(int numero1, int numero2) {

        return numero1 + numero2;
    }

    @Override
    public int subtracao(int numero1, int numero2) {
        return 0;
    }

    @Override
    public int multiplicacao() {
        return 0;
    }

    @Override
    public double divisao() {
        return 0;
    }
}
