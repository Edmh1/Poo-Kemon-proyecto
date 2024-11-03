package main.java.com.pml.appPookemon.gui.batalla;

import main.java.com.pml.appPookemon.datos.torneo.model.Batalla;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import main.java.com.pml.appPookemon.datos.torneo.controller.BatallaController;
import main.java.com.pml.appPookemon.datos.pookemon.model.Movimiento;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoEspecial;
import main.java.com.pml.appPookemon.datos.pookemon.model.MovimientoFisico;
import main.java.com.pml.appPookemon.datos.pookemon.model.Pookemon;
import main.java.com.pml.appPookemon.datos.registro.model.Entrenador;
import main.java.com.pml.appPookemon.gui.MainFrame;
import main.java.com.pml.appPookemon.gui.config.StandarPanel;

/**
 *
 * @author feder
 */
public class BatallaPanel extends StandarPanel {

    private Entrenador j1;
    private Entrenador j2;
    private Entrenador[] entrenadores;
    private Batalla batalla;
    private BatallaController controlador;

    /**
     * Creates new form BatallaPrincipal
     */
    public BatallaPanel(MainFrame mainFrame) {
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

        lb_nombrePookemon_1 = new javax.swing.JLabel();
        btAtacar = new javax.swing.JButton();
        btDefender = new javax.swing.JButton();
        btCambiar = new javax.swing.JButton();
        btObjeto = new javax.swing.JButton();
        lb_nombrePookemon_2 = new javax.swing.JLabel();
        lbVidaPookemon1 = new javax.swing.JLabel();
        lbVidaPookemon2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLog = new javax.swing.JTextArea();
        imgPookemon1 = new javax.swing.JLabel();
        pbVida1 = new javax.swing.JProgressBar();
        pbVida2 = new javax.swing.JProgressBar();
        imgPookemon2 = new javax.swing.JLabel();

        lb_nombrePookemon_1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_nombrePookemon_1.setText("Nombre Pookemon");
        lb_nombrePookemon_1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lb_nombrePookemon_1ComponentAdded(evt);
            }
        });
        lb_nombrePookemon_1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lb_nombrePookemon_1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lb_nombrePookemon_1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lb_nombrePookemon_1ComponentShown(evt);
            }
        });

        btAtacar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btAtacar.setText("ATACAR");
        btAtacar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtacarActionPerformed(evt);
            }
        });

        btDefender.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btDefender.setText("DEFENDER");
        btDefender.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDefenderActionPerformed(evt);
            }
        });

        btCambiar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btCambiar.setText("CAMBIAR");
        btCambiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambiarActionPerformed(evt);
            }
        });

        btObjeto.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btObjeto.setText("OBJETOS");
        btObjeto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObjetoActionPerformed(evt);
            }
        });

        lb_nombrePookemon_2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lb_nombrePookemon_2.setText("Nombre Pookemon");

        lbVidaPookemon1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbVidaPookemon1.setText("HP");

        lbVidaPookemon2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lbVidaPookemon2.setText("HP");

        txtAreaLog.setEditable(false);
        txtAreaLog.setColumns(20);
        txtAreaLog.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtAreaLog.setRows(5);
        jScrollPane1.setViewportView(txtAreaLog);

        imgPookemon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/EleLucha.png"))); // NOI18N

        pbVida1.setValue(50);

        imgPookemon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/resources/img/EleAcero.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAtacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDefender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_nombrePookemon_1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbVidaPookemon1)
                        .addComponent(pbVida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(198, 198, 198)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(lbVidaPookemon2)
                        .addGap(200, 200, 200))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pbVida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_nombrePookemon_2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(imgPookemon1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imgPookemon2)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombrePookemon_1)
                    .addComponent(lb_nombrePookemon_2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pbVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(imgPookemon1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbVidaPookemon2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbVidaPookemon1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pbVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgPookemon2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btAtacar)
                            .addComponent(btDefender))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btCambiar)
                            .addComponent(btObjeto))
                        .addGap(63, 63, 63))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDefenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDefenderActionPerformed

    private void btCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCambiarActionPerformed
        BatallaCambio cambio = new BatallaCambio(controlador);
        cambio.configurar();
        cambio.setVisible(true);
    }//GEN-LAST:event_btCambiarActionPerformed

    private void btObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObjetoActionPerformed
        BatallaObjeto objeto = new BatallaObjeto(controlador);
        objeto.configurar();
        objeto.setVisible(true);
    }//GEN-LAST:event_btObjetoActionPerformed

    private void lb_nombrePookemon_1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lb_nombrePookemon_1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_nombrePookemon_1ComponentShown

    private void lb_nombrePookemon_1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lb_nombrePookemon_1AncestorAdded

    }//GEN-LAST:event_lb_nombrePookemon_1AncestorAdded

    private void lb_nombrePookemon_1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lb_nombrePookemon_1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_nombrePookemon_1ComponentAdded

    private void btAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtacarActionPerformed
        BatallaAtaque ataques = new BatallaAtaque(controlador);
        ataques.configurar();
        ataques.setVisible(true);
        
    }//GEN-LAST:event_btAtacarActionPerformed

    // Método para cambiar la imagen del personaje 
    // FALTA TERMINAR 
    public void cambiarImagenPersonaje(String rutaImagen) {
        // Cargar la imagen desde la ruta especificada
        ImageIcon icon = new ImageIcon(getClass().getResource(rutaImagen));
        // Asignar la imagen al JLabel
        imgPookemon1.setIcon(icon);
    }

    public void configurar() {
        entrenadores = super.getMainFrame().getController().batallaActual();
        j1 = entrenadores[0];
        j2 = entrenadores[1];
        batalla = new Batalla(0, j1, j2, pookemonesYVainasFalsasloljaja());
        batalla.generarMazo();
        controlador = new BatallaController(batalla);
        configurarTextos();
        configurarImagenes();
    }

    public void configurarTextos() {
        Pookemon j1Pookemon = controlador.getEntrenador1().getPookemonActual();
        Pookemon j2Pookemon = controlador.getEntrenador2().getPookemonActual();
        int vidaPookemon1 = j1Pookemon.getEstadisticaPookemon().getVida();
        int vidaPookemon2 = j2Pookemon.getEstadisticaPookemon().getVida();

        lb_nombrePookemon_1.setText(j1Pookemon.getNombrePookemon());
        lb_nombrePookemon_2.setText(j2Pookemon.getNombrePookemon());
        lbVidaPookemon1.setText("HP  " + vidaPookemon1);
        lbVidaPookemon2.setText("HP  " + vidaPookemon2);
        pbVida1.setMaximum(vidaPookemon1);
        pbVida2.setMaximum(vidaPookemon2);
        pbVida1.setValue(vidaPookemon1);
        pbVida2.setValue(vidaPookemon2);
    }

    public void configurarImagenes() {
        String nombre1 = controlador.getEntrenador1().getPookemonActual().getNombrePookemon().toLowerCase();
        String nombre2 = controlador.getEntrenador2().getPookemonActual().getNombrePookemon().toLowerCase();
        URL imagen1 = getClass().getResource("/img/SpritesPookemon/" + nombre1 + ".gif");
        URL imagen2 = getClass().getResource("/img/SpritesPookemon/" + nombre2 + ".gif");
        ImageIcon img1 = new ImageIcon(imagen1);
        ImageIcon img2 = new ImageIcon(imagen2);
        imgPookemon1.setIcon(img1);
        imgPookemon2.setIcon(img2);
    }
    
    


    /*
       *******************************************************************
       *     FUNCIÓN FALSA QUE AGREGA LOS POOKEMONES YA CREADOS          *
       *     XDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD          *
       *******************************************************************
     */
    public ArrayList<Pookemon> pookemonesYVainasFalsasloljaja() {
        Pookemon Roserade = new Pookemon(407, "Roserade", "planta");
        Roserade.inicializarEstadistica(60, 70, 65, 125, 105, 90);

        Pookemon Venusaur = new Pookemon(3, "Venusaur", "planta");
        Venusaur.inicializarEstadistica(80, 82, 83, 100, 100, 80);

        Pookemon Typhlosion = new Pookemon(157, "Typhlosion", "fuego");
        Typhlosion.inicializarEstadistica(78, 84, 78, 109, 85, 100);

        Pookemon Gyarados = new Pookemon(130, "Gyarados", "agua");
        Gyarados.inicializarEstadistica(95, 125, 79, 60, 100, 81);

        Pookemon Milotic = new Pookemon(350, "Milotic", "agua");
        Milotic.inicializarEstadistica(95, 60, 79, 100, 125, 81);

        Pookemon Greninja = new Pookemon(658, "Greninja", "agua");
        Greninja.inicializarEstadistica(72, 95, 67, 103, 71, 122);

        Pookemon Raichu = new Pookemon(26, "Raichu", "electrico");
        Raichu.inicializarEstadistica(60, 90, 55, 90, 80, 110);

        Pookemon Nidoking = new Pookemon(34, "Nidoking", "veneno");
        Nidoking.inicializarEstadistica(81, 102, 77, 85, 75, 85);

        Pookemon Alakazam = new Pookemon(65, "Alakazam", "psiquico");
        Alakazam.inicializarEstadistica(55, 50, 45, 135, 95, 120);

        Pookemon Hypno = new Pookemon(97, "Hypno", "psiquico");
        Hypno.inicializarEstadistica(85, 73, 70, 73, 115, 67);

        Pookemon Lucario = new Pookemon(448, "Lucario", "lucha");
        Lucario.inicializarEstadistica(70, 110, 70, 115, 70, 90);

        Pookemon Tyranitar = new Pookemon(248, "Tyranitar", "roca");
        Tyranitar.inicializarEstadistica(100, 134, 110, 95, 100, 61);

        Pookemon Gengar = new Pookemon(94, "Gengar", "fantasma");
        Gengar.inicializarEstadistica(60, 65, 60, 130, 75, 110);

        Pookemon Clefable = new Pookemon(36, "Clefable", "hada");
        Clefable.inicializarEstadistica(95, 70, 73, 95, 90, 60);

        Pookemon Snorlax = new Pookemon(143, "Snorlax", "normal");
        Snorlax.inicializarEstadistica(160, 110, 65, 65, 110, 30);

        Pookemon Blissey = new Pookemon(242, "Blissey", "normal");
        Blissey.inicializarEstadistica(255, 10, 10, 75, 135, 55);

        Pookemon Dragonite = new Pookemon(149, "Dragonite", "dragon");
        Dragonite.inicializarEstadistica(91, 134, 95, 100, 100, 80);

        Pookemon Heracross = new Pookemon(214, "Heracross", "bicho");
        Heracross.inicializarEstadistica(80, 125, 75, 40, 95, 85);

        Pookemon Volcarona = new Pookemon(637, "Volcarona", "bicho");
        Volcarona.inicializarEstadistica(85, 60, 65, 135, 105, 100);

        Pookemon Metagross = new Pookemon(376, "Metagross", "acero");
        Metagross.inicializarEstadistica(80, 135, 130, 95, 90, 70);

        Pookemon Excadrill = new Pookemon(530, "Excadrill", "tierra");
        Excadrill.inicializarEstadistica(110, 135, 60, 50, 65, 88);

        Pookemon Hydreigon = new Pookemon(635, "Hydreigon", "siniestro");
        Hydreigon.inicializarEstadistica(92, 105, 90, 125, 90, 98);

        Pookemon Staraptor = new Pookemon(398, "Staraptor", "volador");
        Staraptor.inicializarEstadistica(85, 120, 70, 50, 60, 100);

        Pookemon Lapras = new Pookemon(131, "Lapras", "hielo");
        Lapras.inicializarEstadistica(130, 85, 80, 85, 95, 60);

        Pookemon Weavile = new Pookemon(461, "Weavile", "hielo");
        Weavile.inicializarEstadistica(70, 120, 65, 45, 85, 125);

        Movimiento Lanzallamas = new MovimientoEspecial(1, "Lanzallamas", 90, 100, 10, "fuego", null);
        Movimiento PunoFuego = new MovimientoFisico(2, "Puño Fuego", 75, 100, 15, "fuego", null);
        Movimiento Llamarada = new MovimientoEspecial(3, "Llamarada", 110, 85, 5, "fuego", null);
        Movimiento Hidroariete = new MovimientoFisico(4, "Hidroariete", 85, 100, 10, "agua", null);
        Movimiento Escaldar = new MovimientoEspecial(5, "Escaldar", 80, 100, 10, "agua", null);
        Movimiento Hidrobomba = new MovimientoEspecial(6, "Hidrobomba", 120, 80, 5, "agua", null);
        Movimiento Energibola = new MovimientoEspecial(7, "Energibola", 90, 100, 10, "planta", null);
        Movimiento BombaGermen = new MovimientoFisico(8, "Bomba Germen", 80, 100, 15, "planta", null);
        Movimiento Latigazo = new MovimientoFisico(9, "Latigazo", 120, 85, 10, "planta", null);
        Movimiento Rayo = new MovimientoEspecial(10, "Rayo", 90, 100, 10, "electrico", null);
        Movimiento PunoTrueno = new MovimientoFisico(11, "Puño Trueno", 75, 100, 15, "electrico", null);
        Movimiento Trueno = new MovimientoEspecial(12, "Trueno", 110, 70, 10, "electrico", null);
        Movimiento Terremoto = new MovimientoFisico(13, "Terremoto", 100, 100, 10, "tierra", null);
        Movimiento TierraViva = new MovimientoEspecial(14, "Tierra Viva", 90, 100, 10, "tierra", null);
        Movimiento RocaAfilada = new MovimientoFisico(15, "Roca Afilada", 100, 80, 5, "roca", null);
        Movimiento JoyaDeLuz = new MovimientoEspecial(16, "Joya de Luz", 80, 100, 20, "roca", null);
        Movimiento Avalancha = new MovimientoFisico(17, "Avalancha", 75, 90, 10, "roca", null);
        Movimiento TajoAereo = new MovimientoEspecial(18, "Tajo Aereo", 75, 95, 15, "volador", null);
        Movimiento Vendaval = new MovimientoEspecial(19, "Vendaval", 110, 70, 10, "volador", null);
        Movimiento PicoTaladro = new MovimientoFisico(20, "Pico Taladro", 80, 100, 20, "volador", null);
        Movimiento BombaLodo = new MovimientoEspecial(21, "Bomba Lodo", 90, 100, 10, "veneno", null);
        Movimiento PuyaNociva = new MovimientoFisico(22, "Puya Nociva", 80, 100, 20, "veneno", null);
        Movimiento LanzaMugre = new MovimientoFisico(23, "Lanza Mugre", 120, 80, 5, "veneno", null);
        Movimiento Psiquico = new MovimientoEspecial(24, "Psiquico", 90, 100, 10, "psiquico", null);
        Movimiento CabezazoZen = new MovimientoFisico(25, "Cabezazo Zen", 80, 90, 15, "psiquico", null);
        Movimiento Psicocorte = new MovimientoFisico(26, "Psicocorte", 70, 100, 20, "psiquico", null);
        Movimiento OndaCertera = new MovimientoEspecial(27, "Onda Certera", 120, 70, 5, "lucha", null);
        Movimiento ABocajarro = new MovimientoFisico(28, "ABocajarro", 120, 100, 5, "lucha", null);
        Movimiento Triturar = new MovimientoFisico(29, "Triturar", 80, 100, 15, "siniestro", null);
        Movimiento PulsoUmbrio = new MovimientoEspecial(30, "Pulso Umbrio", 80, 100, 15, "siniestro", null);
        Movimiento BolaSombra = new MovimientoEspecial(31, "Bola Sombra", 80, 100, 15, "fantasma", null);
        Movimiento GarraUmbria = new MovimientoFisico(32, "Garra Umbria", 70, 100, 15, "fantasma", null);
        Movimiento FocoResplandor = new MovimientoEspecial(33, "Foco Resplandor", 80, 100, 10, "acero", null);
        Movimiento CabezaDeHierro = new MovimientoFisico(34, "Cabeza de Hierro", 80, 100, 15, "acero", null);
        Movimiento FuerzaLunar = new MovimientoEspecial(35, "Fuerza Lunar", 95, 100, 15, "hada", null);
        Movimiento Carantona = new MovimientoFisico(36, "Carantoña", 90, 90, 10, "hada", null);
        Movimiento GarraDragon = new MovimientoFisico(37, "Garra Dragon", 80, 100, 15, "dragon", null);
        Movimiento PulsoDragon = new MovimientoEspecial(38, "Pulso Dragon", 85, 100, 10, "dragon", null);
        Movimiento PunoHielo = new MovimientoFisico(39, "Puño Hielo", 75, 100, 15, "hielo", null);
        Movimiento RayoHielo = new MovimientoEspecial(40, "Rayo Hielo", 90, 100, 10, "hielo", null);
        Movimiento Ventisca = new MovimientoEspecial(41, "Ventisca", 110, 70, 5, "hielo", null);
        Movimiento Megacuerno = new MovimientoFisico(42, "Megacuerno", 120, 85, 10, "bicho", null);
        Movimiento Zumbido = new MovimientoEspecial(43, "Zumbido", 90, 100, 10, "bicho", null);
        Movimiento TijeraX = new MovimientoFisico(44, "Tijera X", 80, 100, 15, "bicho", null);
        Movimiento Vozarron = new MovimientoEspecial(45, "Vozarron", 90, 100, 10, "normal", null);
        Movimiento GolpeCuerpo = new MovimientoFisico(46, "Golpe Cuerpo", 85, 100, 15, "normal", null);

        Roserade.setMovimientos(new ArrayList<>(Arrays.asList(Energibola, BombaGermen, BombaLodo, PuyaNociva)));
        Venusaur.setMovimientos(new ArrayList<>(Arrays.asList(Latigazo, BombaGermen, Energibola, BombaLodo)));
        Typhlosion.setMovimientos(new ArrayList<>(Arrays.asList(Lanzallamas, PunoFuego, Llamarada, Terremoto)));
        Gyarados.setMovimientos(new ArrayList<>(Arrays.asList(Hidroariete, Avalancha, Terremoto, RocaAfilada)));
        Milotic.setMovimientos(new ArrayList<>(Arrays.asList(Hidrobomba, Escaldar, TierraViva, RayoHielo)));
        Greninja.setMovimientos(new ArrayList<>(Arrays.asList(Hidrobomba, PulsoUmbrio, PuyaNociva, TijeraX)));
        Raichu.setMovimientos(new ArrayList<>(Arrays.asList(Rayo, PunoTrueno, Trueno, Vozarron)));
        Nidoking.setMovimientos(new ArrayList<>(Arrays.asList(Terremoto, PuyaNociva, LanzaMugre, CabezazoZen)));
        Alakazam.setMovimientos(new ArrayList<>(Arrays.asList(Psiquico, Psicocorte, FocoResplandor, Rayo)));
        Hypno.setMovimientos(new ArrayList<>(Arrays.asList(Psiquico, Vozarron, BombaLodo, GolpeCuerpo)));
        Lucario.setMovimientos(new ArrayList<>(Arrays.asList(ABocajarro, OndaCertera, Terremoto, CabezazoZen)));
        Tyranitar.setMovimientos(new ArrayList<>(Arrays.asList(Triturar, Terremoto, RocaAfilada, PuyaNociva)));
        Gengar.setMovimientos(new ArrayList<>(Arrays.asList(BolaSombra, PulsoUmbrio, OndaCertera, Psiquico)));
        Clefable.setMovimientos(new ArrayList<>(Arrays.asList(FuerzaLunar, Carantona, Vozarron, Rayo)));
        Snorlax.setMovimientos(new ArrayList<>(Arrays.asList(GolpeCuerpo, Terremoto, PunoFuego, Vozarron)));
        Blissey.setMovimientos(new ArrayList<>(Arrays.asList(FuerzaLunar, Vozarron, Rayo, Terremoto)));
        Dragonite.setMovimientos(new ArrayList<>(Arrays.asList(GarraDragon, PulsoDragon, Ventisca, PunoHielo)));
        Heracross.setMovimientos(new ArrayList<>(Arrays.asList(ABocajarro, Megacuerno, TijeraX, Terremoto)));
        Volcarona.setMovimientos(new ArrayList<>(Arrays.asList(Llamarada, Zumbido, Vendaval, FocoResplandor)));
        Metagross.setMovimientos(new ArrayList<>(Arrays.asList(CabezaDeHierro, PuyaNociva, CabezazoZen, Terremoto)));
        Excadrill.setMovimientos(new ArrayList<>(Arrays.asList(Terremoto, RocaAfilada, GarraUmbria, PuyaNociva)));
        Hydreigon.setMovimientos(new ArrayList<>(Arrays.asList(PulsoUmbrio, FocoResplandor, GarraDragon, Terremoto)));
        Staraptor.setMovimientos(new ArrayList<>(Arrays.asList(PicoTaladro, GolpeCuerpo, CabezazoZen, Terremoto)));
        Lapras.setMovimientos(new ArrayList<>(Arrays.asList(Ventisca, RayoHielo, Hidrobomba, Vozarron)));
        Weavile.setMovimientos(new ArrayList<>(Arrays.asList(GarraUmbria, Triturar, PunoHielo, Ventisca)));

        return new ArrayList<>(Arrays.asList(Roserade,Venusaur, Typhlosion, Gyarados, Milotic, Greninja, Raichu,
        Nidoking,Alakazam,Hypno,Lucario, Tyranitar,Gengar, Clefable, Snorlax, Blissey, Dragonite, Heracross,
        Volcarona, Metagross, Excadrill, Hydreigon, Staraptor, Lapras, Weavile));
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtacar;
    private javax.swing.JButton btCambiar;
    private javax.swing.JButton btDefender;
    private javax.swing.JButton btObjeto;
    private javax.swing.JLabel imgPookemon1;
    private javax.swing.JLabel imgPookemon2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbVidaPookemon1;
    private javax.swing.JLabel lbVidaPookemon2;
    private javax.swing.JLabel lb_nombrePookemon_1;
    private javax.swing.JLabel lb_nombrePookemon_2;
    private javax.swing.JProgressBar pbVida1;
    private javax.swing.JProgressBar pbVida2;
    private javax.swing.JTextArea txtAreaLog;
    // End of variables declaration//GEN-END:variables

}
