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

/**
 *
 * @author root
 */
public class ControladorEspacios2 implements IControladorEspacios {
    private VentanaEspacios ventana;
    
    public ControladorEspacios2() {
        this.ventana = new VentanaEspacios(this, null, true);
//        this.ventana.setLocationRelativeTo(null);
        this.ventana.getTablaEspacios().setModel(new ModeloTablaEspacios());
//        JComboBox comboTipos = new JComboBox();
//        comboTipos.setModel(new ModeloComboTipos());
//        TableColumn colTipo = this.ventana.getTablaEspacios().getColumnModel().getColumn(2);
//        colTipo.setCellEditor(new DefaultCellEditor(comboTipos));
        this.ventana.getComboTipo().setModel(new ModeloComboTipos());
//        this.btnNuevoClic(null);
        this.ventana.setVisible(true);
        
    }
    @Override
    public void btnNuevoClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnGuardarClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void btnBorrarClic(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
