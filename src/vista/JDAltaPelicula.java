/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.DAOManager;
import DAOMySQL.MySQLDAOManager;
import Modelo.peliculas;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús Moisés
 */
public class JDAltaPelicula extends javax.swing.JDialog {
     //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
    
    //Campos para alamcenar los datos del formulario
    private String genero;
    private String peliTitulo;
    private String peliSinopsis;
    private String precioRenta;
    private String precioVenta;
    private String caratula;
    private String año;
    private String audio;
    private String calidad;
    private String peliID;
    private String estado = "ACTIVO";
    /**
     * Creates new form JDAltaPelicula
     */
    public JDAltaPelicula(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtPeliID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txtPrecioRenta = new javax.swing.JTextField();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panelImage6 = new org.edisoncor.gui.panel.PanelImage();
        txtCaratula = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        txtAño = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        txtAudio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelImage11 = new org.edisoncor.gui.panel.PanelImage();
        txtCalidad = new javax.swing.JTextField();
        cmbGeneros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txASinopsis = new javax.swing.JTextArea();
        btnAlta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAbrirCaratula = new javax.swing.JButton();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        txtPrecioVenta1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 680, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Pelicula ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        panelImage4.setBackground(new java.awt.Color(255, 255, 255));
        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPeliID.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPeliID.setForeground(new java.awt.Color(153, 153, 153));
        txtPeliID.setBorder(null);
        panelImage4.add(txtPeliID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 200, 40));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Titulo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        panelImage3.setBackground(new java.awt.Color(255, 255, 255));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioRenta.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecioRenta.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioRenta.setBorder(null);
        panelImage3.add(txtPrecioRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 170, 40));

        panelImage5.setBackground(new java.awt.Color(255, 255, 255));
        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(153, 153, 153));
        txtTitulo.setBorder(null);
        panelImage5.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Sinopsis:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        panelImage6.setBackground(new java.awt.Color(255, 255, 255));
        panelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCaratula.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCaratula.setForeground(new java.awt.Color(153, 153, 153));
        txtCaratula.setBorder(null);
        panelImage6.add(txtCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel1.add(panelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 200, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Precio Renta $:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Precio Venta $:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        panelImage7.setBackground(new java.awt.Color(255, 255, 255));
        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAño.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAño.setForeground(new java.awt.Color(153, 153, 153));
        txtAño.setBorder(null);
        panelImage7.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 180, 40));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Audio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Calidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        panelImage9.setBackground(new java.awt.Color(255, 255, 255));
        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAudio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAudio.setForeground(new java.awt.Color(153, 153, 153));
        txtAudio.setBorder(null);
        panelImage9.add(txtAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 180, 40));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Año:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Elegir Caratula:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Género:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        panelImage11.setBackground(new java.awt.Color(255, 255, 255));
        panelImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCalidad.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCalidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCalidad.setBorder(null);
        panelImage11.add(txtCalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 180, 40));

        cmbGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCIÓN", "COMEDIA", "DRAMA", "TERROR", "ROMANTICAS", "INFANTILES", "CRIMEN" }));
        cmbGeneros.setBorder(null);
        cmbGeneros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbGeneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 170, -1));

        txASinopsis.setColumns(20);
        txASinopsis.setRows(5);
        jScrollPane1.setViewportView(txASinopsis);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 280, 120));

        btnAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/peliAlta.png"))); // NOI18N
        btnAlta.setBorder(null);
        btnAlta.setBorderPainted(false);
        btnAlta.setContentAreaFilled(false);
        btnAlta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/peliAlta(1).png"))); // NOI18N
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 70, 50));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 50, 50));

        btnAbrirCaratula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/elegirCara.png"))); // NOI18N
        btnAbrirCaratula.setBorder(null);
        btnAbrirCaratula.setBorderPainted(false);
        btnAbrirCaratula.setContentAreaFilled(false);
        btnAbrirCaratula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirCaratula.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/elegirCara (1).png"))); // NOI18N
        btnAbrirCaratula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirCaratulaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbrirCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 40, 40));

        panelImage10.setBackground(new java.awt.Color(255, 255, 255));
        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioVenta1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecioVenta1.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioVenta1.setBorder(null);
        panelImage10.add(txtPrecioVenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jPanel1.add(panelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 170, 40));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Salir");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/imgAltaPeli.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 70));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Alta");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
         /*
        si se Hace clic en este bóton, se hará el registro en laBD si todo está 
        Correcto
        */
        if(validar()){
            //Obtenemos el géneto seleccionado
            genero = seleccionGenero();
            // si se seleccionó un género válido hacemos la inserción de la pelicula a la BD
            if(!genero.equals("false")){
                //llamamos el constructor para crear un Objeto de tipo Pelicula
                peliculas miPelicula = new peliculas(peliID, genero, peliTitulo, peliSinopsis, Double.parseDouble(precioRenta),
                        Double.parseDouble(precioVenta), caratula, audio, calidad, Integer.parseInt(año), estado);

                    try{
                        manager.getPeliculasDAO().insertar(miPelicula);
                        JOptionPane.showMessageDialog(null, "<html><h2>La Película se ha Dado de Alta Correctamente</h2></html>");
                        limpiarFormulario();
                    }catch(DAOException ex){
                        mensajeError(ex);
                    }// fin del catch
                this.dispose();
            }else{
                //Mandamos mensaje de que debe seleccionar un género válido
                JOptionPane.showMessageDialog(null, "Selecciona un género");
            }// fin del else
        }// fin del if validar
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnAbrirCaratulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCaratulaActionPerformed
        JFileChooser rutaImg = new JFileChooser();
        rutaImg.showOpenDialog(this);
        File caratulaF = rutaImg.getSelectedFile();
        if(caratulaF != null){
            txtCaratula.setText(caratulaF.getAbsolutePath());
        }// fin del i   
    }//GEN-LAST:event_btnAbrirCaratulaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
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
            java.util.logging.Logger.getLogger(JDAltaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAltaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAltaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAltaPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAltaPelicula dialog = new JDAltaPelicula(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrirCaratula;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbGeneros;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage11;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage6;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private javax.swing.JTextArea txASinopsis;
    private javax.swing.JTextField txtAudio;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCalidad;
    private javax.swing.JTextField txtCaratula;
    private javax.swing.JTextField txtPeliID;
    private javax.swing.JTextField txtPrecioRenta;
    private javax.swing.JTextField txtPrecioVenta1;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para validar que todos los campos de texto esten llenos
     * @return true si está todo correcto
     * @return false si faltan datos
     */
    private boolean validar() {
        boolean validacion = false;
        
        peliID = txtPeliID.getText();
        peliTitulo = txtTitulo.getText();
        peliSinopsis = txASinopsis.getText();
        precioRenta = txtPrecioRenta.getText();
        precioVenta = txtPrecioVenta1.getText();
        caratula = txtCaratula.getText();
        audio = txtAudio.getText();
        calidad = txtCalidad.getText();
        año = txtAño.getText().trim();
        
        if(peliID.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un ID a la Pelicula");
            txtPeliID.requestFocusInWindow();
            return validacion;
        }// fin del if peliID
        
        if(peliTitulo.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un Título");
            txtTitulo.requestFocusInWindow();
            return validacion;
        }// fin del if peliTitulo
        
        if(peliSinopsis.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa una Sinopsis");
            txASinopsis.requestFocusInWindow();
            return validacion;
        }// fin del if peliSinopsis
        
        if(precioRenta.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un Precio de Renta");
            txtPrecioRenta.requestFocusInWindow();
            return validacion;
        }// fin del if precioRenta
        
        if(precioVenta.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un Precio de Venta");
            txtPrecioVenta1.requestFocusInWindow();
            return validacion;
        }// fin del if precioVenta
        
        if(caratula.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa una Caratula");
            txtCaratula.requestFocusInWindow();
            return validacion;
        }// fin del if caratula
        
         if(audio.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un Audio");
            txtAudio.requestFocusInWindow();
            return validacion;
        }// fin del if audio
         
          if(calidad.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa una Calidad");
            txtCalidad.requestFocusInWindow();
            return validacion;
        }// fin del if calidad
        
        if(año.equals("")){
            JOptionPane.showMessageDialog(null, "Ingresa un Año");
            txtAño.requestFocusInWindow();
            return validacion;
        }// fin del if año
           
        return true;
    }// fin del método validar

    /**
     * Método para limpiar las cajas de texto y poner el cursor en el campo de
     * peliID
     */
    private void limpiarFormulario() {
        txtPeliID.setText("");
        txtTitulo.setText("");
        txASinopsis.setText("");
        txtPrecioRenta.setText("");
        txtPrecioVenta1.setText("");
        txtCaratula.setText("");
        txtAudio.setText("");
        txtCalidad.setText("");
        txtAño.setText("");
        txtPeliID.requestFocusInWindow();
    }//fin del método limpiarFormulario

    /**
     * Método para Mandar Mensaje de Error
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
     * Método para saber que género se seleccionó
     * @return 
     */
    private String seleccionGenero() {
      
        switch(cmbGeneros.getSelectedIndex()){
            case 0: return genero = "ACCIÓN";
            case 1: return genero = "COMEDIA";
            case 2: return genero = "DRAMA";
            case 3: return genero = "TERROR";
            case 4: return genero = "ROMANTICAS";
            case 5: return genero = "INFANTILES";
            case 6: return genero = "CRIMEN";
            default: return "false";
        }// fin del switchcase
    }// fin del método seleccionGenero 
    
}// fin de la clase JDAltaPelicula
