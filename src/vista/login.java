/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.placeholder.PlaceHolder;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.KeyboardFocusManager;

/**
 *
 * @author Jesús Moisés
 */
public class login extends javax.swing.JDialog {

    PlaceHolder holder;
    String contraseña = "Contraseña";
    /**
     * Creates new form login
     */
    public login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        placerHolder();
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

        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        txtUser = new javax.swing.JTextField();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        txtPassword = new javax.swing.JPasswordField();
        lblCandado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        verPass = new javax.swing.JCheckBox();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        lblRegistro = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        lblEntrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/userLogin.png"))); // NOI18N
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtUser.setBorder(null);
        panelImage1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 230, 50));

        panelImage2.setBackground(new java.awt.Color(255, 255, 255));
        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        panelImage2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 230, 50));

        lblCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/candadoLogin.png"))); // NOI18N
        jPanel1.add(lblCandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/usersAmarillo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 290, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(237, 184, 73));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 20, 260));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        verPass.setBackground(new java.awt.Color(255, 255, 255));
        verPass.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        verPass.setForeground(new java.awt.Color(153, 153, 153));
        verPass.setText("Ver Contraseña");
        verPass.setBorder(null);
        verPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/hide.png"))); // NOI18N
        verPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/visibility.png"))); // NOI18N
        verPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPassMouseClicked(evt);
            }
        });
        jPanel1.add(verPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/btns.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegistro.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistro.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistro.setText("     Registrarse");
        lblRegistro.setToolTipText("");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistroMouseExited(evt);
            }
        });
        panelImage3.add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 160, 30));

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 180, 40));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/btns.png"))); // NOI18N
        panelImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEntrar.setBackground(new java.awt.Color(255, 255, 255));
        lblEntrar.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        lblEntrar.setForeground(new java.awt.Color(255, 255, 255));
        lblEntrar.setText("          Entrar");
        lblEntrar.setToolTipText("");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });
        panelImage4.add(lblEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 20));

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 180, 40));

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        //si se da un clic en el campo txtPasword los caracteres se encriptaran con *
        if(!txtPassword.equals("")){ 
            txtPassword.setEchoChar('*');
        }else{
            placeHolderPass();
        }
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
       //si se coloca el cursor en el campo txtPassword los caracteres se ecriptan con *
        txtPassword.setEchoChar('*');
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        /* si se pierde el focus del mouse y esta vacio del campo txtPasword se
        * manda llamar el método placeHolder para poner la leyenda
        */
        if(!txtPassword.equals("")){
            txtPassword.setEchoChar('*');
        }else{
            placeHolderPass();
        }
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        txtPassword.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, java.util.Collections.EMPTY_SET);
        
        if(evt.getKeyCode() == KeyEvent.VK_TAB){
            txtUser.requestFocus();
            txtPassword.setCaretPosition(0);
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void verPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPassMouseClicked
        /*
        si se presiona el CheckBox verPass entonces en el txtPassword será visible la contraseña
        de lo contrario se encriptara el txtPassword con *
        */
        if(verPass.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else if(verPass.isShowing()){
            txtPassword.setEchoChar('*');
        }// fin del else if
    }//GEN-LAST:event_verPassMouseClicked

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        //Al entrar el mouse al label se cambiara de color el texto y se aplica la misma fuente 
        lblEntrar.setFont(lblEntrar.getFont());
        lblEntrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
       //Al salir el mouse al label se cambiara de color el texto al que tenia por default
       lblEntrar.setFont((lblEntrar.getFont()));
       lblEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblEntrarMouseExited

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        //Creamos una instancia del JDialogRegistro
        JDRegistro miRegistro = new JDRegistro(null, true);
        //Hacemos visible nuestra ventana miRegistro 
        miRegistro.setVisible(true);
    }//GEN-LAST:event_lblRegistroMouseClicked

    private void lblRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseEntered
        //Al entrar el mouse al label se cambiara de color el texto y se aplica la misma fuente 
        lblRegistro.setFont(lblRegistro.getFont());
        lblRegistro.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblRegistroMouseEntered

    private void lblRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseExited
        //Al salir el mouse al label se cambiara de color el texto al que tenia por default
        lblRegistro.setFont(lblRegistro.getFont());
        lblRegistro.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblRegistroMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login dialog = new login(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCandado;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblUser;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    private javax.swing.JCheckBox verPass;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo para mostrar leyenda de msj en los campos de texto
     */
    private void placerHolder() {
        holder = new PlaceHolder(txtUser, "Usuario");
    }// fin del método placeHolder

    /**
     * Método para mostrar la leyenda "contraseña" en el campos de texto
     * txtPassword
     */
    private void placeHolderPass() {
        holder = new PlaceHolder(txtPassword, "Contraseña");
        txtPassword.setEchoChar((char)0);
        
    }// fin del méotod placeHolderPass
    
}// fin de la clase login
