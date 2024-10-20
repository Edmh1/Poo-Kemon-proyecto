/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.admin;

import java.io.File;
import javax.swing.JFileChooser;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;
import org.jdesktop.swingx.prompt.PromptSupport;


/**
 *
 * @author eddie
 */
public class AgregarPanel extends StandarPanel {

    private String nombre;
    /**
     * Creates new form AgregarPanel
     */
    public AgregarPanel(MainFrame mainFrame) {
        super(mainFrame);
        initComponents();
    }
    
    public void configurarContenido(){
        String lb = "Agregar: "+" "+nombre;
        lbAgregar.setText(lb);
        if(nombre.equalsIgnoreCase("pookemon")){
            configurarParaPookemon();
        }else{
            configurarParaMovimiento();
        }
        //configurarElemento(); Agregar Elementos de manera Dinamica
    }

    private void configurarParaPookemon() {
        PromptSupport.setPrompt("NOMBRE", txtCampo1);
        PromptSupport.setPrompt("VELOCIDAD", txtCampo2);
        PromptSupport.setPrompt("ATQ. FISICO", txtCampo3);
        PromptSupport.setPrompt("DEF. FISICA", txtCampo4);
        PromptSupport.setPrompt("ATQ. ESPECIAL", txtCampo5);
        PromptSupport.setPrompt("DEF. ESPECIAL", txtCampo6);
        
        jpPookemon.setVisible(true);
        jpMovimiento.setVisible(false);
        
        this.revalidate();
        this.repaint();
    }
    
    private void configurarParaMovimiento() {
        PromptSupport.setPrompt("NOMBRE", txtCampo1);
        PromptSupport.setPrompt("POTENCIA", txtCampo2);
        PromptSupport.setPrompt("PRECISIÓN", txtCampo3);
        PromptSupport.setPrompt("CANTIDAD PP'S", txtCampo4);
        
        //configurarEfectos(); Agregar efectos de manera Dinamica
        jpMovimiento.setVisible(true);
        jpPookemon.setVisible(false);
        
        this.revalidate();
        this.repaint();
    }
    
    private void configurarElemento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     private void configurarEfectos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void clearFields(){
        txtCampo1.setText("");
        txtCampo2.setText("");
        txtCampo3.setText("");
        txtCampo4.setText("");
        txtCampo5.setText("");
        txtCampo6.setText("");
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAgregar = new javax.swing.JLabel();
        txtCampo1 = new javax.swing.JTextField();
        txtCampo2 = new javax.swing.JTextField();
        txtCampo3 = new javax.swing.JTextField();
        txtCampo4 = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();
        btExaminar = new javax.swing.JButton();
        lblFilePath = new javax.swing.JLabel();
        jpMovimiento = new javax.swing.JPanel();
        jcbEfecto = new javax.swing.JComboBox<>();
        jcbTipo = new javax.swing.JComboBox<>();
        jpPookemon = new javax.swing.JPanel();
        txtCampo5 = new javax.swing.JTextField();
        txtCampo6 = new javax.swing.JTextField();
        jcbElemento = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbAgregar.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbAgregar.setText("Agregar: ");
        add(lbAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 36, -1, -1));

        txtCampo1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampo1ActionPerformed(evt);
            }
        });
        add(txtCampo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 114, 150, -1));

        txtCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCampo2ActionPerformed(evt);
            }
        });
        add(txtCampo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 182, 150, -1));
        add(txtCampo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 246, 150, -1));
        add(txtCampo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 306, 150, -1));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 390, 165, 38));

        btExaminar.setText("Examinar...");
        btExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExaminarActionPerformed(evt);
            }
        });
        add(btExaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 150, -1));

        lblFilePath.setText("Subir archivo:");
        add(lblFilePath, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jcbEfecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efe. Quemadura", "Efe. Dormilon", "Efe. Enamoramiento" }));

        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mov. Fisico", "Mov. Especial" }));

        javax.swing.GroupLayout jpMovimientoLayout = new javax.swing.GroupLayout(jpMovimiento);
        jpMovimiento.setLayout(jpMovimientoLayout);
        jpMovimientoLayout.setHorizontalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMovimientoLayout.createSequentialGroup()
                .addGroup(jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                    .addComponent(jcbEfecto, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jpMovimientoLayout.setVerticalGroup(
            jpMovimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMovimientoLayout.createSequentialGroup()
                .addComponent(jcbEfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 170, 90));

        javax.swing.GroupLayout jpPookemonLayout = new javax.swing.GroupLayout(jpPookemon);
        jpPookemon.setLayout(jpPookemonLayout);
        jpPookemonLayout.setHorizontalGroup(
            jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPookemonLayout.createSequentialGroup()
                .addGroup(jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCampo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(txtCampo5, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        jpPookemonLayout.setVerticalGroup(
            jpPookemonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPookemonLayout.createSequentialGroup()
                .addComponent(txtCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jpPookemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 114, 160, 93));

        jcbElemento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fuego", "Agua", "Dragon", "Piedra" }));
        add(jcbElemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampo1ActionPerformed

    private void txtCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCampo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCampo2ActionPerformed

    private void btExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExaminarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(AgregarPanel.this);

        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            lblFilePath.setText("Archivo selecionado correctamente");
        } else {
            lblFilePath.setText("No se seleccionó ningún archivo.");
        }
    }//GEN-LAST:event_btExaminarActionPerformed

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btExaminar;
    private javax.swing.JComboBox<String> jcbEfecto;
    private javax.swing.JComboBox<String> jcbElemento;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JPanel jpMovimiento;
    private javax.swing.JPanel jpPookemon;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JLabel lblFilePath;
    private javax.swing.JTextField txtCampo1;
    private javax.swing.JTextField txtCampo2;
    private javax.swing.JTextField txtCampo3;
    private javax.swing.JTextField txtCampo4;
    private javax.swing.JTextField txtCampo5;
    private javax.swing.JTextField txtCampo6;
    // End of variables declaration//GEN-END:variables
  
}
