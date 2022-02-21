package com.saulo.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Fiat"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(listaCarros.contains(new Carro("Renault")));


        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        System.out.println(new Carro("Fordao").hashCode());

        Carro carro1 = new Carro("Renault");
        Carro carro2 = new Carro("Ferrari");
        Carro carro3 = new Carro("Renault");

        System.out.println("1 = 2 --> " + carro1.equals(carro2));
        System.out.println("1 = 3 --> " + carro1.equals(carro3));


    }
}
