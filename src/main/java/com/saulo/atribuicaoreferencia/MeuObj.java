package com.saulo.atribuicaoreferencia;

public class MeuObj {

    private Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MeuObj{" +
                "num=" + num +
                '}';
    }

    public MeuObj(Integer num) {
        this.num = num;
    }
}
