/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author root
 */
public class ModeloTablaEspacios extends AbstractTableModel {
    private ArrayList<String> nombreColumnas = new ArrayList<>();
    private ArrayList<Espacio> espacios = new ArrayList<>();

    public ModeloTablaEspacios() {
        nombreColumnas.add("Nombre");
        nombreColumnas.add("Capacidad");
        nombreColumnas.add("Tipo");
        GestorEspacios ge = GestorEspacios.crear();
        this.espacios = ge.verEspacios();
//        espacios.add(new Espacio("A1", 300, Tipo.ANFITEATRO));
//        espacios.add(new Espacio("1-3-14", 50, Tipo.AULA));
//        espacios.add(new Espacio("1-3-08", 80, Tipo.LABORATORIO));
    }

    @Override
    public int getColumnCount() {
        return this.nombreColumnas.size();
    }

    @Override
    public int getRowCount() {
        return this.espacios.size();
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        Espacio e = this.espacios.get(fila);
        switch(columna) {
            case 0: return e.getNombre();
            case 1: return e.getCapacidad();
            default: return e.getTipo();
        }
    }

    @Override
    public String getColumnName(int columna) {
        return this.nombreColumnas.get(columna);
    }
    
    public Espacio verEspacio(int fila) {
        return this.espacios.get(fila);
    }

    @Override
    public boolean isCellEditable(int fila, int columna) {
        return true;
    }

    @Override
    public void setValueAt(Object valor, int fila, int columna) {
        Espacio e = this.espacios.get(fila);
        switch(columna) {
            case 0: e.setNombre((String)valor);
                    break;
            case 1: e.setCapacidad((Integer)valor);
                    break;
            default:e.setTipo((Tipo)valor);
                    break;
        }
    }

    @Override
    public Class<?> getColumnClass(int columna) {
        switch(columna) {
            case 0: return String.class;
            case 1: return Integer.class;
            default: return String.class;
        }
    }
    
    
    public void actualizar() {
        GestorEspacios ge = GestorEspacios.crear();
        this.espacios = ge.verEspacios();
        this.fireTableDataChanged();
    }
    
    
}
