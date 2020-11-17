package luis.unidad8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GestorEspacios implements IGestorEspacios {
    private List<Espacio> espacios = new ArrayList<>();
    private static GestorEspacios instancia;
    
    private GestorEspacios() {
        
    }
    
    public static GestorEspacios crear() {
        if (instancia == null)
            instancia = new GestorEspacios();
        return instancia;
    }

    @Override
    public String nuevoEspacio(String nombre, int capacidad, Tipo tipo) {
        Espacio e = new Espacio(nombre, capacidad, tipo);
        if(!this.espacios.contains(e)) {
            this.espacios.add(e);
            return OK;
        }
        else
            return REPETIDO;
    }

    @Override
    public void mostrarEspacios() {
        Collections.sort(this.espacios);
        for(Espacio e : this.espacios)
            e.mostrar();
    }

    @Override
    public void mostrarEspacios(Comparator<Espacio> cmp) {
//        Collections.sort(this.espacios, cmp);
        this.espacios.sort(cmp);
        for(Espacio e : this.espacios)
            e.mostrar();
    }
    
    
    

    public static void main(String[] args) {
        IGestorEspacios ge = GestorEspacios.crear();
        ge.nuevoEspacio("A1", 300, Tipo.ANFITEATRO);
        ge.nuevoEspacio("1-3-14", 60, Tipo.AULA);
        ge.nuevoEspacio("1-3-8", 80, Tipo.LABORATORIO);
        
//        ge.mostrarEspacios();

//        Comparator<Espacio> cmp1 = new Comparator<Espacio>() {
//            @Override
//            public int compare(Espacio e1, Espacio e2) {
//                return e1.getNombre().compareTo(e2.getNombre());
//            }            
//        };
        
        Comparator<Espacio> cmp1 = (Espacio e1, Espacio e2) -> e1.getNombre().compareTo(e2.getNombre());
        Comparator<Espacio> cmp2 = (Espacio e1, Espacio e2) -> e2.getCapacidad() - e1.getCapacidad();
                
//        Comparator<Espacio> cmp2 = new Comparator<Espacio>() {
//            @Override
//            public int compare(Espacio e1, Espacio e2) {
//                return e2.getCapacidad() - e1.getCapacidad();
//            }            
//        };
        
        ge.mostrarEspacios(cmp1);
//        ge.mostrarEspacios(new CapacidadComp());
    }
    
}
