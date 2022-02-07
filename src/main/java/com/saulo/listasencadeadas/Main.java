package com.saulo.listasencadeadas;

public class Main {

    public static void main(String[] args) {

        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("conteúdo 1");
        minhaListaEncadeada.add("conteúdo 2");
        minhaListaEncadeada.add("conteúdo 3");
        minhaListaEncadeada.add("conteúdo 4");

        System.out.println("Lista inteira --> " + minhaListaEncadeada);

        System.out.println("Índice 0 --> " + minhaListaEncadeada.get(0));
        System.out.println("Índice 1 --> " + minhaListaEncadeada.get(1));
        System.out.println("Índice 2 --> " + minhaListaEncadeada.get(2));
        System.out.println("Índice 3 --> " + minhaListaEncadeada.get(3));

        System.out.println("Removendo: " + minhaListaEncadeada.remove(3));

        System.out.println("Lista inteira --> " + minhaListaEncadeada);

    }

}
