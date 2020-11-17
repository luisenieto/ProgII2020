package luis.unidad8;

import java.util.Objects;

public class Espacio implements Comparable<Espacio> {
    private String nombre;
    private int capacidad;
    private Tipo tipo;

    public Espacio(String nombre, int capacidad, Tipo tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void mostrar() {
        System.out.println(this.nombre + ", " + this.capacidad + ", " + this.tipo);
    }

    
    @Override
    public int compareTo(Espacio e) {
//        return e.nombre.compareTo(this.nombre);
//        return this.capacidad - e.capacidad;
        return this.tipo.toString().compareTo(e.tipo.toString());
    }

    

    
  
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Espacio other = (Espacio) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
    
    
}
