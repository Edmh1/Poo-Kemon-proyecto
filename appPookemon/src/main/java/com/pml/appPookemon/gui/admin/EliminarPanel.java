/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.admin;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.datos.conf_arena.controller.ArenaController;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;
import org.jdesktop.swingx.prompt.PromptSupport;

/**
 *
 * @author eddie
 */
public class EliminarPanel extends StandarPanel {

    private String nombre;
    private String nombreBuscado;
    private String elementoBuscado;
    private String tipoBuscado;

    
    /**
     * Creates new form EliminarPanel
     */
    public EliminarPanel(MainFrame mainFrame) {    
        super(mainFrame);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings(value = "unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbEliminar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        jpResultado = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbImg1 = new javax.swing.JLabel();
        lbImg2 = new javax.swing.JLabel();
        btEliminar = new javax.swing.JButton();

        lbEliminar.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbEliminar.setText("Eliminar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jpResultado.setBackground(new java.awt.Color(204, 204, 204));

        lbNombre.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        lbNombre.setText("Nombre ");

        javax.swing.GroupLayout jpResultadoLayout = new javax.swing.GroupLayout(jpResultado);
        jpResultado.setLayout(jpResultadoLayout);
        jpResultadoLayout.setHorizontalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbNombre)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpResultadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jpResultadoLayout.setVerticalGroup(
            jpResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpResultadoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbNombre)
                .addGap(18, 18, 18)
                .addComponent(lbImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(lbEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(lbEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jpResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        if(nombre.equalsIgnoreCase("Pookemon")){
            buscarPookemon();
        }else{
            buscarMovimiento();
        }   
        // hacer getElemento 
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        ArenaController arena = new ArenaController();
        
        if(!nombreBuscado.equalsIgnoreCase(" ") && elementoBuscado!=null && nombre.equalsIgnoreCase("pookemon")){
            arena.eliminarPookemon(nombreBuscado);
            cleanContent();
            JOptionPane.showMessageDialog(this, "El pookemon fue eliminado correctamente");
        } else if(!nombreBuscado.equalsIgnoreCase(" ") && elementoBuscado!=null && nombre.equalsIgnoreCase("movimiento")){
            arena.eliminarMovimiento(nombreBuscado);
            cleanContent();
            JOptionPane.showMessageDialog(this, "El movimiento fue eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro el "+nombre.toLowerCase()+" buscado");
        }
    }//GEN-LAST:event_btEliminarActionPerformed
    private void buscarPookemon(){
        ArenaController arena = new ArenaController();
        
        nombreBuscado = txtBuscar.getText();
        elementoBuscado = arena.buscarElementoPookemon(nombreBuscado);
        
        //funcion que busca un pookemon
        String tmp = nombreBuscado;
        String tipo = elementoBuscado;
        
        URL resource1 = getClass().getResource("/img/SpritesPookemon/"+tmp+".gif");
        URL resource2 = getClass().getResource("/img/Ele"+tipo+".png");
        if(resource1 == null || resource2 == null){
            tmp = "Desconocido";
            resource1 = getClass().getResource("/img/null.jpg");
            resource2 = getClass().getResource("/img/null.jpg");
        }
        ((JLabel) jpResultado.getComponent(0)).setText(tmp);
        ImageIcon imageIcon1 = new ImageIcon(resource1);
        ImageIcon imageIcon2 = new ImageIcon(resource2);
        lbImg1.setIcon(imageIcon1);
        lbImg2.setIcon(imageIcon2);
    }
    private void buscarMovimiento(){
        ArenaController arena = new ArenaController();
        
        nombreBuscado = txtBuscar.getText();
        elementoBuscado = arena.buscarElementoMovimiento(nombreBuscado);
        tipoBuscado = arena.buscarTipoMovimiento(nombreBuscado);
        //funcion que busca un movimietno
        String tmp = elementoBuscado;
        String tipo = tipoBuscado;
        
        URL resource1 = getClass().getResource("/img/Ele"+tmp+".png");
        URL resource2 = getClass().getResource("/img/"+tipo+".png");
        if(resource1 == null){
            nombreBuscado = "Desconocido";
            resource1 = getClass().getResource("/img/null.jpg");
            resource2 = getClass().getResource("/img/null.jpg");
        }
        ((JLabel) jpResultado.getComponent(0)).setText(nombreBuscado);
        ImageIcon imageIcon1 = new ImageIcon(resource1);
        ImageIcon imageIcon2 = new ImageIcon(resource2);
        lbImg1.setIcon(imageIcon1);
        lbImg2.setIcon(imageIcon2);
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void configurarContenido() {
        cleanContent();
        String lb = "Eliminar: "+" "+nombre;
        lbEliminar.setText(lb);
        if(nombre.equalsIgnoreCase("pookemon")){
            configurarParaPookemon();
        }else{
            configurarParaMovimiento();
        }
    }
    
    private void configurarParaPookemon() {
        PromptSupport.setPrompt("Escriba el nombre del Pookemon", txtBuscar);
    }

    private void configurarParaMovimiento() {
        PromptSupport.setPrompt("Escriba el nombre del Movimiento", txtBuscar);
    }
    
    private void cleanContent() {
        ((JLabel) jpResultado.getComponent(0)).setText("Nombre");
        ImageIcon emptyIcon = new ImageIcon(getClass().getResource("/img/null.jpg"));
        lbImg1.setIcon(emptyIcon);
        lbImg2.setIcon(emptyIcon);
        txtBuscar.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JPanel jpResultado;
    private javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbImg1;
    private javax.swing.JLabel lbImg2;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    

}
