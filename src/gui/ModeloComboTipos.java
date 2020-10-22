/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author root
 */
public class ModeloComboTipos extends DefaultComboBoxModel {

    public ModeloComboTipos() {
        for(Tipo tipo : Tipo.values())
            this.addElement(tipo);
    }
    
    public Tipo obtenerTipo() {
        return (Tipo)this.getSelectedItem();
    }
    
    public void seleccionarTipo(Tipo tipo) {
        this.setSelectedItem(tipo);
    }

}
