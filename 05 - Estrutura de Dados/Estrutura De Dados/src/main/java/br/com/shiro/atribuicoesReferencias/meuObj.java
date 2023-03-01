package br.com.shiro.atribuicoesReferencias;

public class meuObj {
    Integer num;

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

    public meuObj(Integer num) {
        this.num = num;
    }
}
