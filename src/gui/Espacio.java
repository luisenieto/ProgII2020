/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


public class Espacio {
    private String nombre;
    private int capacidad;
    private Tipo tipo;

    public Espacio(String nombre, int capacidad, Tipo tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Tipo: " + this.tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
