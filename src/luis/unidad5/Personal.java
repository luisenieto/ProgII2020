/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

import java.util.Objects;

public abstract class Personal {
    private int documento;
    private String apellido;
    private String nombre;

    public Personal(int documento, String apellido, String nombre) {
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.documento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        Personal other = (Personal) obj;
        if (this.documento != other.documento) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
       
//    public void asignarApellido(String apellido) {
//        this.apellido = apellido;
//    }
//    
//    public String verApellido() {
//        return this.apellido;
//    }
    
    public void mostrar() {
        System.out.println(this.queSoy());
        System.out.println("DNI: " + this.documento);
        System.out.println("Apellido: " + this.apellido);
        System.out.println("Nombre: " + this.nombre);        
    }
    
    public abstract String queSoy();
    
}
