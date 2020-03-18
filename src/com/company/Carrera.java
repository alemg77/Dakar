package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private Double distancia;
    private Double premioeEnDolares;
    private String nombre;
    private Integer cantidadDeVehiculosPermitidos;
    private List<Vehiculo> listaDeVehiculos;

    public void calcularGanador() {

        if (listaDeVehiculos.size() == 0) {
            System.out.println("Nadie corre esta carrera :(");
            return;
        }

        Integer indiceDelGanador = 0;
        Double puntosDelGanador = 0.0;

        for (int i = 0; i < listaDeVehiculos.size() ; i++) {
            if (puntosDelGanador < listaDeVehiculos.get(i).calcularPuntos()) {
                indiceDelGanador = i;
                puntosDelGanador = listaDeVehiculos.get(i).calcularPuntos();
            }
        }
        System.out.println("Gano " + listaDeVehiculos.get(indiceDelGanador));
    }

    public Carrera(Double distancia, Double premioeEnDolares, String nombre, Integer cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioeEnDolares = premioeEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
    }

    public void darDeAltaAuto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (cantidadDeVehiculosPermitidos > listaDeVehiculos.size()) {
            Vehiculo unAutoNuevo = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(unAutoNuevo);
            System.out.println("Bienvenido a la carrera!");
        } else {
            System.out.println("No hay mas lugar");
        }
    }

    public void darDeAltaMoto(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        if (cantidadDeVehiculosPermitidos > listaDeVehiculos.size()) {
            Vehiculo unAutoNuevo = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
            listaDeVehiculos.add(unAutoNuevo);
            System.out.println("Bienvenido a la carrera!");
        } else {
            System.out.println("No hay mas lugar");
        }
    }

    public void eliminarVehiculo(String patente) {
        for (int i = 0; i < listaDeVehiculos.size(); i++) {
            if (listaDeVehiculos.get(i).getPatente().equals(patente)) {
                listaDeVehiculos.remove(i); // fixme: No esta bueno eliminar un elemento en un for, pero que le vamos a hacer....
                System.out.println("Vehiculo eliminado!!");
                this.cantidadDeVehiculosPermitidos--;
                return;
            }
            System.out.println("No se encontro ningun vehiculo con esa patente");
            return;
        }
    }

    public void eliminarVehiculo(Vehiculo unVehiculo) {
        eliminarVehiculo(unVehiculo.getPatente());
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "distancia=" + distancia +
                ", premioeEnDolares=" + premioeEnDolares +
                ", nombre='" + nombre + '\'' +
                ", cantidadDeVehiculosPermitidos=" + cantidadDeVehiculosPermitidos +
                ", listaDeVehiculos=" + listaDeVehiculos +
                '}';
    }
}


