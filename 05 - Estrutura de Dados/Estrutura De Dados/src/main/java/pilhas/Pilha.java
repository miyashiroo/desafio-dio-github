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

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getRefNo();
            return noPoped;

        }
        return null;

    }
    public No top(){
        return refEntradaPilha;
    }

    public void push(No novoNo){
        No refAuxiliar = refEntradaPilha;
        refEntradaPilha = novoNo;
        refEntradaPilha.setRefNo(refAuxiliar);

    }

    @Override
    public String toString(){

        String stringRetorno = "--------- \n";
        stringRetorno += "       Pilha \n";
        stringRetorno+= " ------------- \n ";

        No noAuxiliar = refEntradaPilha;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "No {dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else {
                break;
            }

        }
        stringRetorno += "================\n";
        return stringRetorno;
    }



}
