package com.saulo.filas;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println("Fila 1 - 4 -->>> " + minhaFila);

        //minhaFila.dequeue();

        minhaFila.enqueue("quinto");

        System.out.println("Fila dequeue -->> " + minhaFila.dequeue());

        System.out.println(minhaFila);

        System.out.println("Fila first -->>> " + minhaFila.first());
    }
}
