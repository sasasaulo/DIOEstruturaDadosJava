package com.saulo.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Ferrari"));
        listaCarros.add(new Carro("Chevrolet"));

        System.out.println(listaCarros.contains(new Carro("Fiat")));

        System.out.println(listaCarros.get(2));

        System.out.println(listaCarros.indexOf(new Carro("Ferrari")));
        System.out.println(listaCarros.indexOf(new Carro("Mustang")));

        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);





    }
}
