/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad2;

import java.time.LocalDateTime;


public class Espacio {
    String nombre;
    int capacidad;
    String tipo;
    LocalDateTime desde;
    LocalDateTime hasta;
    
    
    void mostrar() {  
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tipo: " + tipo);
        
    }
    
    void reservarTurno(LocalDateTime desde, LocalDateTime hasta) {
        
    }
}
