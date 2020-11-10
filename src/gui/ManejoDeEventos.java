/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ManejoDeEventos extends javax.swing.JFrame {

    /**
     * Creates new form ManejoDeEventos
     */
    public ManejoDeEventos() {
        initComponents();
        this.btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println("Clic en botón 1");
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        txtCapacidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                ventanaGanaFoco(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        btn1.setText("Botón 1");

        btn2.setText("Botón 2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2Clic(evt);
            }
        });

        btn3.setText("Botón 3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3Clic(evt);
            }
        });

        btn4.setText("Botón 4");

        txtCapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadPresionarTecla(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1)
                        .addGap(18, 18, 18)
                        .addComponent(btn2)
                        .addGap(18, 18, 18)
                        .addComponent(btn3)
                        .addGap(18, 18, 18)
                        .addComponent(btn4)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
                    .addComponent(btn4))
                .addGap(18, 18, 18)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2Clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2Clic
        int capacidad = Integer.parseInt(this.txtCapacidad.getText());
        System.out.println(capacidad);
    }//GEN-LAST:event_btn2Clic

    private void txtCapacidadPresionarTecla(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadPresionarTecla
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            switch(c) {
                case KeyEvent.VK_ENTER:
                    System.out.println(this.txtCapacidad.getText());
                    break;
                case KeyEvent.VK_BACK_SPACE:
                case KeyEvent.VK_DELETE:
                    break;
                default:
                    evt.consume();
                    break;
            }
        }
    }//GEN-LAST:event_txtCapacidadPresionarTecla

    private void btn3Clic(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3Clic
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3Clic

    private void ventanaGanaFoco(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ventanaGanaFoco
        System.out.println("Ventana con foco");
    }//GEN-LAST:event_ventanaGanaFoco

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManejoDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoDeEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ManejoDeEventos mde = new ManejoDeEventos();
        mde.setLocationRelativeTo(null);
        mde.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JTextField txtCapacidad;
    // End of variables declaration//GEN-END:variables


    
}
