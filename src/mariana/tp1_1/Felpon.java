/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana.tp1_1;

/**
 *
 * @author PC
 */
public class Felpon {
    String color;
    String trazo;
    float grosor;
    
    void mostrar(){
        //Para la clase String toUppercase pasa a mayúscula
        System.out.println("Soy un felpon " + color.toUpperCase() + ", trazo " + trazo + "y grosor " + grosor + " mm.");
    }
    
}
