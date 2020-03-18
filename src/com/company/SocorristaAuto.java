package com.company;

public class SocorristaAuto {
    public String nombre;

    public void socorrer ( Auto unAuto){
        System.out.println("Socorriendo un auto, patente: "+ unAuto.getPatente());
    }
}
