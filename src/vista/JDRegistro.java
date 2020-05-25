/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import com.placeholder.PlaceHolder;
import com.sun.glass.events.KeyEvent;
import java.awt.KeyboardFocusManager;

/**
 *
 * @author Jesús Moisés
 */
public class JDRegistro extends javax.swing.JDialog {

    PlaceHolder holders;
    /**
     * Creates new form JDRegistro
     */
    public JDRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        placeHolder();
        placeHolderPass();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        txtPass2 = new javax.swing.JPasswordField();
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
        btnSalir = new javax.swing.JButton();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        txtPass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        chVerPass = new javax.swing.JCheckBox();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 130, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Domicilio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono Celular:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Nick-Name:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 110, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Contraseña:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 90, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Confirma Contraseña:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 160, -1));

        panelImage2.setBackground(new java.awt.Color(255, 255, 255));
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass2.setForeground(new java.awt.Color(153, 153, 153));
        txtPass2.setBorder(null);
        txtPass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPass2MouseClicked(evt);
            }
        });
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPass2KeyPressed(evt);
            }
        });
        panelImage2.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 18));

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 180, 40));

        panelImage3.setBackground(new java.awt.Color(255, 255, 255));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPaterno.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPaterno.setForeground(new java.awt.Color(153, 153, 153));
        txtPaterno.setBorder(null);
        panelImage3.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 180, 40));

        panelImage4.setBackground(new java.awt.Color(255, 255, 255));
        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setBorder(null);
        panelImage4.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 180, 40));

        panelImage5.setBackground(new java.awt.Color(255, 255, 255));
        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMaterno.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtMaterno.setForeground(new java.awt.Color(153, 153, 153));
        txtMaterno.setBorder(null);
        panelImage5.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 180, 40));

        panelImage6.setBackground(new java.awt.Color(255, 255, 255));
        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDomicilio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtDomicilio.setForeground(new java.awt.Color(153, 153, 153));
        txtDomicilio.setBorder(null);
        panelImage6.add(txtDomicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 180, 40));

        panelImage7.setBackground(new java.awt.Color(255, 255, 255));
        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCelular.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(153, 153, 153));
        txtCelular.setBorder(null);
        panelImage7.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 180, 40));

        panelImage8.setBackground(new java.awt.Color(255, 255, 255));
        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNick.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtNick.setForeground(new java.awt.Color(153, 153, 153));
        txtNick.setBorder(null);
        panelImage8.add(txtNick, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 180, 40));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registro.png"))); // NOI18N
        btnRegistrar.setBorder(null);
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registro(1).png"))); // NOI18N
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 60, 50));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 50, 40));

        panelImage10.setBackground(new java.awt.Color(255, 255, 255));
        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass1.setForeground(new java.awt.Color(153, 153, 153));
        txtPass1.setBorder(null);
        txtPass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPass1MouseClicked(evt);
            }
        });
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPass1KeyPressed(evt);
            }
        });
        panelImage10.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 18));

        jPanel1.add(panelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 180, 40));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Salir");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 360, 40, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Registrar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 70, -1));

        jSeparator2.setBackground(new java.awt.Color(237, 184, 73));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 690, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registerLogo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        chVerPass.setBackground(new java.awt.Color(255, 255, 255));
        chVerPass.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        chVerPass.setForeground(new java.awt.Color(153, 153, 153));
        chVerPass.setText("Ver Contraseñas");
        chVerPass.setBorder(null);
        chVerPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chVerPass.setFocusPainted(false);
        chVerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/hide.png"))); // NOI18N
        chVerPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/visibility.png"))); // NOI18N
        chVerPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chVerPassMouseClicked(evt);
            }
        });
        jPanel1.add(chVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgRegistrar/registro_1.png"))); // NOI18N
        panelImage9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(panelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 490, 50));

        jLabel1.setText("Hola Mundo!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void chVerPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chVerPassMouseClicked
       /*
        si se presiona el CheckBox verPass entonces en el txtPassword será visible la contraseña
        de lo contrario se encriptara el txtPassword con *
        */
        if(chVerPass.isSelected()){
            txtPass1.setEchoChar((char)0);
            txtPass2.setEchoChar((char)0);
        }else if(chVerPass.isShowing()){
            txtPass1.setEchoChar('*');
            txtPass2.setEchoChar('*');
        }// fin del else if
    }//GEN-LAST:event_chVerPassMouseClicked

    private void txtPass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass1MouseClicked
        // Cuando se presione el txtPass1 se limpiara el campo
        txtPass1.setEchoChar('*');
    }//GEN-LAST:event_txtPass1MouseClicked

    private void txtPass1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyPressed
        //Encriptamos la contraseña
        txtPass1.setEchoChar('*');
    }//GEN-LAST:event_txtPass1KeyPressed

    private void txtPass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPass2MouseClicked
        //Cuando se presione el txtPass1 se limpiara el campo
        txtPass2.setEchoChar('*');
    }//GEN-LAST:event_txtPass2MouseClicked

    private void txtPass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyPressed
         //si se presiona el txtPass2 ponemos los caracteres ecriptados, y al dar tab se pasará al primer campo
        txtPass2.setEchoChar('*');
        txtPass2.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, java.util.Collections.EMPTY_SET);
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            txtNombre.requestFocus();
            txtPass2.setCaretPosition(0);
        }// fin del if
    }//GEN-LAST:event_txtPass2KeyPressed

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
    private javax.swing.JCheckBox chVerPass;
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
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtNick;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass1;
    private javax.swing.JPasswordField txtPass2;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para coloca una leyenda en los campos de texto
     */
    private void placeHolder() {
        holders = new PlaceHolder(txtNombre,"Nombre");
        holders = new PlaceHolder(txtPaterno,"Apellido Paterno");
        holders = new PlaceHolder(txtMaterno,"Apellido Materno");
        holders = new PlaceHolder(txtDomicilio,"Domicilio");
        holders = new PlaceHolder(txtCelular,"Teleéfono Celular");
        holders = new PlaceHolder(txtNick,"Nick-Name"); 
    }// fin del método placeHolder

    /**
     * Método para colocar leyenda en los campos de texto Contraseña
     */
    private void placeHolderPass() {
        holders = new PlaceHolder(txtPass1, "Contraseña");
        holders = new PlaceHolder(txtPass2, "Contraseña");
        txtPass1.setEchoChar((char)0);
        txtPass2.setEchoChar((char)0);  
    }// fin del método placeHolderPass
}
