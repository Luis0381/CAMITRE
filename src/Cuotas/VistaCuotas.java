package Cuotas;

import Home.menuprincipal;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis0381
 */
public class VistaCuotas extends javax.swing.JFrame {
        private Conectar conectar;
        private ModeloCuota modelo;
        private Connection con;
    /**
     * Creates new form VistaDatos
     */
    public VistaCuotas() {
        conectar = new Conectar();
        modelo = new ModeloCuota();
        initComponents();
        setIconImage(getIconImage());
        setLocationRelativeTo(null);
    }
    
    //Se establece el icono de la vista
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenicono/Mitre_escudo.png"));
        return retValue;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        boton_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_nuevo = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_forma = new javax.swing.JTextField();
        txt_monto = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Atl??tico Mitre (Santiago del Estero)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Cuotas");

        jScrollPane1.setViewportView(tblDatos);

        boton_volver.setText("Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
            }
        });

        jLabel2.setText("Forma:");

        txt_nombre.setToolTipText("Ingrese el nombre que desea buscar");
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nombreKeyPressed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido: ");

        txt_apellido.setToolTipText("Ingrese el apellido que desea buscar");
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyPressed(evt);
            }
        });

        txt_descripcion.setToolTipText("Ingrese el tipo de socio que desea buscar");
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyPressed(evt);
            }
        });

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        boton_nuevo.setText("Nuevo");
        boton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_nuevoActionPerformed(evt);
            }
        });

        boton_borrar.setText("Borrar");
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Descripcion:");

        jLabel6.setText("Fecha:");

        jLabel7.setText("Monto:");

        txt_forma.setToolTipText("Ingrese el tipo de socio que desea buscar");
        txt_forma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_formaKeyPressed(evt);
            }
        });

        txt_monto.setToolTipText("Ingrese el tipo de socio que desea buscar");
        txt_monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_montoKeyPressed(evt);
            }
        });

        txt_fecha.setToolTipText("Ingrese el tipo de socio que desea buscar");
        txt_fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fechaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre)
                            .addComponent(txt_apellido)
                            .addComponent(txt_descripcion)
                            .addComponent(txt_forma)
                            .addComponent(txt_monto)
                            .addComponent(txt_fecha)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton_buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_forma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(boton_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_volver))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        menuprincipal volver = new menuprincipal();
        volver.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_volverActionPerformed

    private void txt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreKeyPressed

    private void txt_apellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoKeyPressed

    private void txt_descripcionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionKeyPressed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed

        String buscarNombre = txt_nombre.getText().trim();
        String buscarApellido = txt_apellido.getText().trim();
        String buscarDescripcion = txt_descripcion.getText().trim();
        String buscarForma = txt_forma.getText().trim();
        String buscarMonto = txt_monto.getText().trim();
        String buscarFecha = txt_fecha.getText().trim();

        ModeloCuota datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloCuota> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona, persona.apellido_persona, cuota.descripcion_cuota, cuota.forma_pago, cuota.monto_cuota, cuota.fecha_pago FROM persona inner join socio ON persona.id_persona=socio.id_persona inner join cuota ON persona.id_persona=cuota.id_persona WHERE persona.nombre_persona LIKE ? AND persona.apellido_persona LIKE ? AND cuota.forma_pago LIKE ? AND cuota.fecha_pago LIKE ? AND cuota.monto_cuota LIKE ? AND cuota.descripcion_cuota LIKE ?";
        
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + buscarNombre + "%");
            ps.setString(2, "%" + buscarApellido + "%");
            ps.setString(3, "%" + buscarForma + "%");
            ps.setString(4, "%" + buscarFecha + "%");
            ps.setString(5, "%" + buscarMonto + "%");
            ps.setString(6, "%" + buscarDescripcion + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloCuota();
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setDescripcion(rs.getString("cuota.descripcion_cuota"));
                datos.setForma(rs.getString("cuota.forma_pago"));
                datos.setMonto(rs.getString("cuota.monto_cuota"));
                datos.setFecha(rs.getString("cuota.fecha_pago"));
                lista.add(datos);             
            }            
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexi??n: " + e.getMessage());
        }
        
        DefaultTableModel tabla =  new DefaultTableModel();
        String[] fila = new String[45];
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Descripcion");
        tabla.addColumn("Forma");
        tabla.addColumn("Monto");
        tabla.addColumn("Fecha");
        
        for(int f=0; f<lista.size();f++){
            fila[0] = lista.get(f).getNombre();
            fila[1] = lista.get(f).getApellido();
            fila[2] = lista.get(f).getDescripcion();
            fila[3] = lista.get(f).getForma();
            fila[4] = lista.get(f).getMonto();
            fila[5] = lista.get(f).getFecha();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        VistaIngresarCuota volver = new VistaIngresarCuota();
        volver.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_nuevoActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed

        PreparedStatement ps;

        int fila = tblDatos.getSelectedRow();
        String nombre = tblDatos.getModel().getValueAt(fila,0).toString();
        String apellido = tblDatos.getModel().getValueAt(fila,1).toString();
        String descripcion = tblDatos.getModel().getValueAt(fila,2).toString();
        String sql = "delete cuota from cuota INNER JOIN persona ON cuota.id_persona=persona.id_persona WHERE persona.nombre_persona=? AND persona.apellido_persona=? AND cuota.descripcion_cuota=?";

        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,nombre);
            ps.setString(2,apellido);
            ps.setString(3,descripcion);
            ps.executeUpdate();
            ps.close();
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexi??n: " + e.getMessage());
        }

        llenarTabla();
    }//GEN-LAST:event_boton_borrarActionPerformed

    private void txt_formaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_formaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_formaKeyPressed

    private void txt_montoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_montoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_montoKeyPressed

    private void txt_fechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaKeyPressed

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
            java.util.logging.Logger.getLogger(VistaCuotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCuotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCuotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCuotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCuotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_forma;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    
        private void llenarTabla() {
        DefaultTableModel tabla =  new DefaultTableModel();
        ControlDatos control = new ControlDatos();
        ArrayList<ModeloCuota> datos;
        String[] fila = new String[45];
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Descripcion");
        tabla.addColumn("Forma");
        tabla.addColumn("Monto");
        tabla.addColumn("Fecha");
        datos = control.llenarDatos();         
        for(int f=0; f<datos.size();f++){
            fila[0] = datos.get(f).getNombre();
            fila[1] = datos.get(f).getApellido();
            fila[2] = datos.get(f).getDescripcion();
            fila[3] = datos.get(f).getForma();
            fila[4] = datos.get(f).getMonto();
            fila[5] = datos.get(f).getFecha();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }
}
