package luis.unidad8;

public enum Tipo {
    LABORATORIO("Laboratorio"),
    AULA("Aula"),
    ANFITEATRO("Anfiteatro");
    
    private String valor;
    
    /**
     * Constructor
     * @param valor valor de la enumeración
     */                
    private Tipo(String valor) {
        this.valor = valor;
    }            
    
    /**
     * Devuelve la constante como cadena
     * @return String  - constante como cadena
     */                
    @Override
    public String toString() {
        return this.valor;
    }            
}
