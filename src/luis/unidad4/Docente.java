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
public class Docente {
    private String apellido;
    private String nombre;
    private Cargo cargo;
    private ArrayList<Asignatura> asignaturas = new ArrayList<>();

    public Docente(String apellido, String nombre, Cargo cargo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.cargo = cargo;
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
    
    public void agregarAsignatura(Asignatura a) {
        this.asignaturas.add(a);
        a.agregarDocente(this);
    }
}
