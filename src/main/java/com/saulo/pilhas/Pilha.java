package com.saulo.pilhas;

public class Pilha {

    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    public boolean isEmpty() {
        return referenciaNoEntradaPilha == null ? true : false;
    }

    public No top() {
        return referenciaNoEntradaPilha;
    }

    public void push(No novoNo) {
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        //return "Pilha{" + "referenciaNoEntradaPilha=" + referenciaNoEntradaPilha + '}'; }

        String stringRetorno = "----------\n";
        stringRetorno += "|   Pilha    |\n";
        stringRetorno += "----------\n";

        No noAuxiliar = referenciaNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }

        stringRetorno += "----------\n";
        stringRetorno += "   Fim    \n";
        stringRetorno += "----------\n";

        return stringRetorno;
    }
}
