/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad9;


public class Recurso {
    private String nombre;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar() {
        System.out.println(this.nombre);
    }
}
