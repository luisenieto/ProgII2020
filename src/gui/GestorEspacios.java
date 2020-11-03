/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorEspacios {
    private ArrayList<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios gestor;
    
    private GestorEspacios() {
        
    }
    
    public static GestorEspacios crear() {
        if (gestor == null)
            gestor = new GestorEspacios();
        return gestor;
    }
    
    public void nuevoEspacio(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        if(!this.espacios.contains(e))
            this.espacios.add(e);
    }
    
    public void borrarEspacio(Espacio e) {
        this.espacios.remove(e);
    }
    
    public ArrayList<Espacio> verEspacios() {
        return this.espacios;
    }
}
