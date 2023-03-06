package org.example;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setRefno(refNoEntradaFila);
        refNoEntradaFila = novoNo;


    }

    public T first() {
        if (!isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    primeiroNo = primeiroNo.getRefno();

                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true) {
                if (primeiroNo.getRefno() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefno();

                } else {
                    noAuxiliar.setRefno(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto =" + noAuxiliar.getObject() + "}] ---->";

                if (noAuxiliar.getRefno() != null){
                    noAuxiliar = noAuxiliar.getRefno();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
