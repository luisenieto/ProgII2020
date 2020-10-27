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
public interface IGestorRecursos {
    public static final String RECURSO_EXITO = "Se pudo crear el recurso";
    public static final String RECURSO_NOMBRE_INCORRECTO = "No se pudo crear el recurso porque el nombre es incorrecto";
    public static final String RECURSO_REPETIDO = "No se pudo crear el recurso porque ya existe otro con ese nombre";
    
    public String nuevoRecurso(String nombre);
    public void mostrarRecursos();
    public int cantidadRecursos();
}
