/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad9;

import java.io.IOException;

public class ManejoExcepciones {
    
//    public static void m1() {
//        System.out.println("A");
//        try {
//            m2();
//        }
//        catch(NullPointerException e) {
//            System.out.println("B");
//        }
//        System.out.println("D");
//    }
        
    public static void m2() {
        System.out.println("E");
        Object x = null;
        x.toString();
        System.out.println("F");
    }
    
    public static void m1() {
        System.out.println("A");
        try {
            m2();
        }
        catch(NullPointerException e) {
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    
    public static int dividir(int a, int b) {
        try {
            return a / b;
        }
        catch(ArithmeticException e) { 
            return 0; 
        }                
        catch(RuntimeException e) { 
            return -1; 
        }            
        finally { 
            System.out.print("fin"); 
        }
    }
    
//    public static int dividir(int a, int b) {
//        try {
//            return a / b;
//        }
//        catch(RuntimeException e) { 
//            return -1; 
//        }
//        catch(ArithmeticException e) { //error
//            return 0; 
//        }        
//        finally { 
//            System.out.print("fin"); 
//        }
//    }
    
    
    public static void m3() throws IOException {
        throw new IOException();
    }
    
//    public static void m4() {
//        try {
//            m3();
//        }
//        catch (IOException e) {
//            System.out.print("Excepción capturada"); 
//        }
//    }
    
    public static void m4() throws IOException {
        m3();
    }
    
    
    public static void main(String[] args) {
//        m1();

//        System.out.println(dividir(10, 0));

//        m4();
        
        try {
            m4();
        }
        catch(IOException e) {
            System.out.print("Excepción capturada");
        }
    }
    
//    public static void main(String[] args) throws IOException {
//        m4();
//    }
}
