/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class FrmePrincipal extends javax.swing.JFrame {
    
    public static String genero = "";
    
    /**
     * Creates new form FrmePrincipal
     */
    public FrmePrincipal() {
        initComponents();
        //Colocamos el icono a nuestra app
        this.setIconImage(new ImageIcon(getClass().getResource("/imgGestiones/altaPeliculas (1).png")).getImage());
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnAñadirCli = new javax.swing.JButton();
        btnAñadirUsu = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnGestiones = new javax.swing.JButton();
        lblAñadirCli = new javax.swing.JLabel();
        lblAñadirUsu = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblGestiones = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        lblComedias = new javax.swing.JLabel();
        lblDrama = new javax.swing.JLabel();
        lblTerror = new javax.swing.JLabel();
        lblInfantiles = new javax.swing.JLabel();
        lblTodas = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        lblRomance = new javax.swing.JLabel();
        lblCrimen = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 214, 71));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        panelImage1.setBackground(new java.awt.Color(240, 203, 114));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/LOGONA.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 265;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 15);
        jPanel3.add(panelImage1, gridBagConstraints);

        btnAñadirCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/addCli.png"))); // NOI18N
        btnAñadirCli.setBorder(null);
        btnAñadirCli.setBorderPainted(false);
        btnAñadirCli.setContentAreaFilled(false);
        btnAñadirCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/addCli(1).png"))); // NOI18N
        btnAñadirCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirCliActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 80, 0, 0);
        jPanel3.add(btnAñadirCli, gridBagConstraints);

        btnAñadirUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/addUsu.png"))); // NOI18N
        btnAñadirUsu.setBorder(null);
        btnAñadirUsu.setContentAreaFilled(false);
        btnAñadirUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirUsu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/addUsu(1).png"))); // NOI18N
        btnAñadirUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirUsuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 80, 0, 0);
        jPanel3.add(btnAñadirUsu, gridBagConstraints);

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/reportes.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/reportes (1).png"))); // NOI18N
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 80, 0, 0);
        jPanel3.add(btnReportes, gridBagConstraints);

        btnGestiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/gestiones.png"))); // NOI18N
        btnGestiones.setBorder(null);
        btnGestiones.setBorderPainted(false);
        btnGestiones.setContentAreaFilled(false);
        btnGestiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestiones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/gestiones(1).png"))); // NOI18N
        btnGestiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 80, 0, 0);
        jPanel3.add(btnGestiones, gridBagConstraints);

        lblAñadirCli.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblAñadirCli.setText("Añadir Cliente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel3.add(lblAñadirCli, gridBagConstraints);

        lblAñadirUsu.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblAñadirUsu.setText("Añadir Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 0, 0);
        jPanel3.add(lblAñadirUsu, gridBagConstraints);

        lblReportes.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblReportes.setText("Reportes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 120, 0, 0);
        jPanel3.add(lblReportes, gridBagConstraints);

        lblGestiones.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblGestiones.setText("Gestiones");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 110, 145, 0);
        jPanel3.add(lblGestiones, gridBagConstraints);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaAccion.jpg"))); // NOI18N
        lblAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAccionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAccionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAccionMouseExited(evt);
            }
        });
        jPanel1.add(lblAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/accion.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        lblComedias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/Caratula.jpg"))); // NOI18N
        lblComedias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComedias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblComediasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComediasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComediasMouseExited(evt);
            }
        });
        jPanel1.add(lblComedias, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        lblDrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaDrama.jpg"))); // NOI18N
        lblDrama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDramaMouseExited(evt);
            }
        });
        jPanel1.add(lblDrama, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        lblTerror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTerror.jpg"))); // NOI18N
        lblTerror.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTerrorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTerrorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTerrorMouseExited(evt);
            }
        });
        jPanel1.add(lblTerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, -1, -1));

        lblInfantiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaInfantil.jpg"))); // NOI18N
        lblInfantiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfantiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfantilesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfantilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfantilesMouseExited(evt);
            }
        });
        jPanel1.add(lblInfantiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        lblTodas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTodas.png"))); // NOI18N
        lblTodas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTodas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTodasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTodasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTodasMouseExited(evt);
            }
        });
        jPanel1.add(lblTodas, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, -1, -1));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/comedias.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/drama.png"))); // NOI18N

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/terror.png"))); // NOI18N

        javax.swing.GroupLayout panelImage5Layout = new javax.swing.GroupLayout(panelImage5);
        panelImage5.setLayout(panelImage5Layout);
        panelImage5Layout.setHorizontalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage5Layout.setVerticalGroup(
            panelImage5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, -1));

        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/romanticas.png"))); // NOI18N

        javax.swing.GroupLayout panelImage6Layout = new javax.swing.GroupLayout(panelImage6);
        panelImage6.setLayout(panelImage6Layout);
        panelImage6Layout.setHorizontalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        panelImage6Layout.setVerticalGroup(
            panelImage6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/infantiles.png"))); // NOI18N

        javax.swing.GroupLayout panelImage7Layout = new javax.swing.GroupLayout(panelImage7);
        panelImage7.setLayout(panelImage7Layout);
        panelImage7Layout.setHorizontalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        panelImage7Layout.setVerticalGroup(
            panelImage7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 520, -1, -1));

        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/crimen.png"))); // NOI18N

        javax.swing.GroupLayout panelImage8Layout = new javax.swing.GroupLayout(panelImage8);
        panelImage8.setLayout(panelImage8Layout);
        panelImage8Layout.setHorizontalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage8Layout.setVerticalGroup(
            panelImage8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, -1, -1));

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/todas.png"))); // NOI18N

        javax.swing.GroupLayout panelImage9Layout = new javax.swing.GroupLayout(panelImage9);
        panelImage9.setLayout(panelImage9Layout);
        panelImage9Layout.setHorizontalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        panelImage9Layout.setVerticalGroup(
            panelImage9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, -1, -1));

        lblRomance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaRomance.jpg"))); // NOI18N
        lblRomance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRomance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRomanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRomanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRomanceMouseExited(evt);
            }
        });
        jPanel1.add(lblRomance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        lblCrimen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaCrimen.jpg"))); // NOI18N
        lblCrimen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrimen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCrimenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrimenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrimenMouseExited(evt);
            }
        });
        jPanel1.add(lblCrimen, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 870, 570));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/close door.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/open door.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 640, 50, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Salir");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 680, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 1, 0, 1);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAccionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccionMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgAccionGif;
        imgAccionGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/accionGif.gif"));
        lblAccion.setIcon(imgAccionGif);  
    }//GEN-LAST:event_lblAccionMouseEntered

    private void lblAccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccionMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgAccion;
        imgAccion = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaAccion.jpg"));
        lblAccion.setIcon(imgAccion);
    }//GEN-LAST:event_lblAccionMouseExited

    private void lblComediasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComediasMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgComediaGif;
        imgComediaGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/gifComedia.gif"));
        lblComedias.setIcon(imgComediaGif);
    }//GEN-LAST:event_lblComediasMouseEntered

    private void lblComediasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComediasMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgComedia;
        imgComedia = new ImageIcon(getClass().getResource("/imgFrmePrincipal/Caratula.jpg"));
        lblComedias.setIcon(imgComedia);   
    }//GEN-LAST:event_lblComediasMouseExited

    private void lblTerrorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerrorMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgTerrorGif;
        imgTerrorGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/terrorGif.gif"));
        lblTerror.setIcon(imgTerrorGif);
    }//GEN-LAST:event_lblTerrorMouseEntered

    private void lblTerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerrorMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgTerror;
        imgTerror = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTerror.jpg"));
        lblTerror.setIcon(imgTerror); 
    }//GEN-LAST:event_lblTerrorMouseExited

    private void lblInfantilesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfantilesMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgInfantilGif;
        imgInfantilGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/infantilGif.gif"));
        lblInfantiles.setIcon(imgInfantilGif);
    }//GEN-LAST:event_lblInfantilesMouseEntered

    private void lblInfantilesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfantilesMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgInfantil;
        imgInfantil = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaInfantil.jpg"));
        lblInfantiles.setIcon(imgInfantil); 
    }//GEN-LAST:event_lblInfantilesMouseExited

    private void lblTodasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTodasMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgTodasGif;
        imgTodasGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/todasGif.gif"));
        lblTodas.setIcon(imgTodasGif);
    }//GEN-LAST:event_lblTodasMouseEntered

    private void lblTodasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTodasMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgTodas;
        imgTodas = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTodas.png"));
        lblTodas.setIcon(imgTodas); 
    }//GEN-LAST:event_lblTodasMouseExited

    private void lblDramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDramaMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgDramaGif;
        imgDramaGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/dramaGif.gif"));
        lblDrama.setIcon(imgDramaGif);
    }//GEN-LAST:event_lblDramaMouseEntered

    private void lblDramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDramaMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgDrama;
        imgDrama = new ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaDrama.jpg"));
        lblDrama.setIcon(imgDrama);
    }//GEN-LAST:event_lblDramaMouseExited

    private void btnAñadirUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirUsuActionPerformed
        //Abrimos la ventana AñadirUsuario y hacemos visible la ventana
        JDRegistro miUsuario = new JDRegistro(null, true);
        miUsuario.setVisible(true);
    }//GEN-LAST:event_btnAñadirUsuActionPerformed

    private void btnAñadirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCliActionPerformed
        //Abrimos la ventana AñadirCliente y hacemos visible la ventana
        JDAñadirCliente miCliente = new JDAñadirCliente(null, true);
        miCliente.setVisible(true);
    }//GEN-LAST:event_btnAñadirCliActionPerformed

    private void btnGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionesActionPerformed
        //Abrimos la ventana Gestiones y hacemos visible la ventana
        JDGestiones misGestiones = new JDGestiones(null, true);
        misGestiones.setVisible(true);
    }//GEN-LAST:event_btnGestionesActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Instanciamos una ventana para preguntar si desea salir del sistema
        JDSalir salida = new JDSalir(null, true);
        salida.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void lblRomanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRomanceMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgRomanceGif;
        imgRomanceGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/romanceGif.gif"));
        lblRomance.setIcon(imgRomanceGif);
    }//GEN-LAST:event_lblRomanceMouseEntered

    private void lblRomanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRomanceMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgRomance;
        imgRomance = new ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaRomance.jpg"));
        lblRomance.setIcon(imgRomance);
    }//GEN-LAST:event_lblRomanceMouseExited

    private void lblRomanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRomanceMouseClicked
        genero = "ROMANTICAS";
        abrirVentana(genero);
    }//GEN-LAST:event_lblRomanceMouseClicked

    private void lblCrimenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrimenMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgCrimenGif;
        imgCrimenGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/crimenGif.gif"));
        lblCrimen.setIcon(imgCrimenGif);
    }//GEN-LAST:event_lblCrimenMouseEntered

    private void lblCrimenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrimenMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgCrimen;
        imgCrimen = new ImageIcon(getClass().getResource("/imgFrmePrincipal/caratulaCrimen.jpg"));
        lblCrimen.setIcon(imgCrimen);                              
    }//GEN-LAST:event_lblCrimenMouseExited

    private void lblCrimenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrimenMouseClicked
        //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "CRIMEN";
        abrirVentana(genero);
    }//GEN-LAST:event_lblCrimenMouseClicked

    private void lblAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccionMouseClicked
        //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "ACCIÓN";
        abrirVentana(genero); 
    }//GEN-LAST:event_lblAccionMouseClicked

    private void lblComediasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblComediasMouseClicked
        //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "COMEDIA";
        abrirVentana(genero); 
    }//GEN-LAST:event_lblComediasMouseClicked

    private void lblDramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDramaMouseClicked
         //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "DRAMA";
        abrirVentana(genero);
    }//GEN-LAST:event_lblDramaMouseClicked

    private void lblTerrorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTerrorMouseClicked
         //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "TERROR";
        abrirVentana(genero);
    }//GEN-LAST:event_lblTerrorMouseClicked

    private void lblInfantilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfantilesMouseClicked
        //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "INFANTILES";
        abrirVentana(genero);
    }//GEN-LAST:event_lblInfantilesMouseClicked

    private void lblTodasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTodasMouseClicked
         //Colocamos el nombre del género solicitado y lo mandaremos como parámetro a la ventana
        genero = "TODOS LOS GÉNEROS";
        abrirVentana(genero);
    }//GEN-LAST:event_lblTodasMouseClicked

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        //Abrimos la ventana Reportes y hacemos visible la ventana
        JDReportes misReportes = new JDReportes(null, true);
        misReportes.setVisible(true);
    }//GEN-LAST:event_btnReportesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadirCli;
    private javax.swing.JButton btnAñadirUsu;
    private javax.swing.JButton btnGestiones;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAccion;
    private javax.swing.JLabel lblAñadirCli;
    private javax.swing.JLabel lblAñadirUsu;
    private javax.swing.JLabel lblComedias;
    private javax.swing.JLabel lblCrimen;
    private javax.swing.JLabel lblDrama;
    private javax.swing.JLabel lblGestiones;
    private javax.swing.JLabel lblInfantiles;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblRomance;
    private javax.swing.JLabel lblTerror;
    private javax.swing.JLabel lblTodas;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para abrir las películas
     * @param genero 
     */
    private void abrirVentana(String genero) {
        JDPeliculas miPelicula = new JDPeliculas(null, true);
        miPelicula.lblGenero.setText(genero);
        miPelicula.setVisible(true);
    }// fin del método abrirVentana
    
   
}// fin de la clase FrmePrincipal
