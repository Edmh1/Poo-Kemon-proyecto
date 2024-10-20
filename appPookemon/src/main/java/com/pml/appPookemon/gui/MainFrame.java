/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.java.com.pml.appPookemon.gui;

import main.java.com.pml.appPookemon.gui.jugador.ListoPanel;
import main.java.com.pml.appPookemon.gui.admin.AdminPanel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;
import main.java.com.pml.appPookemon.gui.admin.AgregarPanel;
import main.java.com.pml.appPookemon.gui.admin.EditarPanel;
import main.java.com.pml.appPookemon.gui.admin.EliminarPanel;
import main.java.com.pml.appPookemon.gui.admin.GestionPanel;
import main.java.com.pml.appPookemon.gui.admin.NumPartPanel;
import main.java.com.pml.appPookemon.gui.batalla.BatallaPanel;
import main.java.com.pml.appPookemon.gui.jugador.RegistroPanel;

/**
 *
 * @author eddie
 */
public class MainFrame extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private Stack<String> panelHistory;
    private List<RegistroPanel> registros;
    
    private AgregarPanel agrP;
    private EditarPanel ediP;
    private EliminarPanel eliP;
    
    private BatallaPanel batPri;
    /**
     * Creates new form Main
     */
    public MainFrame() {
        panelHistory = new Stack<>();
        initComponents();
        setupPanels();
    }
    
    private void setupPanels() {
        // Creamos el CardLayout
        cardLayout = new CardLayout();
        getContentPane().setLayout(cardLayout);

        // Instanciar los paneles
        WelcomePanel WelcomeP = new WelcomePanel(this);
        AdminPanel adminP = new AdminPanel(this);
        
        //paneles despues del iniciar torneo
        NumPartPanel numPartP = new NumPartPanel(this);
        registros = new ArrayList<>();
        ListoPanel listoP = new ListoPanel(this);
        //paneles despues del admin
        GestionPanel gestP = new GestionPanel(this);
        agrP = new AgregarPanel(this);
        ediP = new EditarPanel(this);
        eliP = new EliminarPanel(this);
        
        //paneles batalla
        
        batPri = new BatallaPanel(this);

        // Agregamos los paneles al CardLayout
        getContentPane().add(WelcomeP, "welcomeP");
        getContentPane().add(adminP, "adminP");
        getContentPane().add(numPartP, "numPartP");
        getContentPane().add(listoP, "listoP");
        getContentPane().add(gestP, "gestP");
        getContentPane().add(agrP, "agrP");
        getContentPane().add(ediP, "ediP");
        getContentPane().add(eliP, "eliP");
        getContentPane().add(batPri, "batPri");
        
        //evitar error al refrescar
        getContentPane().revalidate();
        getContentPane().repaint();
        
        // Mostrar el primer panel por defecto
        switchToWelcomePanel();
    }

    // Método para cambiar entre paneles
    private void switchPanel(String panelName) {
        cardLayout.show(getContentPane(), panelName);
        panelHistory.push(panelName);
    }

    public void switchToWelcomePanel() {
        switchPanel("welcomeP");
    }
    public void switchToAdminPanel() {
        switchPanel("adminP");
    }
    public void switchToNumeroPartPanel() {
        switchPanel("numPartP");
    }
    public void switchToListoPanel() {
        switchPanel("listoP");
    }
    public void switchToGestionPanel() {
        switchPanel("gestP");
    }
    public void switchToAgregarPanel(String nombre) {
        agrP.setNombre(nombre);
        agrP.configurarContenido();
        switchPanel("agrP");
    }
    public void switchToEditarPanel(String nombre) {
        ediP.setNombre(nombre);
        ediP.configurarContenido();
        switchPanel("ediP");
    }
    public void switchToEliminarPanel(String nombre) {
        ediP.setNombre(nombre);
        ediP.configurarContenido();
        switchPanel("eliP");
    }
    public void switchToRegistroPanel(int indice) {
        if (indice < registros.size()) {
            switchPanel("regP" +indice);
        } else {
            switchToListoPanel();
        }    
    }
    
    public void switchToBatallaPnel(){
        switchPanel("batPri");
    }
    
    public void createRegistroPanels(int num) {
        registros.clear();
        getContentPane().removeAll();
        setupPanels();
        
        for (int i = 0; i < num; i++) {
            RegistroPanel regP = new RegistroPanel(this,i+1);
            registros.add(regP);
            getContentPane().add(regP, "regP" + i);
        }
        getContentPane().revalidate();
        getContentPane().repaint();
    }

    // Método para volver al último panel
    public void goBack() {
        if (panelHistory.size() > 1) { 
            panelHistory.pop();
            String previousPanel = panelHistory.peek();
            cardLayout.show(getContentPane(), previousPanel);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MnMenu = new javax.swing.JMenu();
        mniAtras = new javax.swing.JMenuItem();
        mniInicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pookemon");

        MnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/pokemon-go.png"))); // NOI18N
        MnMenu.setText("Menu");
        MnMenu.setFont(new java.awt.Font("sansserif", 1, 13)); // NOI18N
        MnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnMenuActionPerformed(evt);
            }
        });

        mniAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/arrow black.png"))); // NOI18N
        mniAtras.setText("volver");
        mniAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAtrasActionPerformed(evt);
            }
        });
        MnMenu.add(mniAtras);

        mniInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/home.png"))); // NOI18N
        mniInicio.setText("Inicio");
        mniInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInicioActionPerformed(evt);
            }
        });
        MnMenu.add(mniInicio);

        jMenuBar1.add(MnMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnMenuActionPerformed
       
    }//GEN-LAST:event_MnMenuActionPerformed

    private void mniAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAtrasActionPerformed
        goBack();
    }//GEN-LAST:event_mniAtrasActionPerformed

    private void mniInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInicioActionPerformed
        switchToWelcomePanel();
    }//GEN-LAST:event_mniInicioActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAtras;
    private javax.swing.JMenuItem mniInicio;
    // End of variables declaration//GEN-END:variables
}
