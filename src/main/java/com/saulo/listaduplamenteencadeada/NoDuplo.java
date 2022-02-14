package com.saulo.listaduplamenteencadeada;

public class NoDuplo<T> {

    private T contaudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    public NoDuplo(T contaudo) {
        this.contaudo = contaudo;
    }

    public T getContaudo() {
        return contaudo;
    }

    public void setContaudo(T contaudo) {
        this.contaudo = contaudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "contaudo=" + contaudo +
                '}';
    }
}
