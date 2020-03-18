package com.company;

public class SocorristaMoto {
    public String nombre;

    public void socorrer ( Moto unaMoto){
        System.out.println("Socorriendo una moto, patente: "+ unaMoto.getPatente());
    }
}
