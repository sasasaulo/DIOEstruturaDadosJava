package com.saulo.listasencadeadas;

public class No<T> {

    private T conteudo;
    private No proximoNo;

    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.proximoNo = proximoNo;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                ", proximoNo=" + proximoNo +
                '}';
    }

    public String toStringEncadeado() {
        String stringRetorno = "";

        stringRetorno += "No{" +
                "conteudo=" + conteudo +
                ", proximoNo=" + proximoNo +
                '}';

        if(proximoNo != null) {
            stringRetorno += "-->" + proximoNo.toString();
        } else {
            stringRetorno += "--> null";
        }

        return stringRetorno;
    }
}
