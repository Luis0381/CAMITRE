package Instalaciones;

import Futbolistas.ModeloFutbolista;
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
public class VistaInstalaciones extends javax.swing.JFrame {

           private Futbolistas.Conectar conectar;
        private ModeloFutbolista modelo;
        private Connection con;
    /**
     * Creates new form VistaDatos
     */
    public VistaInstalaciones() {
        conectar = new Futbolistas.Conectar();
        modelo = new ModeloFutbolista();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        txt_disponibilidad = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        boton_nuevo = new javax.swing.JButton();
        boton_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Atlético Mitre (Santiago del Estero)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setViewportView(tblDatos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Instalaciones");

        jLabel3.setText("Disponibilidad:");

        jLabel4.setText("Tipo:");

        txt_tipo.setToolTipText("Ingrese el tipo de instalacion que desea buscar");
        txt_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_tipoKeyPressed(evt);
            }
        });

        txt_disponibilidad.setToolTipText("Ingrese el nombre que desea buscar");
        txt_disponibilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_disponibilidadKeyPressed(evt);
            }
        });

        boton_buscar.setText("Buscar");
        boton_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarActionPerformed(evt);
            }
        });

        boton_volver.setText("Volver");
        boton_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_volverActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
                            .addComponent(txt_disponibilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(boton_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boton_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_disponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(boton_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(boton_borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_volver)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void txt_tipoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipoKeyPressed

    private void txt_disponibilidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_disponibilidadKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_disponibilidadKeyPressed

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        String buscarTipo = txt_tipo.getText().trim();
        String buscarDisponibilidad = txt_disponibilidad.getText().trim();

        ModeloInstalacion datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloInstalacion> lista = new ArrayList<>();
        String sql = "select id_instalacion,disponibilidad_instalacion, tipo_instalacion FROM instalacion WHERE tipo_instalacion LIKE ? AND disponibilidad_instalacion LIKE ?";
        
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + buscarTipo + "%");
            ps.setString(2, "%" + buscarDisponibilidad + "%"); //Solo mayusc
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloInstalacion();
                datos.setId(rs.getInt("id_instalacion"));
                datos.setTipo(rs.getString("tipo_instalacion")); 
                datos.setDisponibilidad(rs.getString("disponibilidad_instalacion")); 
                lista.add(datos);             
            }                    
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        
        DefaultTableModel tabla =  new DefaultTableModel();
        String[] fila = new String[45];
        tabla.addColumn("ID");
        tabla.addColumn("Tipo");
        tabla.addColumn("Disponibilidad");        
        for(int f=0; f<lista.size();f++){
            fila[0] = lista.get(f).getId().toString();
            fila[1] = lista.get(f).getTipo();
            fila[2] = lista.get(f).getDisponibilidad();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
        menuprincipal volver = new menuprincipal();
        volver.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_volverActionPerformed

    private void boton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_nuevoActionPerformed
        VistaIngresarInstalacion volver = new VistaIngresarInstalacion();
        volver.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_nuevoActionPerformed

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        
        PreparedStatement ps;

        int fila = tblDatos.getSelectedRow();
        String id = tblDatos.getModel().getValueAt(fila,0).toString();

        String sql = "delete from instalacion where instalacion.id_instalacion=?";

        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1,id);
            ps.executeUpdate();
            ps.close();
            con.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }

        llenarTabla();
    }//GEN-LAST:event_boton_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaInstalaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInstalaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInstalaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInstalaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInstalaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_nuevo;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_disponibilidad;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel tabla =  new DefaultTableModel();
        ControlDatos control = new ControlDatos();
        ArrayList<ModeloInstalacion> datos;
        String[] fila = new String[45];
        tabla.addColumn("ID");
        tabla.addColumn("Tipo");
        tabla.addColumn("Disponibilidad");
        datos = control.llenarDatos();         
        for(int f=0; f<datos.size();f++){
            fila[0] = datos.get(f).getId().toString();
            fila[1] = datos.get(f).getTipo();
            fila[2] = datos.get(f).getDisponibilidad();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }
}
