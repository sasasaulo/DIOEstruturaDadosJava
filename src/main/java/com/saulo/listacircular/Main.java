package com.saulo.listacircular;

public class Main {

    public static void main(String[] args) {

        ListaCircular<String> minhaLista = new ListaCircular<>();

        System.out.println(minhaLista.toString());

        minhaLista.add("cir 1");
        minhaLista.add("cir 2");
        minhaLista.add("cir 3");
        minhaLista.add("cir 4");
        minhaLista.add("cir 5");
        minhaLista.add("cir 6");
        minhaLista.add("cir 7");

        System.out.println(minhaLista.toString());

        minhaLista.remove(5);

        System.out.println(minhaLista.toString());

        System.out.println(minhaLista.get(2));
        System.out.println(minhaLista.get(42));
        System.out.println("-----------------");

        for(int i = 0; i < 12; i++) {
            System.out.println(minhaLista.get(i));
        }

    }

}
