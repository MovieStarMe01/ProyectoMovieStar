/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;
import javax.swing.ImageIcon;

/**
 *
 * @author Jesús Moisés
 */
public class FrmePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmePrincipal
     */
    public FrmePrincipal() {
        initComponents();
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblAccion = new javax.swing.JLabel();
        lblAccion1 = new javax.swing.JLabel();
        lblTerror = new javax.swing.JLabel();
        lblRomanticas = new javax.swing.JLabel();
        lblInfantiles = new javax.swing.JLabel();
        lblCrimen = new javax.swing.JLabel();
        lblTodas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblComedias = new javax.swing.JLabel();
        lblDrama = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        lblAccion1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblAccion1.setText("ACCIÓN");

        lblTerror.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTerror.jpg"))); // NOI18N
        lblTerror.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTerrorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTerrorMouseExited(evt);
            }
        });

        lblRomanticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaRomance.jpg"))); // NOI18N
        lblRomanticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRomanticas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRomanticasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRomanticasMouseExited(evt);
            }
        });

        lblInfantiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaInfantil.jpg"))); // NOI18N
        lblInfantiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInfantiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInfantilesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInfantilesMouseExited(evt);
            }
        });

        lblCrimen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaCrimen.jpg"))); // NOI18N
        lblCrimen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCrimen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCrimenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCrimenMouseExited(evt);
            }
        });

        lblTodas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaTodas.png"))); // NOI18N
        lblTodas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTodas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTodasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTodasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("COMEDIAS");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("DRAMA");

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("TERROR");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("ROMANTICAS");

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("INFANTILES");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("CRIMEN");

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("TODAS");

        lblComedias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/Caratula.jpg"))); // NOI18N
        lblComedias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblComedias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblComediasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblComediasMouseExited(evt);
            }
        });

        lblDrama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaDrama.jpg"))); // NOI18N
        lblDrama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDrama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDramaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRomanticas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInfantiles, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblComedias, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCrimen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(lblTerror, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel5)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel6)
                        .addGap(127, 127, 127)
                        .addComponent(jLabel7)
                        .addGap(155, 155, 155)
                        .addComponent(jLabel8)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblAccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131)
                .addComponent(jLabel2)
                .addGap(138, 138, 138)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblComedias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDrama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccion1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfantiles, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRomanticas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrimen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 880, 550));

        jPanel3.setBackground(new java.awt.Color(240, 203, 114));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage1.setBackground(new java.awt.Color(240, 203, 114));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/newLogoNA.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 265, 90));

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
        jPanel3.add(btnAñadirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, 80));

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
        jPanel3.add(btnAñadirUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 265, 130, 80));

        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/reportes.png"))); // NOI18N
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgFrmePrincipal/reportes (1).png"))); // NOI18N
        jPanel3.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 375, 130, 80));

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
        jPanel3.add(btnGestiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 495, 130, 80));

        lblAñadirCli.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblAñadirCli.setText("Añadir Cliente");
        jPanel3.add(lblAñadirCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, 20));

        lblAñadirUsu.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblAñadirUsu.setText("Añadir Usuario");
        jPanel3.add(lblAñadirUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        lblReportes.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblReportes.setText("Reportes");
        jPanel3.add(lblReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, -1, -1));

        lblGestiones.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        lblGestiones.setText("Gestiones");
        jPanel3.add(lblGestiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 70, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void lblRomanticasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRomanticasMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgRomanceGif;
        imgRomanceGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/romanceGif.gif"));
        lblRomanticas.setIcon(imgRomanceGif);
    }//GEN-LAST:event_lblRomanticasMouseEntered

    private void lblRomanticasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRomanticasMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgRomance;
        imgRomance = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaRomance.jpg"));
        lblRomanticas.setIcon(imgRomance); 
    }//GEN-LAST:event_lblRomanticasMouseExited

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

    private void lblCrimenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrimenMouseEntered
        //Al entrar el focus al label este cambiará su icono por un gif
        ImageIcon imgCrimenGif;
        imgCrimenGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/crimenGif.gif"));
        lblCrimen.setIcon(imgCrimenGif);
    }//GEN-LAST:event_lblCrimenMouseEntered

    private void lblCrimenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCrimenMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgCrimen;
        imgCrimen = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaCrimen.jpg"));
        lblCrimen.setIcon(imgCrimen); 
    }//GEN-LAST:event_lblCrimenMouseExited

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
        imgDramaGif = new ImageIcon(getClass().getResource("/imgFrmePrincipal/DramaGif.gif"));
        lblDrama.setIcon(imgDramaGif);
    }//GEN-LAST:event_lblDramaMouseEntered

    private void lblDramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDramaMouseExited
        //Al salir el focus del label este regresará su icono al que tenia por defecto
        ImageIcon imgDrama;
        imgDrama = new ImageIcon(getClass().getResource("/imgFrmePrincipal/CaratulaDrama.jpg"));
        lblDrama.setIcon(imgDrama);
    }//GEN-LAST:event_lblDramaMouseExited

    private void btnAñadirUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirUsuActionPerformed
        JDRegistro miUsuario = new JDRegistro(null, true);
        miUsuario.setVisible(true);
    }//GEN-LAST:event_btnAñadirUsuActionPerformed

    private void btnAñadirCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirCliActionPerformed
        JDAñadirCliente miCliente = new JDAñadirCliente(null, true);
        miCliente.setVisible(true);
    }//GEN-LAST:event_btnAñadirCliActionPerformed

    private void lblAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAccionMouseClicked
        JDPeliculas miPelicula = new JDPeliculas(null, true);
        miPelicula.lblGenero.setText("Acción");
        miPelicula.setVisible(true);
        
    }//GEN-LAST:event_lblAccionMouseClicked

    private void btnGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionesActionPerformed
        JDGestiones misGestiones = new JDGestiones(null, true);
        misGestiones.setVisible(true);
    }//GEN-LAST:event_btnGestionesActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAccion;
    public javax.swing.JLabel lblAccion1;
    private javax.swing.JLabel lblAñadirCli;
    private javax.swing.JLabel lblAñadirUsu;
    private javax.swing.JLabel lblComedias;
    private javax.swing.JLabel lblCrimen;
    private javax.swing.JLabel lblDrama;
    private javax.swing.JLabel lblGestiones;
    private javax.swing.JLabel lblInfantiles;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblRomanticas;
    private javax.swing.JLabel lblTerror;
    private javax.swing.JLabel lblTodas;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
