/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana.tp2_1;

/**
 *
 * @author PC
 */
public class Alumno {
    private String nombre;
    private int legajo;

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    /**
     * Método toString() está disponible para todas las clases 
     * (todas heredan de la clase Object, ya lo estudiaremos mas adelante)
     * 
     * @return String - devuelve una cadena que es la como represento el objeto como una cadena
     */
    @Override
    public String toString() {
        return this.nombre + " CX" + this.getLegajo() ;//pueden tomarlos de diferente manera
    }
    
    
    
}
