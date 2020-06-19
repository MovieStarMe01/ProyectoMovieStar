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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Erick
 * @author Jesús Moisés
 */
public class JDBajaPeliculas extends javax.swing.JDialog {
    
    //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
   
    //Modelo para nuestra tablaPeliculas
    private PeliculasVisiblesTableModel model;
    
    String estadoV = "ACTIVO";
    String estadoI = "INACTIVO";
    String vendido = "VENDIDA";
    
    String idPeli;
    int filaV;
    int filaI;
    /*String titulo;
    int anio;
    String audio;
    String calidad;
    double precioRenta;
    double precioVenta;
    String estado;*/
    
    /**
     * Creates new form JDBajaPeliculas
     */
    public JDBajaPeliculas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Obtenemos todos los métodos de la clase MySQLPeliculasDAO
        this.manager = new MySQLDAOManager();
        
        try {
            inicializarListaPeliculasVI();
            inicializarListaPeliculasIN();
        } catch (DAOException ex) {
            Logger.getLogger(JDPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del catch  
       
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
        jPanel2 = new javax.swing.JPanel();
        btnInvisible = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblVisibles = new rojerusan.RSTableMetro();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btnVisible = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvisibles = new rojerusan.RSTableMetro();
        jLabel5 = new javax.swing.JLabel();
        panelImage5 = new org.edisoncor.gui.panel.PanelImage();
        txtBusqueda1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 670, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInvisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/borrarPeli.png"))); // NOI18N
        btnInvisible.setBorderPainted(false);
        btnInvisible.setContentAreaFilled(false);
        btnInvisible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInvisible.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/borrarPeli (1).png"))); // NOI18N
        btnInvisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvisibleActionPerformed(evt);
            }
        });
        jPanel2.add(btnInvisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Hacer Inactiva");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, -1, -1));

        tblVisibles.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVisibles.setAltoHead(20);
        tblVisibles.setColorBackgoundHead(new java.awt.Color(255, 192, 0));
        tblVisibles.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tblVisibles.setColorBordeHead(new java.awt.Color(255, 192, 0));
        tblVisibles.setColorFilasBackgound1(new java.awt.Color(255, 242, 204));
        tblVisibles.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblVisibles.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblVisibles.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblVisibles.setColorSelBackgound(new java.awt.Color(255, 243, 166));
        tblVisibles.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblVisibles.setFuenteFilas(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tblVisibles.setFuenteFilasSelect(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tblVisibles.setFuenteHead(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        tblVisibles.setMultipleSeleccion(false);
        tblVisibles.setShowHorizontalLines(false);
        jScrollPane3.setViewportView(tblVisibles);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 650, 130));

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
        panelImage4.add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

        jPanel2.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 250, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Título:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 670, 250));

        jSeparator2.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 670, 10));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVisible.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/verPeli.png"))); // NOI18N
        btnVisible.setBorderPainted(false);
        btnVisible.setContentAreaFilled(false);
        btnVisible.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisible.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/verPeli (1).png"))); // NOI18N
        btnVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisibleActionPerformed(evt);
            }
        });
        jPanel3.add(btnVisible, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Hacer Activa");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        tblInvisibles.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInvisibles.setAltoHead(20);
        tblInvisibles.setColorBackgoundHead(new java.awt.Color(255, 192, 0));
        tblInvisibles.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tblInvisibles.setColorBordeHead(new java.awt.Color(255, 192, 0));
        tblInvisibles.setColorFilasBackgound1(new java.awt.Color(255, 242, 204));
        tblInvisibles.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblInvisibles.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblInvisibles.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblInvisibles.setColorSelBackgound(new java.awt.Color(255, 243, 166));
        tblInvisibles.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblInvisibles.setFuenteFilas(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tblInvisibles.setFuenteFilasSelect(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tblInvisibles.setFuenteHead(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        tblInvisibles.setMultipleSeleccion(false);
        tblInvisibles.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblInvisibles);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 650, 130));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Buscar Título:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        panelImage5.setBackground(new java.awt.Color(255, 255, 255));
        panelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgLogin/campotxt2.png"))); // NOI18N
        panelImage5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBusqueda1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtBusqueda1.setForeground(new java.awt.Color(153, 153, 153));
        txtBusqueda1.setBorder(null);
        txtBusqueda1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusqueda1KeyReleased(evt);
            }
        });
        panelImage5.add(txtBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, -1));

        jPanel3.add(panelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 250, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 670, 240));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Salir");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 670, 40, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 640, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/peliculasActi.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 50));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/peliVenIna.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 330, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvisibleActionPerformed
        //Obtenemos la fila seleccioanda de la tabla Visibles
        filaV = tblVisibles.getSelectedRow();
        if(filaV >= 0 ){
            //Obtenemos el IDPelicula
            idPeli = (String) tblVisibles.getValueAt(filaV, 0);
            //llamamos el método cambiarEstado y mandamos como parámetro el estado a cambiar en este caso a Invisible
            cambiarEstado(estadoI, idPeli);
        }else{
            //mandamos llamar el método mensaje
            mensaje();
        }// fin del else
       
    }//GEN-LAST:event_btnInvisibleActionPerformed

    private void btnVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisibleActionPerformed
        //Obtenemos la fila seleccionada de la tabla Invisibles
        filaI = tblInvisibles.getSelectedRow();
        if(filaI >= 0){
            //Obtenemos el IDPelicula
            idPeli = (String) tblInvisibles.getValueAt(filaI, 0);
            //llamamos el método cambairEstado y mndamos como parámetro el estado a cambiar en este caso a Visible
            cambiarEstado(estadoV, idPeli);
        }else{
            //Mandamos llamar el método mensaje
            mensaje();
        }// fin del else
        
    }//GEN-LAST:event_btnVisibleActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        //Mandamos llamar el método filtro y le mandamos como parámetro lo que se escribe en la busqueda y la tblVisibles
        filtro(txtBusqueda.getText().toUpperCase(), tblVisibles);
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusqueda1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusqueda1KeyReleased
        //Mandamos llamar el método filtro y le mandamos como parámetro lo que se escribe en la busqueda y la tblInvisibles
        filtro1(txtBusqueda1.getText().toUpperCase(), tblInvisibles);
    }//GEN-LAST:event_txtBusqueda1KeyReleased

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
            java.util.logging.Logger.getLogger(JDBajaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDBajaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDBajaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBajaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDBajaPeliculas dialog = new JDBajaPeliculas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnInvisible;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVisible;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private org.edisoncor.gui.panel.PanelImage panelImage5;
    private rojerusan.RSTableMetro tblInvisibles;
    private rojerusan.RSTableMetro tblVisibles;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusqueda1;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para cargar la tabla con las películas Activas 
     * @throws DAOException 
     */
    private void inicializarListaPeliculasVI() throws DAOException {
        model = new PeliculasVisiblesTableModel(manager.getPeliculasDAO());
            
        //Asignamos el modelo y ponemos los titulos a ver en nuestra tabla
        tblVisibles.setModel(model);
        model.updateModelAll(estadoV);
        model.fireTableDataChanged();
    }// fin del método inicializarListaPeliculasVI
    
    /**
     * Método para cargar la tabla con las películas Inactivas o Invisibles
     * @throws DAOException 
     */
    private void inicializarListaPeliculasIN() throws DAOException {
        model = new PeliculasVisiblesTableModel(manager.getPeliculasDAO());
            
        //Asignamos el modelo y ponemos los titulos a ver en nuestra tabla
        tblInvisibles.setModel(model);
        model.updateModel(estadoI, vendido);
        model.fireTableDataChanged();
    }// fin del método inicializarListaPeliculas

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
     * Método para cambiar el estado de las películas 
     * @param estado 
     */
    private void cambiarEstado(String estado, String id) {
       
        //llamamos el constructor para crear un objeto de tipo peliculas
        peliculas miPelicula = new peliculas(id, estado);
        try {
            manager.getPeliculasDAO().estado(miPelicula);
            ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/peliActualizar.png"));
            JOptionPane.showMessageDialog(null, "<html><h2>La Película se ha Cambiado de Estado Correctamente</h2></html>",
                "Cambio de Estado Exitoso", 0, miIcono);
                
            //llamamos el método inicializarListaPeliculasIN
            inicializarListaPeliculasIN();
            //llamamos el métoodo incializarListaPeliculasVI
            inicializarListaPeliculasVI();
                
        }catch (DAOException ex) {
            mensajeError(ex);
        }// fin del catch
       
    }// fin del método cambiarEstado

    /**
     * Método para mandar mensaje de que se seleccione una fila de la tabla
     */
    private void mensaje() {
        ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/seleccionFila.png"));
            JOptionPane.showMessageDialog(null, "<html><h1>Selecciona una Fila</h1></html>",
                    "Selecciona una Fila", 0, miIcono);
    }// fin del método mensaje
    
    /**
     * Método para filtrar las busquedas en la tabla
     * @param consulta
     * @param jtableBuscar 
     */
    private void filtro(String consulta, JTable jtableBuscar){
        TableModel dm;
        dm = tblVisibles.getModel();
        TableRowSorter<TableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + (consulta), 1));
    }// fin del método filtro
    
     /**
     * Método para filtrar las busquedas en la tabla
     * @param consulta
     * @param jtableBuscar 
     */
    private void filtro1(String consulta, JTable jtableBuscar){
        TableModel dm;
        dm = tblInvisibles.getModel();
        TableRowSorter<TableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + (consulta), 1));
    }// fin del método filtro
     
}// fin de la clase JDBajaPeliculas
