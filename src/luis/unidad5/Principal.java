/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad5;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        ArrayList<Personal> empleados = new ArrayList<>();
        
        Personal d1 = new Docente(1, "Pérez", "Ana", "Adjunto");
        Personal d2 = new Docente(2, "Pérez", "Ana", "Adjunto");
        Personal d3 = new Docente(2, "Pérez", "Ana", "Adjunto");
        Recurso r = new Recurso();
        if (d1.equals(d2))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");
        
        if (d1.equals(r))
            System.out.println("Son iguales");
        else
            System.out.println("Son distintos");
        
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
        System.out.println(d3.hashCode());
        
        
//        empleados.add(d1);
//        
//        Personal nd = new NoDocente(2, "Gómez", "Juan");
//        empleados.add(nd);
        
//        for(Personal p : empleados) {
//            if (p instanceof Docente) {
//                Docente d1 = (Docente)p;
//                System.out.println(d1.getCargo());
//            }
//        }
//                p.mostrar();
//                System.out.println(((Docente)p).getCargo());
    }
}
