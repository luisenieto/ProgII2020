/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;


public class Principal3 {
    public static void main(String[] args) {
//        int opcion = JOptionPane.showConfirmDialog(null,
// 		"¿Desea borrar la palabra clave especificada?", 
// 		"Repositorios", 
// 		JOptionPane.YES_NO_OPTION);
//        
//        if (opcion == JOptionPane.YES_OPTION)
//            System.out.println("Se eligió Sí");
//        else
//            System.out.println("Se eligió No");
        
       
//        int opcion = JOptionPane.showOptionDialog(null, //determina el Frame en el cual se muestra la ventana de diálogo: si es null, o si componente padre no tiene un Frame, se usa un Frame predeterminado
//                "¿Desea borrar la palabra clave especificada?", //mensaje
//                "Repositorios", //título de la ventana
//                JOptionPane.YES_NO_OPTION, //opciones disponibles: DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION o OK_CANCEL_OPTION
//                JOptionPane.QUESTION_MESSAGE, //tipo de mensaje: ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, or PLAIN_MESSAGE
//                null, //ícono
//                new Object[] {"Sí", "No"}, //array de objetos indicando las posibles opciones
//                "No" //selección predeterminada (tiene sentido si se especifica algo en el parámetro anterior). Puede ser null
//        );       
//        
//        if (opcion == JOptionPane.YES_OPTION)
//            System.out.println("Se eligió Sí");
//        else
//            System.out.println("Se eligió No");

        JOptionPane.showMessageDialog(null, 
                "No se puede borrar la palabra clave especificada", 
                "Repositorios", 
                JOptionPane.ERROR_MESSAGE);
        
    }
}
