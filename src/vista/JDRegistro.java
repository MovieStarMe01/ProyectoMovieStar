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
public class JDRegistro extends javax.swing.JDialog {

    /**
     * Creates new form JDRegistro
     */
    public JDRegistro(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jpass2 = new javax.swing.JPasswordField();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txtPaterno = new javax.swing.JTextField();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtNombre = new javax.swing.JTextField();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        txtMaterno = new javax.swing.JTextField();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txtDomicilio = new javax.swing.JTextField();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        txtCelular = new javax.swing.JTextField();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        txtNick = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        jpass3 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 36)); // NOI18N
        jLabel1.setText("Registro Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Domicilio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("Nick-Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 110, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 110, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel9.setText("Confirma Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, -1, -1));

        panelImage2.setBackground(new java.awt.Color(255, 255, 255));
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpass2.setBorder(null);
        panelImage2.add(jpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 230, 50));

        panelImage3.setBackground(new java.awt.Color(255, 255, 255));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPaterno.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPaterno.setBorder(null);
        panelImage3.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 230, 50));

        panelImage4.setBackground(new java.awt.Color(255, 255, 255));
        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNombre.setBorder(null);
        panelImage4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 230, 50));

        panelImage5.setBackground(new java.awt.Color(255, 255, 255));
        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaterno.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtMaterno.setBorder(null);
        panelImage5.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 230, 50));

        panelImage6.setBackground(new java.awt.Color(255, 255, 255));
        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDomicilio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtDomicilio.setBorder(null);
        panelImage6.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 230, 50));

        panelImage7.setBackground(new java.awt.Color(255, 255, 255));
        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCelular.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCelular.setBorder(null);
        panelImage7.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 230, 50));

        panelImage8.setBackground(new java.awt.Color(255, 255, 255));
        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNick.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNick.setBorder(null);
        panelImage8.add(txtNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 230, 50));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registro.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registro(1).png"))); // NOI18N
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 60, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registerLogo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/closeDoor.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setDefaultCapable(false);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/openDoor.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(783, 320, 40, -1));

        panelImage10.setBackground(new java.awt.Color(255, 255, 255));
        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpass3.setBorder(null);
        panelImage10.add(jpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 230, 50));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Salir");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Registrar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 360, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JDRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDRegistro dialog = new JDRegistro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpass2;
    private javax.swing.JPasswordField jpass3;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
}
