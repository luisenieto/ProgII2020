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
public class Principal {
    public static void main(String[] args) {
        IGestorRecursos gr = GestorRecursos1.crear();
        System.out.println(gr.nuevoRecurso("Pizarrón"));
        
        UnaClase<Recurso> c1 = new UnaClase<>();
        UnaClase<Float> c2 = new UnaClase<>();
        ArrayList<Recurso> recursos = new ArrayList<>();
        ArrayList<Object> recursos1 = new ArrayList<>();
        
    }
    
}
