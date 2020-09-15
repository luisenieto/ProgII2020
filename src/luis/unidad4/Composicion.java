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
public class Composicion {
    private Recurso unRecurso;
    private int cantidad;

    public Composicion(Recurso unRecurso, int cantidad) {
        this.unRecurso = unRecurso;
        this.cantidad = cantidad;
    }

    public Recurso getRecurso() {
        return unRecurso;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void mostrar() {
        unRecurso.mostrar();
        System.out.println("Cantidad: " + cantidad);
    }
    
}
