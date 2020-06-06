/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Jesús Moisés
 */
public class JDGestiones extends javax.swing.JDialog {

    /**
     * Creates new form JDGestiones
     */
    public JDGestiones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnRentadas = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        btnAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        btnEditarPeli = new javax.swing.JButton();
        btnEditarCli = new javax.swing.JButton();
        btnEditarUsu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 620, 10));

        btnRentadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/peliculasRentadas.png"))); // NOI18N
        btnRentadas.setBorder(null);
        btnRentadas.setContentAreaFilled(false);
        btnRentadas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRentadas.setDefaultCapable(false);
        btnRentadas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/peliculasRentadas (1).png"))); // NOI18N
        jPanel1.add(btnRentadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, 150));

        btnBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/bajaPeliculas.png"))); // NOI18N
        btnBaja.setBorder(null);
        btnBaja.setBorderPainted(false);
        btnBaja.setContentAreaFilled(false);
        btnBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBaja.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/bajaPeliculas (1).png"))); // NOI18N
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 160, 150));

        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/altaPeliculas.png"))); // NOI18N
        btnAlta.setBorder(null);
        btnAlta.setBorderPainted(false);
        btnAlta.setContentAreaFilled(false);
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/altaPeliculas (1).png"))); // NOI18N
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 160, 150));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 50, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Salir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("PELICULAS RENTADAS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("BAJA PELICULAS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("ALTA PELICULAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/imgGestiones.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 80));

        btnEditarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarPeli.png"))); // NOI18N
        btnEditarPeli.setBorder(null);
        btnEditarPeli.setBorderPainted(false);
        btnEditarPeli.setContentAreaFilled(false);
        btnEditarPeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPeli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarPeli (1).png"))); // NOI18N
        btnEditarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 160, 150));

        btnEditarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarCli.png"))); // NOI18N
        btnEditarCli.setBorder(null);
        btnEditarCli.setBorderPainted(false);
        btnEditarCli.setContentAreaFilled(false);
        btnEditarCli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarCli(1).png"))); // NOI18N
        btnEditarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 160, 150));

        btnEditarUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarUsu.png"))); // NOI18N
        btnEditarUsu.setBorder(null);
        btnEditarUsu.setBorderPainted(false);
        btnEditarUsu.setContentAreaFilled(false);
        btnEditarUsu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarUsu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarUsu (1).png"))); // NOI18N
        btnEditarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 160, 150));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("EDITAR CLIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("EDITAR USUARIO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("EDITAR PELICULA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        JDAltaPelicula miPelicula = new JDAltaPelicula(null, true);
        miPelicula.setVisible(true);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEditarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPeliActionPerformed
        JDGesEditarPeli miEdicion = new JDGesEditarPeli(null, true);
        miEdicion.setVisible(true);
    }//GEN-LAST:event_btnEditarPeliActionPerformed

    private void btnEditarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliActionPerformed
        JDGesEditarCli miCliente = new JDGesEditarCli(null, true);
        miCliente.setVisible(true);
    }//GEN-LAST:event_btnEditarCliActionPerformed

    private void btnEditarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuActionPerformed
        JDGesEditarUsu miEdicion = new JDGesEditarUsu(null, true);
        miEdicion.setVisible(true);
    }//GEN-LAST:event_btnEditarUsuActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        JDBajaPeliculas miPelicula = new JDBajaPeliculas(null, true);
        miPelicula.setVisible(true);
    }//GEN-LAST:event_btnBajaActionPerformed

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
            java.util.logging.Logger.getLogger(JDGestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGestiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGestiones dialog = new JDGestiones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnEditarCli;
    private javax.swing.JButton btnEditarPeli;
    private javax.swing.JButton btnEditarUsu;
    private javax.swing.JButton btnRentadas;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
