/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad9;

import java.util.ArrayList;
import java.util.List;

public class GestorRecursos {
    private List<Recurso> recursos = new ArrayList<>();
    
    public Recurso obtenerRecurso(int pos) {
//        try {
            return this.recursos.get(pos);
//        }
//        catch(NullPointerException e) {
//            return null;
//        }
    }
    
    public void agregarRecurso(Recurso r) {
        this.recursos.add(r);
    }
    
    public static void main(String[] args) {
        GestorRecursos gr = new GestorRecursos();
        
        Recurso r1 = new Recurso("Recurso1");
        Recurso r2 = new Recurso("Recurso2");
        Recurso r3 = new Recurso("Recurso3");
        
        gr.agregarRecurso(r1);
        gr.agregarRecurso(r2);
        gr.agregarRecurso(r3);
        
        Recurso r = gr.obtenerRecurso(3);
//        r.mostrar();
    }
}
