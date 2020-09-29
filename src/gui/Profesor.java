/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author root
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private Cargo cargo;
    private LocalDate fechaNacimiento;

    public Profesor(int dni, String apellidos, String nombres, Cargo cargo, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.cargo = cargo;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public void mostrar() {
        System.out.println("DNI: " + this.dni);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Cargo: " + this.cargo);
//        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento);
        System.out.println("Fecha Nacimiento: " + this.fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
