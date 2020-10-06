/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

public class Personal {
    private int documento;
    private String apellido;
    private String nombre;

    public Personal(int documento, String apellido, String nombre) {
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
    }
       
    public void asignarApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String verApellido() {
        return this.apellido;
    }
    
    public void mostrar() {
        System.out.println("DNI: " + this.documento);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nombre: " + this.nombre);
    }
    
}
