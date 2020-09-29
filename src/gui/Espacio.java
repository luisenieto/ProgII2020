/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;

    public Espacio(String nombre, int capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Capacidad: " + this.capacidad);
        System.out.println("Tipo: " + this.tipo);
    }
}
