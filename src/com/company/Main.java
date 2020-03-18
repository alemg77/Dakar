package com.company;

public class Main {

    public static void main(String[] args) {

        Carrera unaCarrera = new Carrera(200.0,15.1,"Monte Chingolo",3);

        unaCarrera.darDeAltaAuto(10.0,10.0,10.0,"AAAAA");
        unaCarrera.darDeAltaAuto(20.0,10.0,10.0,"bbbbb");
        unaCarrera.darDeAltaAuto(15.0,10.0,10.0,"ccccc");


        unaCarrera.calcularGanador();

    }
}
