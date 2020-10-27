/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad7;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class GestorRecursos implements IGestorRecursos {
    private ArrayList<Recurso> recursos = new ArrayList<>();
    private static GestorRecursos instancia;
    
    private GestorRecursos() {
        
    }
    
    public static GestorRecursos crear() {
        if (instancia == null)
            instancia = new GestorRecursos();
        return instancia;
    }
    
    @Override
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

    @Override
    public void mostrarRecursos() {
        for(Recurso r : this.recursos)
            r.mostrar();
    }

    @Override
    public int cantidadRecursos() {
        return this.recursos.size();
    }
    
}
