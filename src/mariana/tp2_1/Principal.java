/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana.tp2_1;

/**
 *
 * @author PC
 */
public class Principal {
    public static void main(String[] args) {
        Alumno unAlumno= new Alumno("Julio", 1234);
        
        System.out.println("El alumno es:");
        //Correr 1ra vez: comentando en la clase alumno el método toString() en la clase Alumno y ver su representación
        //Correr 2da vez: dejar sin comentar el método toString() en la clase Alumno
        
        System.out.println(unAlumno);
    }
    
}
