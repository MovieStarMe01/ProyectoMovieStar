/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.DAOManager;
import DAOMySQL.MySQLDAOManager;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;
    
/**
 *
 * @author Jesús Moisés
 */
public class login extends javax.swing.JDialog {

    //Creamos un objeto de tipo interface IUsuarioDAO
    private DAOManager manager = null;
    //private Usuario idUSU;
    PlaceHolder holder;
    String contraseña = "";
    String nickName = "";
    
    /**
     * Creates new form login
     */
    public login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        this.manager = new MySQLDAOManager();
        
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
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        verPass = new javax.swing.JCheckBox();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        lblRegistrar = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        lblEntrar = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();

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
        panelImage2.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 20));

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 230, 50));

        lblCandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/candadoLogin.png"))); // NOI18N
        jPanel1.add(lblCandado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 30, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/usersAmarillo.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 70, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 290, 70));

        jSeparator2.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 20, 260));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        verPass.setBackground(new java.awt.Color(255, 255, 255));
        verPass.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        verPass.setForeground(new java.awt.Color(153, 153, 153));
        verPass.setText("Ver Contraseña");
        verPass.setBorder(null);
        verPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        verPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/hide.png"))); // NOI18N
        verPass.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/visibility.png"))); // NOI18N
        verPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPassMouseClicked(evt);
            }
        });
        jPanel1.add(verPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/btns.png"))); // NOI18N

        lblRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistrar.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblRegistrar.setText("    Registrarse");
        lblRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addComponent(lblRegistrar)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 190, 30));

        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/btns.png"))); // NOI18N

        lblEntrar.setBackground(new java.awt.Color(255, 255, 255));
        lblEntrar.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        lblEntrar.setText("         Entrar");
        lblEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEntrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelImage4Layout = new javax.swing.GroupLayout(panelImage4);
        panelImage4.setLayout(panelImage4Layout);
        panelImage4Layout.setHorizontalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelImage4Layout.setVerticalGroup(
            panelImage4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage4Layout.createSequentialGroup()
                .addComponent(lblEntrar)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 190, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/ver2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 260));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPassMouseClicked
       //Si se verPass esta seleccionado mostrará la contraseña
        if(verPass.isSelected()){
            txtPassword.setEchoChar((char)0);
        }else if(verPass.isShowing()){
            txtPassword.setEchoChar('*');
        }// fin del else if
    }//GEN-LAST:event_verPassMouseClicked

    private void lblEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseEntered
        // al pasar el mouse dentro del label este cambiará de color a gris
        lblEntrar.setFont(lblEntrar.getFont());
        lblEntrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblEntrarMouseEntered

    private void lblEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseExited
       // al salir el mouse de los limites del label este cambiará de color a blanco
       lblEntrar.setFont((lblEntrar.getFont()));
       lblEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblEntrarMouseExited

    private void lblRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseClicked
        //Creamos una instancia de JDRegistro y hacemos visible el objeto MiRegistro
        JDRegistro miRegistro = new JDRegistro(null, true);
        miRegistro.setVisible(true);
    }//GEN-LAST:event_lblRegistrarMouseClicked

    private void lblRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseEntered
        // al pasar el mouse dentro del label este cambiará de color
        lblRegistrar.setFont(lblRegistrar.getFont());
        lblRegistrar.setForeground(Color.GRAY);
    }//GEN-LAST:event_lblRegistrarMouseEntered

    private void lblRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarMouseExited
        // al salir el mouse de los limites del label este cambiará de color a blanco
        lblRegistrar.setFont(lblRegistrar.getFont());
        lblRegistrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblRegistrarMouseExited

    private void lblEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEntrarMouseClicked
        //checar si se llenaron los datos
        if(txtUser.getText().equals("")){
            //primero el usuario
            JOptionPane.showMessageDialog(null, "<html><h2>No se ingresó el nombre del usuario</h2></html>","ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }else if(txtPassword.getText().equals("")){
            //luego la contraseña
            JOptionPane.showMessageDialog(null, "<html><h2>No se ingresó la contraseña</h2></html>","ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            //si se llegó aquí, se llenaron los datos
            
            //Obtengo la contraseña encriptada MD5
            String contra = encriptar();
            //Obtengo el usurio 
            String usu = txtUser.getText();
            
            try {
                /*
                Utilizo el método verificarUP para verificar usuario y contraseña y le mando
                como parámetro el usuario y la contraseña ya encriptada MD5
                */
                if(manager.getUsuarioDAO().verificaUP(usu, contra) == true){
                    //Mando mensaje de que el logeo fue exitoso 
                    JOptionPane.showMessageDialog(null, "<html><h2>Login Exitoso</h2></html>","Login Exitoso",
                        JOptionPane.INFORMATION_MESSAGE);
                    //Creo una instancia de mi FrmePrincipal
                    FrmePrincipal miVentana = new FrmePrincipal();
                    //Hago visible miVentana
                    miVentana.setVisible(true);
                    //Cierro la ventana login
                    this.dispose();
                }else{
                    //Mando mensaje de que el logeo tuvo un error en contraseña o nickName
                    JOptionPane.showMessageDialog(null, "<html><h2>Nick-Name o Contraseña Incorrecto</h2></html>","ERROR",
                        JOptionPane.ERROR_MESSAGE);
                    //Limpio las cajas de texto y pongo el cursor en el campo de texto en txtUser
                    txtUser.setText("");
                    txtPassword.setText("");
                    txtUser.requestFocusInWindow();
                }// fin del else
                
            }catch(DAOException ex){
                mensajeError(ex);
            }// fin del catch
        }
    }//GEN-LAST:event_lblEntrarMouseClicked

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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblCandado;
    private javax.swing.JLabel lblEntrar;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblUser;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
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
     * Método para mostrar leyenda de msj en los campos de contraseña
     */
    private void placeHolderPass() {
        txtPassword.setEchoChar((char)0);
        holder = new PlaceHolder(txtPassword, "Contraseña");
    }// fin del método placeHolderPass

    /**
     * Método para mandar mensaje de error
     * @param ex 
     */
    private void mensajeError(DAOException ex) {
        //Si getMessage existe obtenemos su valor
        String mensajeError;

        try{
            mensajeError = "Mensaje: " + ex.getCause().getMessage();
        }catch(NullPointerException error){
            mensajeError = "";
        }// fin del catch

        JOptionPane.showMessageDialog(null, ex.getMessage()+"\n"+mensajeError,"ERROR",
                JOptionPane.ERROR_MESSAGE);
    }// fin del método mensajeError
    
    /**
     * Método para obtener la contraseña escrita
     * @return contraseña
     */
    public String getContraseña(){
        contraseña = txtPassword.getText();
        return contraseña;
    }// fin del método getContraseña
    
    /**
     * Método para obtener el nickName del usuario
     * @return nickName
     */
    public String getNickName(){
        nickName = txtUser.getText();
        System.out.println(nickName);
        return nickName;
    }// fin del método getNickName

    /**
     * Método para encriptar la contraseña que se introduce en el campo de texto
     * contraseña
     */
    private String encriptar() {
        //Obtengo la contraseña que se ingresó
        String contra = txtPassword.getText();
        //Encripto la contraseña a MD5
        String textoEncriptadoConMD5 = DigestUtils.md5Hex(contra); 
        System.out.println(textoEncriptadoConMD5);
        return textoEncriptadoConMD5;
    }// fin del método encriptar
    
}// fin de la clase login
