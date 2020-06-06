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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Jesús Moisés
 */
public class JDGesEditarPeli extends javax.swing.JDialog {

    //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
   
    //Modelo para nuestra tablaPeliculas
    private PeliculasEditTableModel model;
    
    //Propiedades para  modificar el width de nuestra tabla tblPeliculas
    TableColumnModel columnModel = null;
    
    String genero;
    String peliID;
    String titulo;
    String calidad;
    int anio;
    String audio;
    String caratula;
    double precioRenta;
    double precioVenta;
    String sinopsis;
    
    int fila;
    
    /**
     * Creates new form JDGesEditarPeli
     */
    public JDGesEditarPeli(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Obtenemos todos los métodos de la clase MySQLTituloDAO
        this.manager = new MySQLDAOManager();
        
        try {
            inicializarListaPeliculas();
        } catch (DAOException ex) {
            Logger.getLogger(JDPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del catch  
        
        deshabilitar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeliculas = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnEditarPeli = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        txtTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        panelImage7 = new org.edisoncor.gui.panel.PanelImage();
        txtCaratula = new javax.swing.JTextField();
        panelImage9 = new org.edisoncor.gui.panel.PanelImage();
        txtAudio = new javax.swing.JTextField();
        panelImage8 = new org.edisoncor.gui.panel.PanelImage();
        txtAño = new javax.swing.JTextField();
        btnAbrirCaratula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txASinopsis = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txtPrecioRenta = new javax.swing.JTextField();
        panelImage10 = new org.edisoncor.gui.panel.PanelImage();
        txtGenero = new javax.swing.JTextField();
        cmbGeneros = new javax.swing.JComboBox<>();
        btnActualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        panelImage11 = new org.edisoncor.gui.panel.PanelImage();
        txtCalidad = new javax.swing.JTextField();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelImage12 = new org.edisoncor.gui.panel.PanelImage();
        txtPrecioVenta = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblPeliculas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 660, 180));

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 720, 10));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Título:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        panelImage4.setBackground(new java.awt.Color(255, 255, 255));
        panelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusqueda.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtBusqueda.setForeground(new java.awt.Color(153, 153, 153));
        txtBusqueda.setBorder(null);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
        });
        panelImage4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/loupe_1.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelImage4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 260, 40));

        btnEditarPeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarPeli_1.png"))); // NOI18N
        btnEditarPeli.setBorder(null);
        btnEditarPeli.setBorderPainted(false);
        btnEditarPeli.setContentAreaFilled(false);
        btnEditarPeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPeli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/editarPeli (1)_1.png"))); // NOI18N
        btnEditarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPeliActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 60, 50));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Titulo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        panelImage5.setBackground(new java.awt.Color(255, 255, 255));
        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTitulo.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(153, 153, 153));
        txtTitulo.setBorder(null);
        panelImage5.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel1.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 200, 40));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Calidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Año:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Audio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Elegir Caratula:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        panelImage7.setBackground(new java.awt.Color(255, 255, 255));
        panelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCaratula.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCaratula.setForeground(new java.awt.Color(153, 153, 153));
        txtCaratula.setBorder(null);
        panelImage7.add(txtCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        jPanel1.add(panelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 200, 40));

        panelImage9.setBackground(new java.awt.Color(255, 255, 255));
        panelImage9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAudio.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAudio.setForeground(new java.awt.Color(153, 153, 153));
        txtAudio.setBorder(null);
        panelImage9.add(txtAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 180, 40));

        panelImage8.setBackground(new java.awt.Color(255, 255, 255));
        panelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAño.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtAño.setForeground(new java.awt.Color(153, 153, 153));
        txtAño.setBorder(null);
        panelImage8.add(txtAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 40));

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
        jPanel1.add(btnAbrirCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 60, 40));

        txASinopsis.setColumns(20);
        txASinopsis.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txASinopsis.setRows(5);
        jScrollPane2.setViewportView(txASinopsis);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 340, 120));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Sinopsis:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, 30));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        jLabel11.setText("Cambiar Género:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Precio Venta $:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Precio Renta $:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        panelImage3.setBackground(new java.awt.Color(255, 255, 255));
        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioRenta.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecioRenta.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioRenta.setBorder(null);
        panelImage3.add(txtPrecioRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jPanel1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 170, 40));

        panelImage10.setBackground(new java.awt.Color(255, 255, 255));
        panelImage10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGenero.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtGenero.setForeground(new java.awt.Color(153, 153, 153));
        txtGenero.setBorder(null);
        txtGenero.setEnabled(false);
        panelImage10.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jPanel1.add(panelImage10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 170, 40));

        cmbGeneros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACCIÓN", "COMEDIA", "DRAMA", "TERROR", "ROMANTICAS", "INFANTILES", "CRIMEN" }));
        cmbGeneros.setBorder(null);
        cmbGeneros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbGeneros, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 170, -1));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/actualizarPeli.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/actualizarPeli (1).png"))); // NOI18N
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 70, 50));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setText("Actualizar");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 580, 50, 50));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel14.setText("Salir");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, -1, -1));

        panelImage11.setBackground(new java.awt.Color(255, 255, 255));
        panelImage11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCalidad.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtCalidad.setForeground(new java.awt.Color(153, 153, 153));
        txtCalidad.setBorder(null);
        panelImage11.add(txtCalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        jPanel1.add(panelImage11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 180, 40));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/imgtituloEditarPeli_1.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 50));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Editar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel15.setText("Género:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        panelImage12.setBackground(new java.awt.Color(255, 255, 255));
        panelImage12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecioVenta.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtPrecioVenta.setForeground(new java.awt.Color(153, 153, 153));
        txtPrecioVenta.setBorder(null);
        panelImage12.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, -1));

        jPanel1.add(panelImage12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPeliActionPerformed
        // si se selecciona una fila entonces abrimos la ventana detalles para rentar o vender
       if(tblPeliculas.getSelectedRow() > -1){
            llenarCampos();
        }else{
            ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/seleccionFila.png"));
            JOptionPane.showMessageDialog(null, "<html><h1>Selecciona una Película a Editar</h1></html>",
                    "Selecciona una Fila", 0, miIcono);
        }// fin del else
    }//GEN-LAST:event_btnEditarPeliActionPerformed

    private void btnAbrirCaratulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirCaratulaActionPerformed
        
        JFileChooser rutaImg = new JFileChooser();
        //Hacemos un filtro para que solo puedan utilizar imagenes de este tipo
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de Imagen", "jpg", "png", "gif");
        //Aplicamos el filtro
        rutaImg.setFileFilter(filtro);
        rutaImg.showOpenDialog(this);
        File caratulaF = rutaImg.getSelectedFile();
        
        if(caratulaF != null){
            if(caratulaF.exists()){
                txtCaratula.setText(caratulaF.getAbsolutePath());
            }else{
                 JOptionPane.showMessageDialog(null, "<html><h2>La Imagen no se encuentra en esta Ruta</h2></html>");
                 txtCaratula.setText("");
            }//fin del else
         }// fin del if  
    }//GEN-LAST:event_btnAbrirCaratulaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Verificamos que todos los campos esten llenos
        if(validar()){
            //Obtenemos el géneto seleccionado
            genero = seleccionGenero();  
            peliID  = (String) tblPeliculas.getValueAt(fila, 0);
            //llamamos el constructor para crear un objeto de tipo peliculas
            peliculas miPelicula = new peliculas(genero, titulo, sinopsis, precioRenta, precioVenta, caratula, audio,
                    calidad, anio, peliID);
            
            try {
                manager.getPeliculasDAO().modificar(miPelicula);
                ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/peliActualizar.png"));
                JOptionPane.showMessageDialog(null, "<html><h2>La Película se ha Actualizado Correctamente</h2></html>",
                     "Actulización Exitosa", 0, miIcono);
                //llamamos el método limpiarFormulario
                limpiarFormulario();
                //llamamos el método deshabilitar
                deshabilitar();
                //llamamos el método inicializarListaPeliculas
                inicializarListaPeliculas();
            }catch (DAOException ex) {
                    mensajeError(ex);
            }
        }// fin del if validar

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        // Cada que se presione una tecla en la busqueda se hará una consulta a la BD y traera lo relacionado a esta
        //Primero limpiamos la tabla para cada vez que se escriba o borre sea nueva consulta con lo solicitado
        //limpiarTabla();
        String busqueda = txtBusqueda.getText();
        
        try {
            List<peliculas> listaPeliculas = manager.getPeliculasDAO().obtenerBusqueda(busqueda);
            
            int numeroPeliculas = listaPeliculas.size();
            model.getValueAt(0, fila);
        } catch (DAOException ex) {
            Logger.getLogger(JDGesEditarPeli.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_txtBusquedaKeyReleased

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
            java.util.logging.Logger.getLogger(JDGesEditarPeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGesEditarPeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGesEditarPeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGesEditarPeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGesEditarPeli dialog = new JDGesEditarPeli(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEditarPeli;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbGeneros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage10;
    private org.edisoncor.gui.panel.PanelImage panelImage11;
    private org.edisoncor.gui.panel.PanelImage panelImage12;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private org.edisoncor.gui.panel.PanelImage panelImage7;
    private org.edisoncor.gui.panel.PanelImage panelImage8;
    private org.edisoncor.gui.panel.PanelImage panelImage9;
    private javax.swing.JTable tblPeliculas;
    private javax.swing.JTextArea txASinopsis;
    private javax.swing.JTextField txtAudio;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCalidad;
    private javax.swing.JTextField txtCaratula;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtPrecioRenta;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para colocar los titulos a nuestra tabla
     */
    private void inicializarListaPeliculas() throws DAOException {
        
        model = new PeliculasEditTableModel(manager.getPeliculasDAO());
            
        //Asignamos el modelo y ponemos los titulos a ver en nuestra tabla
        tblPeliculas.setModel(model);
        model.updateModelAll();
        model.fireTableDataChanged();
    }// fin del método inicializarListaAutores
    
    /**
     * Método para llenar todos los campos con los de la película seleccionada
     */
    private void llenarCampos() {
        //Obtenemos la fila seleccionada
        fila = tblPeliculas.getSelectedRow();
        
        titulo = (String) tblPeliculas.getValueAt(fila, 1);
        anio = (int) tblPeliculas.getValueAt(fila, 2);
        audio = (String) tblPeliculas.getValueAt(fila, 3);
        calidad = (String) tblPeliculas.getValueAt(fila, 4);
        precioRenta = (double) tblPeliculas.getValueAt(fila, 5);
        precioVenta = (double) tblPeliculas.getValueAt(fila, 6);
        caratula = (String) tblPeliculas.getValueAt(fila, 7);
        sinopsis = (String) tblPeliculas.getValueAt(fila, 8);
        genero = (String) tblPeliculas.getValueAt(fila, 9);
        
        //Colocamos los datos obtenidos de la fila seleccionada en los campos
        txtTitulo.setText(titulo);
        txtAño.setText(String.valueOf(anio));
        txtAudio.setText(audio);
        txtCalidad.setText(calidad);
        txtPrecioRenta.setText(String.valueOf(precioRenta));
        txtPrecioVenta.setText(String.valueOf(precioVenta));
        txtGenero.setText(String.valueOf(precioVenta));
        txtCaratula.setText(caratula);
        txASinopsis.setText(sinopsis);
        txtGenero.setText(genero);
        cmbGeneros.setSelectedItem(genero);
        
        //llamamos el método habilitar
        habilitar();
    }// fin del método llenar campos

    /**
     * Método para deshabilitar los campos de texto y los botones Actualizar,
     * Eliminar, y abrirCaratula
     */
    private void deshabilitar() {
        txtTitulo.setEnabled(false);
        txtAudio.setEnabled(false);
        txtAño.setEnabled(false);
        txtCalidad.setEnabled(false);
        txtCaratula.setEnabled(false);
        txtPrecioRenta.setEnabled(false);
        txtPrecioVenta.setEnabled(false);
        txASinopsis.setEnabled(false);
        btnAbrirCaratula.setEnabled(false);
        btnActualizar.setEnabled(false);
        cmbGeneros.setEnabled(false);
    }// fin del método deshabilitar

    /**
     * Método para habilitar los campos de texto y los botones Actualizar, 
     * Eliminar y abrirCaratula
     */
    private void habilitar() {
        txtTitulo.setEnabled(true);
        txtAudio.setEnabled(true);
        txtAño.setEnabled(true);
        txtCalidad.setEnabled(true);
        txtCaratula.setEnabled(true);
        txtPrecioRenta.setEnabled(true);
        txtPrecioVenta.setEnabled(true);
        txASinopsis.setEnabled(true);
        btnAbrirCaratula.setEnabled(true);
        btnActualizar.setEnabled(true);
        cmbGeneros.setEnabled(true);
    }// fin del método habilitar
    
    /**
    * Metodo para Mandar Mensaje de Error
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
     * Méotodo para validar que todos los campos esten llenos
     * @return true si todo está correcto, false si faltan datos
     */
    private boolean validar() {
        boolean validacion = false;
        
        String año;
        String renta;
        String venta;
        titulo = txtTitulo.getText();
        calidad = txtCalidad.getText();
        año = txtAño.getText();
        audio = txtAudio.getText();
        caratula = txtCaratula.getText();
        renta = txtPrecioRenta.getText();
        venta = txtPrecioVenta.getText();
        sinopsis = txASinopsis.getText();
        
        if(titulo.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Título</h2></html>");
            txtTitulo.requestFocusInWindow();
            return validacion;
        }// fin del if Título
        
         if(calidad.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Calidad</h2></html>");
            txtCalidad.requestFocusInWindow();
            return validacion;
        }// fin del if Calidad
         
        if(año.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Año</h2></html>");
            txtAño.requestFocusInWindow();
            return validacion;
        }else{
            anio = Integer.parseInt(año);
        }
          
        if(audio.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Audio</h2></html>");
            txtAudio.requestFocusInWindow();
            return validacion;
        }//fin dle if Audio
        
        if(caratula.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Caratula</h2></html>");
            txtCaratula.requestFocusInWindow();
            return validacion;
        }//fin del if Caratula
        
        if(renta.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Precio-Renta</h2></html>");
            txtPrecioRenta.requestFocusInWindow();
            return validacion;
        }else{
            precioRenta = Double.parseDouble(renta);
        }// fin del else
        
        if(venta.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Precio-Venta</h2></html>");
            txtGenero.requestFocusInWindow();
            return validacion;
        }else{
            precioVenta = Double.parseDouble(venta);
        }// fin del else
        
        if(sinopsis.equals("")){
            JOptionPane.showMessageDialog(null, "<html><h2>LLena el campo Sinopsis</h2></html>");
            txASinopsis.requestFocusInWindow();
            return validacion;
        }// fin del if contraseñaConfirmacion
        
        return true;
    }// fin del método validar
    
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

    /**
     * Método para limpar los campos
     */
    private void limpiarFormulario() {
        txtTitulo.setText("");
        txtCalidad.setText("");
        txtAño.setText("");
        txtAudio.setText("");
        txtCaratula.setText("");
        txtPrecioRenta.setText("");
        txtPrecioVenta.setText("");
        txtGenero.setText("");
        txASinopsis.setText("");
    }// fin del método limpiarFormulario

}//fin de la clase JDGesEditarPeli

