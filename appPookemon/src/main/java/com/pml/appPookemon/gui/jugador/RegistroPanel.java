/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.jugador;

import main.java.com.pml.appPookemon.excepciones.NumeroEnTextoException;
import main.java.com.pml.appPookemon.excepciones.ElementoNoSeleccionadoException;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.datos.conf_arena.controller.BatallaController;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;

/**
 *
 * @author eddie
 */
public class RegistroPanel extends StandarPanel {

    private int indice;
    private String generoSeleccionado = "";
    /**
     * Creates new form RegistroPanel
     * @param mainFrame
     * @param indice
     */
    public RegistroPanel(MainFrame mainFrame, int indice) {
        super(mainFrame);
        this.indice = indice;
        initComponents();
        
        String lb = lbEntrenador.getText()+" "+indice;
        lbEntrenador.setText(lb);
    }
    
    private Entrenador crearJugador() throws NumeroEnTextoException, ElementoNoSeleccionadoException{
        String nombre = txtNombre.getText();
        String genero = generoSeleccionado;
         if (!nombre.matches("[a-zA-Z\\s]+") || nombre.trim().isEmpty()) {
            throw new NumeroEnTextoException("El texto contiene números.");
            }
         if(genero.trim().isEmpty()){
             throw new ElementoNoSeleccionadoException("No se seleccionó ningún género");
         }
        Entrenador e = new Entrenador(nombre, genero);
        return e;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        lbEntrenador = new javax.swing.JLabel();
        btSiguiente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFemenino = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();

        lbEntrenador.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbEntrenador.setText("Entrenador");

        btSiguiente.setText("Siguiente");
        btSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSiguienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        jLabel3.setText("Sexo: ");

        bgGenero.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbMasculino.setBorderPainted(true);
        rbMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbMasculino.setFocusCycleRoot(true);
        rbMasculino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/entrenador.png"))); // NOI18N
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        bgGenero.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbFemenino.setBorderPainted(true);
        rbFemenino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rbFemenino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/entrenadora.png"))); // NOI18N
        rbFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemeninoActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lbEntrenador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(31, 31, 31)
                                .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbEntrenador)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rbMasculino)
                    .addComponent(rbFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSiguienteActionPerformed
        Entrenador e = null;
        boolean bandera = false;
        boolean banderaG = false;
        
        try {
            e = crearJugador();
        } catch (NumeroEnTextoException ex) {
            JOptionPane.showMessageDialog(null, "El nombre no puede tener números o estar en blanco", "Error", JOptionPane.ERROR_MESSAGE);
            bandera = true;
        } catch (ElementoNoSeleccionadoException ex) {
            JOptionPane.showMessageDialog(null, "Género no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
            banderaG = true;
        }
        
        if(bandera || banderaG){
            
        }else{
            super.getMainFrame().getBatallaPanel().agregarEntrenador(indice, e);
            super.getMainFrame().switchToRegistroPanel(++indice);
        }
        
    }//GEN-LAST:event_btSiguienteActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        if (rbMasculino.isSelected()) {
            generoSeleccionado = "Masculino";
            rbMasculino.setBackground(Color.BLUE);
            rbFemenino.setBackground(Color.WHITE); 
        }
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemeninoActionPerformed
        if (rbFemenino.isSelected()) {
            generoSeleccionado = "Femenino";
            rbFemenino.setBackground(Color.RED);
            rbMasculino.setBackground(Color.WHITE); 
        }
    }//GEN-LAST:event_rbFemeninoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    public void setIndice(int indice) {
        this.indice = indice;
    }
    public int getIndice(){
        return indice;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JButton btSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbEntrenador;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
