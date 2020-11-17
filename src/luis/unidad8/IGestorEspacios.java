package luis.unidad8;

import java.util.Comparator;

public interface IGestorEspacios {
    public static final String OK = "Espacio creado correctamente";
    public static final String REPETIDO = "No se puede crear el espacio porque ya existe otro con el mismo nombre";
    
    public String nuevoEspacio(String nombre, int capacidad, Tipo tipo);
    public void mostrarEspacios();
    public void mostrarEspacios(Comparator<Espacio> cmp);
}
