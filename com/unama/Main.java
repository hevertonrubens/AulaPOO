package com.unama;

public class Main {


    public static void main(String[] args) {
        crianca c1 = new crianca();
        crianca c2;
        c1.corCabelo = "ruivo";
        c1.altura = 1.20;
        c1.idade = 5;
        System.out.println(c1.corCabelo);
        System.out.println(c1.altura);
        System.out.println(c1.idade);
        c1.correr(2.1);
        c1.nadar(0.87);
        System.out.println(c1.sorrir());
        Barco b1 = new Barco();
        b1.tipo = "canoa";
        b1.caracteristicas = "pescadores";
        b1.tripulacao(2);
        b1.distancia(2.25);
    }
}