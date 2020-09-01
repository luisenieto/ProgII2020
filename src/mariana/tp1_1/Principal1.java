/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana.tp1_1;

import java.util.ArrayList;

/**
 *
 * @author PC
 * Esta clase llamada Principal1 está destinda únicamente a contener el método main()
 */
public class Principal1 {
    
    public static void main(String[] args) {
        int unEntero;
        String unaCadena, otraCadena="Chau!!";
        
        //declaro una lista que contendrá objetos de la clase Felpon
        ArrayList<Felpon> lista = new ArrayList<>();
        
        //3 referencias de tipo Felpon
        Felpon felpon1 = new Felpon();
        Felpon felpon2 = new Felpon();
        Felpon felpon3;
        felpon3= new Felpon();
        
        
        unEntero = 25;
        unaCadena="Buenas tardes!";
        
        System.out.println("Clase de programación");
        System.out.printf("Un entero %d ", unEntero);
        System.out.println("Este es un entero "  + unEntero);
        System.out.println(unaCadena + " " + otraCadena); 
        
        
        //Doy valor a los atributos de las diferentes instancias de Felpon
        felpon1.color= "negro";
        felpon1.trazo="redondo";
        felpon1.grosor=1.5f;
        
        
        felpon2.color= "azul";
        felpon2.trazo="bisel";
        felpon2.grosor=3f;
        
        felpon3.color="rojo";
        felpon3.trazo="fino";
        felpon3.grosor=2.5f;
        
        //Agrego elementos a la lista
        lista.add(felpon1);
        lista.add(felpon2);
        lista.add(felpon3);
        
        System.out.println();
        //presento los elementos
        for(int i=0; i<lista.size(); i++)
            lista.get(i).mostrar();
        
        //modifico elementos
        felpon3.color="amarillo";
        System.out.println();
        //muestro con el for mejorado
        for(Felpon f : lista)
            f.mostrar();
        
    }
    
    
    
}
