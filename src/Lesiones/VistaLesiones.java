/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lesiones;

import Home.menuprincipal;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Webmaster
 */
public class VistaLesiones extends javax.swing.JFrame {

        private Lesiones.Conectar conectar;
        private ModeloLesiones modelo;
        private Connection con;
    /**
     * Creates new form VistaDatos
     */
    public VistaLesiones() {
        conectar = new Lesiones.Conectar();
        modelo = new ModeloLesiones();
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();

        jLabel6.setText("Condicion:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Atlético Mitre (Santiago del Estero)");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setViewportView(tblDatos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lesiones");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        txt_nombre.setToolTipText("Ingrese el nombre que desea buscar");

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

        jLabel7.setText("Tipo:");

        txt_apellido.setToolTipText("Ingrese el apellido que desea buscar");

        txt_tipo.setToolTipText("Ingrese el tipo de lesion que desea buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_volver)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        String b_nombre=txt_nombre.getText().trim();
        String b_apellido=txt_apellido.getText().trim();
        String b_tipo=txt_tipo.getText().trim();

        ModeloLesiones datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloLesiones> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona,persona.apellido_persona,lesion.tipo_lesion,trata.inicio_tratamiento,trata.fin_tratamiento FROM persona inner join Futbolista ON persona.id_persona=futbolista.id_persona INNER JOIN lesion ON futbolista.id_persona=lesion.id_persona INNER JOIN trata on trata.id_lesion=lesion.id_lesion WHERE persona.nombre_persona LIKE ? AND persona.apellido_persona LIKE ? AND lesion.tipo_lesion LIKE ?";
        
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + b_nombre + "%");
            ps.setString(2, "%" + b_apellido + "%");
            ps.setString(3, "%" + b_tipo + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloLesiones();
                datos.setNombre(rs.getString("persona.nombre_persona"));
                datos.setApellido(rs.getString("persona.apellido_persona"));
                datos.setTipo_lesion(rs.getString("lesion.tipo_lesion"));
                datos.setInicio_tratamiento(rs.getString("trata.inicio_tratamiento"));
                datos.setFin_tratamiento(rs.getString("trata.fin_tratamiento"));
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
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");        
        tabla.addColumn("Tipo de Lesion"); 
        tabla.addColumn("Inicio de Tratamiento"); 
        tabla.addColumn("Fin de Tratamiento"); 
        for(int f=0; f<lista.size();f++){
            fila[0] = lista.get(f).getNombre();
            fila[1] = lista.get(f).getApellido();
            fila[2] = lista.get(f).getTipo_lesion();
            fila[3] = lista.get(f).getInicio_tratamiento();
            fila[4] = lista.get(f).getFin_tratamiento();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }//GEN-LAST:event_boton_buscarActionPerformed

    private void boton_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_volverActionPerformed
                menuprincipal volver = new menuprincipal();
        volver.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_volverActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLesiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new VistaLesiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel tabla =  new DefaultTableModel();
        ControlDatos control = new ControlDatos();
        ArrayList<ModeloLesiones> datos;
        String[] fila = new String[45];
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");        
        tabla.addColumn("Tipo de Lesion"); 
        tabla.addColumn("Inicio de Tratamiento"); 
        tabla.addColumn("Fin de Tratamiento"); 
        datos = control.llenarDatos();         
        for(int f=0; f<datos.size();f++){
            fila[0] = datos.get(f).getNombre();
            fila[1] = datos.get(f).getApellido();
            fila[2] = datos.get(f).getTipo_lesion();
            fila[3] = datos.get(f).getInicio_tratamiento();
            fila[4] = datos.get(f).getFin_tratamiento();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }
}
