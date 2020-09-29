/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariana.tp2_2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Principal {

    public static void main(String[] args) {
        Empleado unEmpleado;
        unEmpleado = new Empleado("Juan Jose", "martinez", "28507876");
        
        Empleado unEmpleado2=new Empleado("Roberto","Funes", "28567876", 3,"funesr@mail.com", LocalDate.of(1980, Month.JUNE, 5));
        Empleado unEmpleado3= new Empleado("julia maria","juarez", "38567876", 1,"julita@mail.com", LocalDate.of(2008, Month.JUNE, 25));
        
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
          
        listaEmpleados.add(unEmpleado);
        listaEmpleados.add(unEmpleado2);
        listaEmpleados.add(unEmpleado3);
        
        //Mostrar la lista
        for(Empleado e : listaEmpleados)
            e.mostrar();
        
    }
    
}
