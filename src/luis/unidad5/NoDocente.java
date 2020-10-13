/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

public class NoDocente extends Personal {
    
    public NoDocente(int documento, String apellido, String nombre) {
        super(documento, apellido, nombre);
    }
    
//    public void mostrar() {    
//        System.out.println("DNI: " + this.getDocumento());
//        System.out.println("Apellido: " + this.getApellido());
//        System.out.println("Nombre: " + this.getNombre());
//    }    
    
    @Override
     public String queSoy() {
        return "Soy un no docente";
    }
}
