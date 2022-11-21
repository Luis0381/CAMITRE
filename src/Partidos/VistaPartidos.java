/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Partidos;

import Home.menuprincipal;
import Partidos.ModeloPartidos;
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
 * @author Webmaster
 */
public class VistaPartidos extends javax.swing.JFrame {

        private Partidos.Conectar conectar;
        private ModeloPartidos modelo;
        private Connection con;
    /**
     * Creates new form VistaDatos
     */
    public VistaPartidos() {
        conectar = new Partidos.Conectar();
        modelo = new ModeloPartidos();
        initComponents();
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
        txt_golesm = new javax.swing.JTextField();
        txt_torneo = new javax.swing.JTextField();
        boton_buscar = new javax.swing.JButton();
        boton_volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_rival = new javax.swing.JTextField();
        txt_condicion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_golesr = new javax.swing.JTextField();
        txt_instancia = new javax.swing.JTextField();
        txt_estadio = new javax.swing.JTextField();

        jLabel6.setText("Condicion:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jScrollPane1.setViewportView(tblDatos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Partidos");

        jLabel3.setText("Torneo");

        jLabel4.setText("Rival:");

        txt_golesm.setToolTipText("Ingrese el nombre que desea buscar");

        txt_torneo.setToolTipText("Ingrese el nombre que desea buscar");

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

        jLabel5.setText("Goles Recibidos:");

        jLabel7.setText("Condicion:");

        jLabel8.setText("Goles Marcados:");

        txt_rival.setToolTipText("Ingrese el nombre que desea buscar");

        txt_condicion.setToolTipText("Ingrese el nombre que desea buscar");

        jLabel9.setText("Estadio:");

        jLabel10.setText("Instancia:");

        txt_golesr.setToolTipText("Ingrese el nombre que desea buscar");

        txt_instancia.setToolTipText("Ingrese el nombre que desea buscar");

        txt_estadio.setToolTipText("Ingrese el nombre que desea buscar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_rival, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                                    .addComponent(txt_condicion, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_golesm, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_golesr, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_instancia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_estadio, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_torneo)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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
                            .addComponent(txt_torneo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_rival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_condicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_golesm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_golesr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_instancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_estadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarTabla();
    }//GEN-LAST:event_formWindowActivated

    private void boton_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarActionPerformed
        String b_torneo=txt_torneo.getText().trim();
        String b_rival=txt_rival.getText().trim();
        String b_condicion=txt_condicion.getText().trim();
        String b_golesm=txt_golesm.getText().trim();
        String b_golesr=txt_golesr.getText().trim();
        String b_instancia=txt_instancia.getText().trim();
        String b_estadio=txt_estadio.getText().trim();

        ModeloPartidos datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloPartidos> lista = new ArrayList<>();
        String sql = "select partido.id_partido,torneo.nombre_torneo,partido.rival_partido,partido.condicion_partido,partido.goles_recibidos,partido.goles_marcados,partido.instancia_partido,partido.estadio_partido FROM partido INNER JOIN torneo on partido.id_torneo=torneo.id_torneo WHERE torneo.nombre_torneo LIKE ? AND partido.rival_partido LIKE ? AND partido.condicion_partido LIKE ? AND partido.goles_marcados LIKE ? AND partido.goles_recibidos LIKE ? AND partido.instancia_partido LIKE ? AND partido.estadio_partido LIKE ?";
        
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + b_torneo + "%");
            ps.setString(2, "%" + b_rival + "%");
            ps.setString(3, "%" + b_condicion + "%");
            ps.setString(4, "%" + b_golesm + "%");
            ps.setString(5, "%" + b_golesr + "%");
            ps.setString(6, "%" + b_instancia + "%");
            ps.setString(7, "%" + b_estadio + "%");
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloPartidos();
                datos.setId_partido(rs.getInt("partido.id_partido"));
                datos.setNombre_torneo(rs.getString("torneo.nombre_torneo"));
                datos.setRival(rs.getString("partido.rival_partido"));
                datos.setCondicion(rs.getString("partido.condicion_partido"));
                datos.setGoles_r(rs.getInt("partido.goles_recibidos"));
                datos.setGoles_m(rs.getInt("partido.goles_marcados"));
                datos.setInstancia(rs.getString("partido.instancia_partido"));
                datos.setEstadio(rs.getString("partido.estadio_partido"));
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
        tabla.addColumn("Nombre Torneo");
        tabla.addColumn("Nombre Rival");        
        tabla.addColumn("Condicion del partido"); 
        tabla.addColumn("Goles Marcados"); 
        tabla.addColumn("Goles Recibidos"); 
        tabla.addColumn("Instancia"); 
        tabla.addColumn("Estadio"); 
        for(int f=0; f<lista.size();f++){
            fila[0] = valueOf(lista.get(f).getId_partido());
            fila[1] = lista.get(f).getNombre_torneo();
            fila[2] = lista.get(f).getRival();
            fila[3] = lista.get(f).getCondicion();
            fila[4] = valueOf(lista.get(f).getGoles_m());
            fila[5] = valueOf(lista.get(f).getGoles_r());
            fila[6] = lista.get(f).getInstancia();
            fila[7] = lista.get(f).getEstadio();
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
            java.util.logging.Logger.getLogger(VistaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPartidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VistaPartidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_buscar;
    private javax.swing.JButton boton_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txt_condicion;
    private javax.swing.JTextField txt_estadio;
    private javax.swing.JTextField txt_golesm;
    private javax.swing.JTextField txt_golesr;
    private javax.swing.JTextField txt_instancia;
    private javax.swing.JTextField txt_rival;
    private javax.swing.JTextField txt_torneo;
    // End of variables declaration//GEN-END:variables

    private void llenarTabla() {
        DefaultTableModel tabla =  new DefaultTableModel();
        ControlDatos control = new ControlDatos();
        ArrayList<ModeloPartidos> datos;
        String[] fila = new String[45];
        tabla.addColumn("ID");
        tabla.addColumn("Nombre Torneo");
        tabla.addColumn("Nombre Rival");        
        tabla.addColumn("Condicion del partido"); 
        tabla.addColumn("Goles Marcados"); 
        tabla.addColumn("Goles Recibidos"); 
        tabla.addColumn("Instancia"); 
        tabla.addColumn("Estadio"); 
        datos = control.llenarDatos();         
        for(int f=0; f<datos.size();f++){
            fila[0] = valueOf(datos.get(f).getId_partido());
            fila[1] = datos.get(f).getNombre_torneo();
            fila[2] = datos.get(f).getRival();
            fila[3] = datos.get(f).getCondicion();
            fila[4] = valueOf(datos.get(f).getGoles_m());
            fila[5] = valueOf(datos.get(f).getGoles_r());
            fila[6] = datos.get(f).getInstancia();
            fila[7] = datos.get(f).getEstadio();
            tabla.addRow(fila);
        }
        tblDatos.setModel(tabla);
    }
}
