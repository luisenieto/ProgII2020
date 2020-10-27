/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad6;

/**
 *
 * @author root
 */
public class Principal {
    public static void main(String[] args) {
        GestorRecursos gr1 = GestorRecursos.crear();
        GestorRecursos gr2 = GestorRecursos.crear();
        GestorEspacios ge = new GestorEspacios();
        
        System.out.println(gr1.nuevoRecurso("Proyector"));
        System.out.println(gr1.nuevoRecurso("Proyector"));
        System.out.println(gr1.nuevoRecurso(""));
        System.out.println(gr1.nuevoRecurso(null));
        System.out.println(gr2.nuevoRecurso("Pizarrón"));
        System.out.println(gr2.nuevoRecurso("Proyector"));
        gr1.mostrarRecursos();
//        System.out.println(gr1.cantidadRecursos());
//        gr2.mostrarRecursos();
    }
}
