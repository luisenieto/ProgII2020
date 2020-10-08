/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

import java.util.ArrayList;


public class Espacios {
    ArrayList<Recurso> recursos = new ArrayList();
    
    public void m() {
        Personal d = new Docente(1, "Pérez", "Ana", "Adjunto");
        Personal nd = new NoDocente(2, "Gómez", "Juan");
        Recurso r = new Recurso();
        Object o = new Object();
        
//        recursos.add(d);
//        recursos.add(nd);
        recursos.add(r);
        
//        for(Recurso o : recursos) {
//            
//        }
        
    }
    
}
