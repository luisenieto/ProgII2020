/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad6;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorRecursos {
    private ArrayList<Recurso> recursos = new ArrayList<>();
    public static final String RECURSO_EXITO = "Se pudo crear el recurso";
    public static final String RECURSO_NOMBRE_INCORRECTO = "No se pudo crear el recurso porque el nombre es incorrecto";
    public static final String RECURSO_REPETIDO = "No se pudo crear el recurso porque ya existe otro con ese nombre";
    private static GestorRecursos instancia;
    
    private GestorRecursos() {
        
    }
    
    public static GestorRecursos crear() {
        if (instancia == null)
            instancia = new GestorRecursos();
        return instancia;
    }
    
    public String nuevoRecurso(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Recurso r = new Recurso(nombre);
            if(!this.recursos.contains(r)) {
                this.recursos.add(r);
                return RECURSO_EXITO;
            }
            else
                return RECURSO_REPETIDO;
        }
        else
            return RECURSO_NOMBRE_INCORRECTO;
    }
    
    public void mostrarRecursos() {
        for(Recurso r : this.recursos)
            r.mostrar();
    }
    
    public int cantidadRecursos() {
        return this.recursos.size();
    }
}
