/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad4;

/**
 *
 * @author root
 */
public class Principal {
    public static void main(String[] args) {
        Recurso r1 = new Recurso("Ventilador");
        Recurso r2 = new Recurso("Aire acondicionado");
        
        Espacio e1 = new Espacio("A1", 300, "Anfiteatro");
        Composicion c1 = new Composicion(r1, 10);
        Composicion c2 = new Composicion(r2, 1);
        e1.agregarRecurso(c1);
        e1.agregarRecurso(c2);
//        e1.mostrarRecursos();

//        Docente d = new Docente("Pérez", "Juan");
//        Asignatura a1 = new Asignatura("1", "Asig1");
//        Asignatura a2 = new Asignatura("2", "Asig2");
//        d.agregarAsignatura(a1);
//        d.agregarAsignatura(a2);
//        a1.agregarDocente(d);
//        a2.agregarDocente(d);

        Espacio espacio = new Espacio("A1", 300, "Anfiteatro");
        System.out.println("hola");
        System.out.println(1);
//        System.out.println(espacio);
        espacio.mostrar();
        
        Docente d = new Docente("Pérez", "Juan", Cargo.ADJUNTO);
    }
}
