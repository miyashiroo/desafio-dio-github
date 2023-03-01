package pilhas;

public class Pilha {

    private No refEntradaPilha;

    public Pilha(){
        this.refEntradaPilha = null;
    }

    public boolean isEmpty(){
        if (refEntradaPilha == null){
            return true;
        }
        return false;
    }

    public No top(){
        return refEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refEntradaPilha;
        refEntradaPilha = novoNo;

    }

}
