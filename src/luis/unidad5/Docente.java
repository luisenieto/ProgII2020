/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

import luis.unidad5.Personal;

public class Docente extends Personal {
    private String cargo;
    
    public Docente(int documento, String apellido, String nombre, String cargo) {
        super(documento, apellido, nombre);
        this.cargo = cargo;        
    }
    
    public Docente(int documento, String apellido, String nombre) {
        this(documento, apellido, nombre, "Adjunto");
    }
    
    @Override
    public void mostrar() {    
        super.mostrar();
        System.out.println("Cargo: " + this.cargo);
    }
    
    
    
//    public void asignarDocumento(int documento) {
//        this.documento = documento;
//    }
    
    
//    public void asignarNombre(String nombre) {
//        this.nombre = nombre;
//    }
}
