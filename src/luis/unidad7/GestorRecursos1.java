/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad7;

/**
 *
 * @author root
 */
public class GestorRecursos1 implements IGestorRecursos {
    private static int contador = 0;
    private Recurso[] recursos = new Recurso[100];
    private static GestorRecursos1 instancia;
    
    private GestorRecursos1() {
        
    }
    
    public static GestorRecursos1 crear() {
        if (instancia == null)
            instancia = new GestorRecursos1();
        return instancia;
    }
    
    @Override
    public String nuevoRecurso(String nombre) {
        if ((nombre != null) && (!nombre.isBlank())) {
            Recurso r = new Recurso(nombre);
            if (!this.contains(r)) {
                this.recursos[contador] = r;
                contador++;
                return RECURSO_EXITO;
            }
            else
                return RECURSO_REPETIDO;
                
        }
        else
            return RECURSO_NOMBRE_INCORRECTO;
    }
    
    private boolean contains(Recurso r) {
        for(Recurso recurso : this.recursos) {
            if (r.equals(recurso))
                return true;
        }
        return false;
    }

    @Override
    public void mostrarRecursos() {
        for(int i = 0; i < contador; i++) {
            Recurso r = this.recursos[i];
            r.mostrar();
        }
    }

    @Override
    public int cantidadRecursos() {
        return contador;
    }
    
}
