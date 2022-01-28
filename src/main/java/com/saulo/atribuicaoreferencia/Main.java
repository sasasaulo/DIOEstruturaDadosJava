package com.saulo.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        System.out.println("intA = " + intA + " --- intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " --- intB = " + intB);

        MeuObj objA = new MeuObj(3);
        MeuObj objB = objA;

        System.out.println(objA);
        System.out.println(objB);

        objA.setNum(4);

        System.out.println(objA);
        System.out.println(objB);

    }
}
