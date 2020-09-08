/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.unidad3;

import java.time.LocalDateTime;


public class Espacio {
    private String nombreEspacio;
    private int capacidad = 100;
    private String tipo;
    private LocalDateTime desde;
    private LocalDateTime hasta;
    
    
    public Espacio(String nombreEspacio, int capacidad, String tipo, LocalDateTime desde, LocalDateTime hasta) {
        this(nombreEspacio, capacidad, tipo);
//        nombreEspacio = n;
//        capacidad = c;
//        tipo = t;
        this.desde = desde;        
        this.hasta = hasta;
        
    }        
    
    public Espacio(String nombreEspacio, int capacidad, String tipo) {        
        this.nombreEspacio = nombreEspacio;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    
    public Espacio(String nombreEspacio, String tipo) {  
        this(nombreEspacio, 100, tipo);
    }
    
    
    public void mostrar() {  
        System.out.println("Nombre: " + nombreEspacio);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Tipo: " + tipo); 
        System.out.println("Desde: " + desde);
        System.out.println("Hasta: " + hasta);
    }
    
    public void mostrar(LocalDateTime d, LocalDateTime h) {
        this.mostrar();
        if (desde.isAfter(d)) {
            System.out.println("Nombre: " + nombreEspacio);
            System.out.println("Capacidad: " + capacidad);
            System.out.println("Tipo: " + tipo); 
        }
    }
    
    
    
    void reservarTurno(LocalDateTime desde, LocalDateTime hasta) {
        
    }

    public String getNombre() {
        return nombreEspacio;
    }

//    public void setNombre(String n) {
//        if ((n != null) && (!n.isEmpty()))
//            nombreEspacio = n;
//    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int c) {
        capacidad = c;
    }

    public String getTipo() {
        return tipo;
    }

//    public void setTipo(String t) {
//        tipo = t;
//    }

    public LocalDateTime getDesde() {
        return desde;
    }

    public void setDesde(LocalDateTime d) {
        desde = d;
    }

    public LocalDateTime getHasta() {
        return hasta;
    }

    public void setHasta(LocalDateTime h) {
        hasta = h;
    }
}
