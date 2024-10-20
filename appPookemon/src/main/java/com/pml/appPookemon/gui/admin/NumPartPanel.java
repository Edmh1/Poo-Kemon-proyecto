/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.admin;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;

/**
 *
 * @author eddie
 */
public class NumPartPanel extends StandarPanel {

    /**
     * Creates new form WelcomeScreen
     * @param mainFrame
     */
    public NumPartPanel(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btSiguiente = new javax.swing.JButton();
        cbxNumPart = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Numero de Participantes");

        btSiguiente.setText("Siguiente");
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });

        cbxNumPart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "8", "16", "32" }));
        cbxNumPart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumPartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(cbxNumPart, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addComponent(cbxNumPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        int num = Integer.parseInt((String) cbxNumPart.getSelectedItem());
        super.getMainFrame().createRegistroPanels(num);
        super.getMainFrame().switchToRegistroPanel(0);
    }//GEN-LAST:event_btSiguienteActionPerformed

    private void cbxNumPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumPartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNumPartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSiguiente;
    private javax.swing.JComboBox<String> cbxNumPart;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
