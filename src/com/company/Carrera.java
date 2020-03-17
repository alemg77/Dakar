package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Double distancia;
    private Double premioeEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;

    private


    public Carrera(Double distancia, Double premioeEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos, List<Vehiculo> listaDeVehiculos) {
        this.distancia = distancia;
        this.premioeEnDolares = premioeEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void darDeAltaAuto(Integer velocidad, Integer aceleracion, Integer anguloDeGiro, String patente) {
        if (cantidadDeVehiculosPermitidos > listaDeVehiculos.size()) {
            Vehiculo unAutoNuevo = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(unAutoNuevo);
            System.out.println("Bienvenido a la carrera!");
        } else {
            System.out.println("No hay mas lugar");
        }
    }

    public void eliminarVehiculo(String patente) {
        for (int i = 0; i < listaDeVehiculos.size(); i++) {
            if (listaDeVehiculos.get(i).getPatente().equals(patente)))
            {
                listaDeVehiculos.remove(i); // fixme: No esta bueno eliminar un elemento en un for.
                System.out.println("Vehiculo eliminado!!");
                return;
            }
            System.out.println("No se encontro ningun vehiculo con esa patente");
            return;
        }
    }
}


