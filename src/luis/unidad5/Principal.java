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
        Personal nd1 = new NoDocente(20, "Pérez", "Ana");
        Personal nd2 = new NoDocente(30, "Pérez", "Juan");
        Personal nd3 = new NoDocente(30, "Pérez", "Juan");
        Personal nd4 = new NoDocente(1, "Pérez", "Carlos");
//        Personal p1 = new Personal(10, "assd", "ffdf");
        
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

        
            
        empleados.add(d1);
        
        if (!empleados.contains(d2))
            empleados.add(d2);
        
        if (!empleados.contains(d3))
            empleados.add(d3);
        
        if (!empleados.contains(nd1))
            empleados.add(nd1);
        
        if (!empleados.contains(nd2))
            empleados.add(nd2);
        
        if (!empleados.contains(nd3))
            empleados.add(nd3);
        
        if (!empleados.contains(nd4))
            empleados.add(nd4);
        
        for(Personal p : empleados)
            p.mostrar();
        
//        boolean estaEsteEmpleado = false;
//        for(Personal p : empleados) {
//            if (p.getDocumento() == d2.getDocumento()) {
//                estaEsteEmpleado = true;
//                break;
//            }
//        }
//        if (!estaEsteEmpleado)
//            empleados.add(d2);
    }
}
