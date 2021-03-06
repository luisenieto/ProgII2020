package luis.unidad10;

import java.util.Comparator;

public interface IGestorEspacios {
    public static final String OK = "Espacio creado correctamente";
    public static final String REPETIDO = "No se puede crear el espacio porque ya existe otro con el mismo nombre";    
    public static final String ESCRITURA_ERROR = "Error al guardar los espacios";
    public static final String ESCRITURA_OK = "Se pudieron guardar los espacios";   
    public static final String LECTURA_ERROR = "Error al leer los espacios";
    public static final String LECTURA_OK = "Se pudieron leer los espacios";    
    public static final String CREACION_ERROR = "Error al crear el archivo de espacios";
    
    public String nuevoEspacio(String nombre, int capacidad, Tipo tipo);
    public void mostrarEspacios();
    public void mostrarEspacios(Comparator<Espacio> cmp);
}
