package com.saulo.filas;

public class Fila<T> {

    private No<T> referenciaNoEntrada;

    public Fila() {
        this.referenciaNoEntrada = null;
    }

    public boolean isEmpty() {
        return referenciaNoEntrada == null ? true : false;
    }

    public void enqueue (T obj) {
        No novoNo = new No(obj);
        novoNo.setReferenciaNo(referenciaNoEntrada);
        referenciaNoEntrada = novoNo;
    }

// Antes de refatorar
//    public void enqueue (No novoNo) {
//        novoNo.setReferenciaNo(referenciaNoEntrada);
//        referenciaNoEntrada = novoNo;
//    }

    public T first() {

        if(!this.isEmpty()) {
            No primeiroNo = referenciaNoEntrada;
            while (true) {
                if(primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public T dequeue() {

        if(!this.isEmpty()) {
            No primeiroNo = referenciaNoEntrada;
            No noAuxiliar = referenciaNoEntrada;

            while (true) {
                if(primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null);
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
        No noAuxiliar = referenciaNoEntrada;

        if(referenciaNoEntrada != null) {
            while (true) {
                stringRetorno += "[No{objeto = "+ noAuxiliar.getObject() + "}]--->";

                if(noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
