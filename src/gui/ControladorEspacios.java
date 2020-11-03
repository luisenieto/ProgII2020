/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;

public class ControladorEspacios implements IControladorEspacios {
    private VentanaEspacios ventana;
    
    public ControladorEspacios() {
        this.ventana = new VentanaEspacios(this, null, true);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.getTablaEspacios().setModel(new ModeloTablaEspacios());
        JComboBox comboTipos = new JComboBox();
        comboTipos.setModel(new ModeloComboTipos());
        TableColumn colTipo = this.ventana.getTablaEspacios().getColumnModel().getColumn(2);
        colTipo.setCellEditor(new DefaultCellEditor(comboTipos));
        this.ventana.getComboTipo().setModel(new ModeloComboTipos());
        this.btnNuevoClic(null);
        this.ventana.setVisible(true);
        
    }
    
    @Override
    public void btnNuevoClic(ActionEvent evt) {
        this.ventana.getTxtNombre().setText(null);
        this.ventana.getTxtCapacidad().setText(null);
        this.ventana.getComboTipo().setSelectedIndex(-1);
        this.ventana.getTxtNombre().requestFocus();
    }
    
    @Override
    public void btnGuardarClic(ActionEvent evt) {
        String nombre = this.ventana.getTxtNombre().getText();
        int capacidad = Integer.parseInt(this.ventana.getTxtCapacidad().getText());
        Tipo tipo = ((ModeloComboTipos)this.ventana.getComboTipo().getModel()).obtenerTipo();
        GestorEspacios ge = GestorEspacios.crear();
        ge.nuevoEspacio(nombre, capacidad, tipo);
        ModeloTablaEspacios mte = (ModeloTablaEspacios)this.ventana.getTablaEspacios().getModel();
        mte.actualizar();
    }
    
    @Override
    public void btnBorrarClic(ActionEvent evt) {
        ModeloTablaEspacios mte = (ModeloTablaEspacios)this.ventana.getTablaEspacios().getModel();
        Espacio e = mte.verEspacio(this.ventana.getTablaEspacios().getSelectedRow());
        GestorEspacios ge = GestorEspacios.crear();
        ge.borrarEspacio(e);
        mte.actualizar();
    }
}
