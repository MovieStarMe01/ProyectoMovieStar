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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static vista.FrmePrincipal.genero;


/**
 * @author Erick
 * @author Jesús Moisés
 */
public class JDPeliculas extends javax.swing.JDialog {
    
    //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
   
    public static String IDPelicula;
    public static String titulo;
    public static int anio;
    public static String genero1;
    public static String audio;
    public static String calidad;
    public static double precioRenta;
    public static double precioVenta;
    public static String sinopsis;
    public static String caratula;
    //Modelo para nuestra tablaPeliculas
    private PeliculasTableModel model;
    
   
    ArrayList<peliculas> misPeliculas = new ArrayList<peliculas>();
    
    
    //Propiedades para  modificar el width de nuestra tabla tblPeliculas
    TableColumnModel columnModel = null;
   
    /**
     * Creates new form JDPeliculas
     * @param parent
     * @param modal
     */
    public JDPeliculas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Obtenemos todos los métodos de la clase MySQLPeliculasDAO
        this.manager = new MySQLDAOManager();
        //Aplicamos el focus en el campo busqueda
        txtBusqueda.requestFocusInWindow();
        
        try {
            inicializarListaPeliculas();
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
        lblGenero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtBusqueda = new javax.swing.JTextField();
        btnRentarComprar = new javax.swing.JButton();
        btnVerPeliculas = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnGestionPeliculas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPeliculas = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGenero.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 20));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Título:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 42, 730, 10));

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

        jPanel1.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 250, 40));

        btnRentarComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/buy.png"))); // NOI18N
        btnRentarComprar.setBorderPainted(false);
        btnRentarComprar.setContentAreaFilled(false);
        btnRentarComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRentarComprar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/buy (1).png"))); // NOI18N
        btnRentarComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentarComprarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRentarComprar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnVerPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/actualizarPeli.png"))); // NOI18N
        btnVerPeliculas.setBorderPainted(false);
        btnVerPeliculas.setContentAreaFilled(false);
        btnVerPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerPeliculas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/actualizarPeli (1).png"))); // NOI18N
        btnVerPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPeliculasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 60, 60, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/close door.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/open door.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 50, -1));

        btnGestionPeliculas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/support.png"))); // NOI18N
        btnGestionPeliculas.setBorderPainted(false);
        btnGestionPeliculas.setContentAreaFilled(false);
        btnGestionPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestionPeliculas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/support (1).png"))); // NOI18N
        btnGestionPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionPeliculasActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Actualizar Lista");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Rentar/Comprar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Gestiones");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Salir");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 360, 40, -1));

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
        tblPeliculas.setAltoHead(20);
        tblPeliculas.setColorBackgoundHead(new java.awt.Color(255, 192, 0));
        tblPeliculas.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tblPeliculas.setColorBordeHead(new java.awt.Color(255, 192, 0));
        tblPeliculas.setColorFilasBackgound1(new java.awt.Color(255, 242, 204));
        tblPeliculas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblPeliculas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblPeliculas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblPeliculas.setColorSelBackgound(new java.awt.Color(255, 243, 166));
        tblPeliculas.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblPeliculas.setFuenteFilas(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tblPeliculas.setFuenteFilasSelect(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tblPeliculas.setFuenteHead(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        tblPeliculas.setMultipleSeleccion(false);
        tblPeliculas.setShowHorizontalLines(false);
        jScrollPane2.setViewportView(tblPeliculas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 740, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRentarComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentarComprarActionPerformed
        // si se selecciona una fila entonces abrimos la ventana detalles para rentar o vender
        if(tblPeliculas.getSelectedRow() > -1){
            int fila = tblPeliculas.getSelectedRow();
            IDPelicula = (String) tblPeliculas.getValueAt(fila, 0);
            titulo = (String) tblPeliculas.getValueAt(fila, 1);
            anio = (int) tblPeliculas.getValueAt(fila, 2);
            audio = (String) tblPeliculas.getValueAt(fila, 3);
            calidad = (String) tblPeliculas.getValueAt(fila, 4);
            precioRenta = (double) tblPeliculas.getValueAt(fila, 5);
            precioVenta = (double) tblPeliculas.getValueAt(fila, 6);
            genero1 = (String) tblPeliculas.getValueAt(fila, 7);
            sinopsis = (String) tblPeliculas.getValueAt(fila, 8);
            caratula = (String) tblPeliculas.getValueAt(fila, 9);
       
            JDRentaVenta miRentaVenta = new JDRentaVenta(null, true);
            miRentaVenta.setVisible(true);
        }else{
            ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/seleccionaPeli.png"));
            JOptionPane.showMessageDialog(null, "<html><h1>Selecciona una Película</h1></html>", "Selecciona una Fila", 0,
                    miIcono);
        }// fin del else
    }//GEN-LAST:event_btnRentarComprarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGestionPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionPeliculasActionPerformed
        JDGestiones misGestiones = new JDGestiones(null, true);
        misGestiones.setVisible(true);
    }//GEN-LAST:event_btnGestionPeliculasActionPerformed

    private void btnVerPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPeliculasActionPerformed
        
        genero = lblGenero.getText();
      
        try {
            inicializarListaPeliculas();
        } catch (DAOException ex) {
            Logger.getLogger(JDPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }// fin del catch
        
    }//GEN-LAST:event_btnVerPeliculasActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
       //Mandamos llamar el método filtro y le mandamos como parámetro lo que se escribe en la busqueda y la tblPeliculas
       filtro(txtBusqueda.getText().toUpperCase(), tblPeliculas);
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
            java.util.logging.Logger.getLogger(JDPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDPeliculas dialog = new JDPeliculas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnGestionPeliculas;
    private javax.swing.JButton btnRentarComprar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerPeliculas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblGenero;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private rojerusan.RSTableMetro tblPeliculas;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para colocar los titulos a nuestra tabla
     */
    private void inicializarListaPeliculas() throws DAOException {
        
        model = new PeliculasTableModel(manager.getPeliculasDAO());
        //Asignamos el modelo y ponemos los titulos a ver en nuestra tabla
        tblPeliculas.setModel(model);
        cargarPeliculas();
    }// fin del método inicializarListaPeliculas
    
    /**
     * Método para mostrar las películas en nuestra tabla
     * @throws DAOException 
     */
    private void cargarPeliculas() throws DAOException{
        if(!genero.equals("TODOS LOS GÉNEROS")){
            model.updateModel(genero);
            model.fireTableDataChanged();
        }else{
            model.updateModelAll("TODOS");
            model.fireTableDataChanged();
        }// fin del else if
    }// fin del método cargarPeliculas
    
    /**
     * Método para filtrar las busquedas en la tabla
     * @param consulta
     * @param jtableBuscar 
     */
    private void filtro(String consulta, JTable jtableBuscar){
        TableModel dm;
        dm = tblPeliculas.getModel();
        TableRowSorter<TableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + (consulta), 1));
    }// fin del método filtro
   
}// fin de la clase JDPeliculas
