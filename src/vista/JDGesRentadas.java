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
public class JDGesRentadas extends javax.swing.JDialog {

     //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
   
    //Modelo para nuestra tablaPeliculas
    private PeliculasVisiblesTableModel model;
    
    String estadoR = "RENTADA";
 
    /**
     * Creates new form JDGesRentadas
     */
    public JDGesRentadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Ponemos el cursor en el campos Busqueda
        txtBusqueda.requestFocusInWindow();
        //Obtenemos todos los métodos de la clase MySQLPeliculasDAO
        this.manager = new MySQLDAOManager();
        
        try {
            //llamamos el método para iniciar la tabla de Películas Rentadas
            inicializarListaPeliculasRent();
        }catch (DAOException ex) {
            Logger.getLogger(JDPeliculas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRentadas = new rojerusan.RSTableMetro();
        btnDevolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelImage4 = new org.edisoncor.gui.panel.PanelImage();
        txtBusqueda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/peliRent.png"))); // NOI18N

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 50));

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 700, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRentadas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblRentadas.setAltoHead(20);
        tblRentadas.setColorBackgoundHead(new java.awt.Color(255, 192, 0));
        tblRentadas.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tblRentadas.setColorBordeHead(new java.awt.Color(255, 192, 0));
        tblRentadas.setColorFilasBackgound1(new java.awt.Color(255, 242, 204));
        tblRentadas.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tblRentadas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tblRentadas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tblRentadas.setColorSelBackgound(new java.awt.Color(255, 243, 166));
        tblRentadas.setColorSelForeground(new java.awt.Color(0, 0, 0));
        tblRentadas.setFuenteFilas(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        tblRentadas.setFuenteFilasSelect(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        tblRentadas.setFuenteHead(new java.awt.Font("Rockwell", 1, 15)); // NOI18N
        tblRentadas.setMultipleSeleccion(false);
        tblRentadas.setShowHorizontalLines(false);
        jScrollPane3.setViewportView(tblRentadas);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 680, 180));

        btnDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/regresarPeli.png"))); // NOI18N
        btnDevolver.setBorderPainted(false);
        btnDevolver.setContentAreaFilled(false);
        btnDevolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgIconos/regresarPeli(1).png"))); // NOI18N
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Devolver Película");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

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

        jPanel2.add(panelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 250, 40));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Buscar Título:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 700, 310));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 50, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Salir");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        //Mandamos llamar el método devolver
        devolver();
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        //Mandamos llamar el método filtro y le mandamos como parámetro lo que se escribe en la busqueda y la tblRentadas
        filtro(txtBusqueda.getText().toUpperCase(), tblRentadas);
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
            java.util.logging.Logger.getLogger(JDGesRentadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDGesRentadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDGesRentadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDGesRentadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDGesRentadas dialog = new JDGesRentadas(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage4;
    private rojerusan.RSTableMetro tblRentadas;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para cargar la tabla con las películas Rentadas
     * @throws DAOException 
     */
    private void inicializarListaPeliculasRent() throws DAOException {
        model = new PeliculasVisiblesTableModel(manager.getPeliculasDAO());
            
        //Asignamos el modelo y ponemos los titulos a ver en nuestra tabla
        tblRentadas.setModel(model);
        model.updateModelAll(estadoR);
        model.fireTableDataChanged();
    }// fin del método inicializarListaPeliculasRent
    
    /**
     * Método para validar que se haya seleccionado una fila se la tabla
     * @return 
     */
    private boolean seleccion() {
       boolean validar = false;
        //si se selecciona una fila entonces se devuelve la película
       if(tblRentadas.getSelectedRow() > -1 ){
           validar = true;
       }else{
            validar = false;
            ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/seleccionFila.png"));
            JOptionPane.showMessageDialog(null, "<html><h1>Selecciona una Película</h1></html>",
                    "Selecciona una Fila", 0, miIcono);
        }// fin del else
       
       return validar;
    }// fin del método seleccion

    /**
     * Método para devolver una película su estado será ACTIVO
     */
    private void devolver() {
        //Verificamos que se haya seleccionado una fila para cambiar el estado
        if(seleccion()){
            int fila;
            String peli;
            //Obtenemos la fila seleccionada de la tbl Rentadas
            fila = tblRentadas.getSelectedRow();
            // Obtenemos el id de la película seleccionada
            peli = (String) tblRentadas.getValueAt(fila, 0);
            
            //Colocamos el estado a ACTIVO que será el estado al cuál se hará el cambio
            String estado = "ACTIVO";

            //llamamos el constructor para crear un objeto de tipo peliculas
            peliculas miPelicula = new peliculas(peli, estado);
            try {
                //Hacemos un update para cambiar el estado de la película a ACTIVO
                manager.getPeliculasDAO().estado(miPelicula);
                ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/peliActualizar.png"));
                JOptionPane.showMessageDialog(null, "<html><h2>La Película ha sido Devuelta</h2></html>", "Proceso Exitoso",
                        0, miIcono); 
                //Llamaos el método para actualizar la tabla
                inicializarListaPeliculasRent();
            } catch (DAOException ex) {
                Logger.getLogger(JDGesRentadas.class.getName()).log(Level.SEVERE, null, ex);
            }// fin del catch
        }//fin del if
    }// fin del método devolver
    
    /**
     * Método para filtrar las busquedas en la tabla
     * @param consulta
     * @param jtableBuscar 
     */
    private void filtro(String consulta, JTable jtableBuscar){
        TableModel dm;
        dm = tblRentadas.getModel();
        TableRowSorter<TableModel> tr = new TableRowSorter<>(dm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + (consulta), 1));
    }// fin del método filtro

}// fin de la clase JDGesRentadas
