package com.saulo.listasencadeadas;

public class ListaEncadeada<T> {

    No<T> referenciaNoEntrada;

    public ListaEncadeada() {
        this.referenciaNoEntrada = null;
    }

    public boolean isEmpty() {
        return referenciaNoEntrada == null ? true : false;
    }

    public int size () {
        int tamanhoLista = 0;
        No<T> referenciaNoAuxiliar = referenciaNoEntrada;

        while (true) {
            if (referenciaNoAuxiliar != null) {
                tamanhoLista++;

                if(referenciaNoAuxiliar.getProximoNo() != null) {
                    referenciaNoAuxiliar = referenciaNoAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            referenciaNoEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaNoEntrada;

        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index) {

        validaIndice(index);
        No<T> noAuxiliar = referenciaNoEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    private void validaIndice(int index) {
        if(index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Tamanhõ máximo: " + ultimoIndice + ".");
        }
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noRemovido = this.getNo(index);

        if(index == 0) {
            referenciaNoEntrada = noRemovido.getProximoNo();
            return noRemovido.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noRemovido.getProximoNo());

        return noRemovido.getConteudo();
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = referenciaNoEntrada;

        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "[No{conteudo = " + noAuxiliar.getConteudo() + "}]---->>";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        stringRetorno += "null";

        return stringRetorno;
    }

}
