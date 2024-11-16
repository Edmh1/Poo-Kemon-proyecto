/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.pml.appPookemon.gui.batalla;

import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;
import main.java.com.pml.appPookemon.datos.conf_arena.controller.BatallaController;

/**
 *
 * @author sebac
 */
public class PPsFrame extends javax.swing.JFrame {
    
    private BatallaObjeto bo;
    private BatallaPanel bp;
    private BatallaController controlador;
    private Movimiento mov1;
    private Movimiento mov2;
    private Movimiento mov3;
    private int idMovimiento;
    
    public PPsFrame(BatallaController bc, BatallaPanel bp, BatallaObjeto bo) {
        this.bo = bo;
        this.bp = bp;
        this.controlador = bc;
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

        btMov1 = new javax.swing.JButton();
        lbNombrePookemon = new javax.swing.JLabel();
        lbPPsMov3 = new javax.swing.JLabel();
        lbPPsMov2 = new javax.swing.JLabel();
        lbPPsMov1 = new javax.swing.JLabel();
        btUsar = new javax.swing.JButton();
        btMov2 = new javax.swing.JButton();
        btMov3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btMov1.setText("Mov1");
        btMov1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMov1ActionPerformed(evt);
            }
        });

        lbNombrePookemon.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNombrePookemon.setText("Movimientos del pookemon");

        lbPPsMov3.setText("PPs mov3");

        lbPPsMov2.setText("PPs mov2");

        lbPPsMov1.setText("PPs mov1");

        btUsar.setText("Usar");
        btUsar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsarActionPerformed(evt);
            }
        });

        btMov2.setText("Mov2");
        btMov2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMov2ActionPerformed(evt);
            }
        });

        btMov3.setText("Mov3");
        btMov3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMov3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbPPsMov1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPPsMov2)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbNombrePookemon))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btMov1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMov2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btUsar)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lbPPsMov3))
                                .addComponent(btMov3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(84, 84, 84)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lbNombrePookemon)
                    .addGap(43, 43, 43)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btMov1)
                        .addComponent(btMov2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbPPsMov1)
                        .addComponent(lbPPsMov2))
                    .addGap(18, 18, 18)
                    .addComponent(btMov3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lbPPsMov3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                    .addComponent(btUsar)
                    .addGap(33, 33, 33)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMov1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMov1ActionPerformed
        idMovimiento = mov1.getIdMovimiento();
    }//GEN-LAST:event_btMov1ActionPerformed

    private void btMov3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMov3ActionPerformed
        idMovimiento = mov2.getIdMovimiento();
    }//GEN-LAST:event_btMov3ActionPerformed

    private void btMov2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMov2ActionPerformed
        idMovimiento = mov3.getIdMovimiento();
    }//GEN-LAST:event_btMov2ActionPerformed

    private void btUsarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsarActionPerformed
        int turno = bp.getTurnoJugador();
        controlador.setAccionEntrenador(turno, "OBJETO_PPS", idMovimiento);
        if(turno == 1){
            bp.pasarJugador();
        }else{
            bp.pasarJugador();
            bp.realizarTurno();
            bp.configurarImagenes();
            bp.configurarTextos();
            bp.actualizarVidaVisual();
        }
        bp.configurarFlecha();
        bo.dispose();
        dispose();
    }//GEN-LAST:event_btUsarActionPerformed
    
    public void configurar(int turno){
        Entrenador e = null;
        if(turno == 1){
            e = controlador.getEntrenador1();
        }else{
            e = controlador.getEntrenador2();
        }
        
        lbNombrePookemon.setText("Movimientos de " + e.getPookemonActual().getNombrePookemon());
        mov1 = e.getPookemonActual().getMovimientos().get(0);
        mov2 = e.getPookemonActual().getMovimientos().get(1);
        mov3 = e.getPookemonActual().getMovimientos().get(2);
        btMov1.setText(mov1.getNombreMovimiento());
        btMov2.setText(mov2.getNombreMovimiento());
        btMov3.setText(mov3.getNombreMovimiento());
        lbPPsMov1.setText("PPs " + mov1.getCantidadPP() + "/" + mov1.getCantidadMaximaPPs());
        lbPPsMov2.setText("PPs " + mov2.getCantidadPP() + "/" + mov2.getCantidadMaximaPPs());
        lbPPsMov3.setText("PPs " + mov3.getCantidadPP() + "/" + mov3.getCantidadMaximaPPs());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btMov1;
    private javax.swing.JButton btMov2;
    private javax.swing.JButton btMov3;
    private javax.swing.JButton btUsar;
    private javax.swing.JLabel lbNombrePookemon;
    private javax.swing.JLabel lbPPsMov1;
    private javax.swing.JLabel lbPPsMov2;
    private javax.swing.JLabel lbPPsMov3;
    // End of variables declaration//GEN-END:variables
}
