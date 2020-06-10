/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import DAO.DAOException;
import DAO.DAOManager;
import DAOMySQL.MySQLDAOManager;
import Modelo.cliente;
import Modelo.notas;
import Modelo.peliculas;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static vista.JDPeliculas.IDPelicula;
import static vista.JDPeliculas.titulo;
import static vista.JDPeliculas.anio;
import static vista.JDPeliculas.audio;
import static vista.JDPeliculas.calidad;
import static vista.JDPeliculas.caratula;
import static vista.JDPeliculas.genero1;
import static vista.JDPeliculas.precioRenta;
import static vista.JDPeliculas.precioVenta;
import static vista.JDPeliculas.sinopsis;

/**
 *
 * @author Jesús Moisés
 */
public class JDRentaVenta extends javax.swing.JDialog {

    //Creamos un objeto de tipo interface IPeliculasDAO
    private DAOManager manager = null;
    
    DefaultComboBoxModel model = new DefaultComboBoxModel();
    
  
    int notaID;
    String notaTotal;
    String peliID;
    String tipoNota;
    int  idUsuario;
    int idCliente;
    
    String nombre;
    int id;
    String genero;
    String[] idCli = new String[50];
    String[] nombreCli = new String[50];
    int cantidad;
    
    ArrayList<cliente> misClientes = new ArrayList<cliente>();
    
    /**
     * Creates new form JDRentaVenta
     */
    public JDRentaVenta(java.awt.Frame parent, boolean modal){
        super(parent, modal);
        initComponents();
        
        //Obtenemos todos los métodos de la clase MySQLClienteDAO
        this.manager = new MySQLDAOManager();
       
        //llamamos el método cargarDatos
        cargarDatos();
        
        cmbClientes.removeAllItems();
        try {
            cargarComboClientes();
        } catch (DAOException ex) {
            Logger.getLogger(JDRentaVenta.class.getName()).log(Level.SEVERE, null, ex);
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
        jSeparator1 = new javax.swing.JSeparator();
        lblCaratula = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txASinopsis = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRenta = new javax.swing.JButton();
        btnVenta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblAño = new javax.swing.JLabel();
        lblAudio = new javax.swing.JLabel();
        lblCalidad = new javax.swing.JLabel();
        lblRenta = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        cmbClientes = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        lblIDCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(255, 214, 71));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 650, -1));

        lblCaratula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblCaratula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, 270));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Sinopsis");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        txASinopsis.setColumns(20);
        txASinopsis.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        txASinopsis.setRows(5);
        txASinopsis.setEnabled(false);
        jScrollPane2.setViewportView(txASinopsis);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 380, 110));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Genero:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 60, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Año:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 300, 40, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Audio:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Calidad:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Precio Renta Por 48h: $");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 380, 170, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Precio Venta: $");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, -1, -1));

        btnRenta.setText("Renta");
        btnRenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, -1, -1));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 380, 60, -1));

        lblNombre.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblNombre.setText("jLabel11");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        lblGenero.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblGenero.setText("jLabel11");
        jPanel1.add(lblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        lblAño.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblAño.setText("jLabel11");
        jPanel1.add(lblAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        lblAudio.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblAudio.setText("jLabel11");
        jPanel1.add(lblAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        lblCalidad.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblCalidad.setText("jLabel11");
        jPanel1.add(lblCalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        lblRenta.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblRenta.setText("jLabel11");
        jPanel1.add(lblRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        lblVenta.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        lblVenta.setText("jLabel11");
        jPanel1.add(lblVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        cmbClientes.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientes.setBorder(null);
        cmbClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmbClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClientesItemStateChanged(evt);
            }
        });
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 150, -1));

        lblCliente.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jPanel1.add(lblCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 130, 17));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Salir");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, -1, -1));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgGestiones/detalles.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText(" Cliente:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 60, -1));

        lblIDCliente.setFont(new java.awt.Font("Rockwell", 0, 13)); // NOI18N
        jPanel1.add(lblIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, 17));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("ID_Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //limpiamos la variable IDPeli
        titulo = null;
        //Cerramos la ventana
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        //Cada que se seleccione un cliente este se agregará al label para mostrar el cliente
        //int seleccionado = 0;
        //System.out.println(seleccionado);
        //int seleccionado = cmbClientes.getSelectedIndex();
        
        //System.out.println(seleccionado);
       /* for(int i = 0; i < cantidad; ++i){
            if(cmbClientes.getSelectedIndex() != -1){
                
            }
        }
        id = (int) cmbClientes.getSelectedItem();
       
        lblID.setText(String.valueOf(id));
        */
        //System.out.println(seleccionado);
        
        //lblCliente.setText(nombreCli[seleccionado]);
        
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void cmbClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClientesItemStateChanged
        //Cada que se seleccione un cliente este se agregará al label para mostrar el cliente y su id
        //Obtenemos el indice Seleccionado
        int seleccionado = (int) cmbClientes.getSelectedIndex();
     
        if(seleccionado != -1){
            lblCliente.setText(nombreCli[seleccionado]);
            lblIDCliente.setText(idCli[seleccionado]);
        }// fin del if 
    }//GEN-LAST:event_cmbClientesItemStateChanged

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        //Cambiamos tipoNota a RENTADA
        tipoNota = "VENDIDA";
        //Obtenemos el total o costo de la Película
        notaTotal = lblVenta.getText();
        //llamamos el método rentaVenta con el parámetro tipoNota
        rentaVenta(tipoNota,notaTotal);  
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnRentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentaActionPerformed
        //Cambiamos tipoNota a RENTADA
        tipoNota = "RENTADA";
        //Obtenemos el total o costo de la Película
        notaTotal = lblRenta.getText();
        //llamamos el método rentaVenta con el parámetro tipoNota
        rentaVenta(tipoNota, notaTotal); 
    }//GEN-LAST:event_btnRentaActionPerformed

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
            java.util.logging.Logger.getLogger(JDRentaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDRentaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDRentaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDRentaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDRentaVenta dialog = new JDRentaVenta(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnRenta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVenta;
    private javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAudio;
    private javax.swing.JLabel lblAño;
    private javax.swing.JLabel lblCalidad;
    private javax.swing.JLabel lblCaratula;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRenta;
    private javax.swing.JLabel lblVenta;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextArea txASinopsis;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para cargar datos de la película seleccionada
     */
    private void cargarDatos() {
        lblNombre.setText(titulo);
        lblAño.setText(String.valueOf(anio));
        lblAudio.setText(audio);
        lblGenero.setText(genero1);
        lblCalidad.setText(calidad);
        lblRenta.setText(String.valueOf(precioRenta));
        lblVenta.setText(String.valueOf(precioVenta));
        txASinopsis.setText(sinopsis);
        
        try{
            FileReader file = new FileReader(caratula);
            lblCaratula.setIcon(new ImageIcon(caratula));
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Imagen No Disponible", "ERROR",JOptionPane.ERROR_MESSAGE);
        }// fin del catch
        
        
        
    }// fin del método cargarDatos

    private void imgError() {
        lblCaratula.setIcon(new ImageIcon("/imgGestiones/imgNoDisponible.png"));
    }

    /**
     * Método para cargar idCliente y nombreCliente
     * @throws DAOException 
     */
    private void cargarComboClientes() throws DAOException {
        
        misClientes = (ArrayList<cliente>) manager.getClienteDAO().obtenerClientes();
        /**
         * For para recorrer el total de clientes que tenemos dados de alta
         */
        for(int i = 0; i < misClientes.size(); ++i){
            //Cada vuelta agregamos un cliente con su id y su nombre al ComboBox
            cmbClientes.addItem(String.valueOf(misClientes.get(i).getCli_ID()) + ", " +
                    misClientes.get(i).getNombreCliente());
            
            //llenamos los arrays con todo los id y nombres de los clientes
            idCli[i] = (String.valueOf(misClientes.get(i).getCli_ID()));
            nombreCli[i] = misClientes.get(i).getNombreCliente();
        }//fin del for 
        lblCliente.setText(nombreCli[0]);
        lblIDCliente.setText(idCli[0]);
    }// fin del método cargarComboClientes 

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
     * Método para realizar una Renta o una Venta según lo solicitado
     * @param tipoNota 
     */
    private void rentaVenta(String tipoNota, String notaTotal) {
        //Obtenemos el idCliente
        idCliente = Integer.parseInt(lblIDCliente.getText());
        //Obtenemos el id de la ¨Película a vender
        peliID = IDPelicula;
        //Obtenemos la fecha Actual en la que se realizará la venta
        java.util.Date utilDate = new java.util.Date();
        long lnMilisegundos = utilDate.getTime();
        java.sql.Timestamp notaFecha = new java.sql.Timestamp(lnMilisegundos);

        //System.out.println(notaFecha);
        //llamamos el constructor para crear un Objeto de tipo Notas
        notas miNota = new notas(notaTotal, notaFecha, peliID, tipoNota, 1, idCliente);
        try{
            manager.getNotasDAO().insertar(miNota);
            
            //Si tipoNota es igual a "Venta" entonces mandamos el mensaje de Vendida y cambiamos estado a VENDIDA
            if(tipoNota.equals("VENDIDA")){
                ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/peliAltaJOP.png"));
                JOptionPane.showMessageDialog(null, "<html><h2>Venta Satisfactoria</h2></html>",
                    "Proceso Exitoso", 0, miIcono);

                //llamamos el constructor para crear un objeto de tipo peliculas
                peliculas miPelicula = new peliculas(peliID, tipoNota);
                //Hacemos un update para cambiar el estado de la película a VENDIDA
                manager.getPeliculasDAO().estado(miPelicula);
         
            }// fin dle if VENDIDA
            
            //Si tipoNota es igual a "RENTADA" entonces mandamos el mensaje Rentada y cambiamos estado a RENTADA 
            if(tipoNota.equals("RENTADA")){
                ImageIcon miIcono = new ImageIcon(getClass().getResource("/imgIconos/peliAltaJOP.png"));
                JOptionPane.showMessageDialog(null, "<html><h2>Renta Satisfactoria</h2></html>",
                    "Proceso Exitoso", 0, miIcono);

                //llamamos el constructor para crear un objeto de tipo peliculas
                peliculas miPelicula = new peliculas(peliID, tipoNota);
                //Hacemos un update para cambiar el estado de la película a RENTADA
                manager.getPeliculasDAO().estado(miPelicula);
            }// fin del if RENTADA
                         
            //Cerramos la ventanda Detalles
            this.dispose();
        }catch(DAOException ex){
                 mensajeError(ex);
        }// fin del catch  
    }// fin del método rentaVenta
    
}// fin de la clase JDRentaVenta
