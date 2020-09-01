/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad2;


public class Principal {
    public static void main(String[] args) {
        Espacio unEspacio = new Espacio();
        unEspacio = null;
        
//        Espacio e2 = unEspacio;
//        Espacio e3 = unEspacio;
        
        unEspacio.nombre = "A1";
        unEspacio.capacidad = 300;
        unEspacio.tipo = "Anfiteatro";
        
        unEspacio.mostrar();
    }
    
}
