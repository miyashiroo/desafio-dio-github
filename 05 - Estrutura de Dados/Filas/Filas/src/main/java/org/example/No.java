package org.example;

public class No<T> {
    private T object;
    private No<T> refno;


    public No(){


    }
    public No(T object){
        this.object = object;
        this.refno = null;

    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefno() {
        return refno;
    }

    public void setRefno(No refno) {
        this.refno = refno;
    }
}
