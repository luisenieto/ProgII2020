/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad4;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Espacio {
    private String nombre;
    private int capacidad;
    private String tipo;
    private ArrayList<Composicion> recursos = new ArrayList<>();

    public Espacio(String nombre, int capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public void agregarRecurso(Composicion c) {
        this.recursos.add(c);
    }
    
    public void mostrarRecursos() {
        for(Composicion c : recursos) {
            c.mostrar();
        }
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.capacidad + " " + this.tipo;
    }
    
    public void mostrar() {
        System.out.println(this);
    }
    
    
}
