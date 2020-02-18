package com.unama;

public class Barco {
    String tipo;
    String caracteristicas;
    int passageiros;

    void tripulacao(double pessoas) {
        System.out.println("Há " +pessoas+ " pessoas navegando nesta canoa");
    }
    void distancia (double m){
        System.out.println("Em exatos " +m+ " metros da areia");
    }
}
