/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Home;

import Futbolistas.VistaFutbolistas;
import Instalaciones.VistaInstalaciones;
import Medicos.VistaMedicos;
import Partidos.VistaPartidos;
import Socios.VistaSocios;
import javax.swing.JOptionPane;

/**
 *
 * @author 12Mat
 */
public class menuprincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuprincipal
     */
    public menuprincipal() {
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

        btn_partidos = new javax.swing.JButton();
        Boton_Futbolistas = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        boton_instalaciones = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        boton_socios = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        boton_medicos = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Boton_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_partidos.setText("Partidos");
        btn_partidos.setToolTipText("");
        btn_partidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partidosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_partidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 150, 20));

        Boton_Futbolistas.setText("Futbolistas");
        Boton_Futbolistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_FutbolistasActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Futbolistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 110, -1));

        jButton3.setText("Mercado Transferencias");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        boton_instalaciones.setText("Instalaciones");
        boton_instalaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_instalacionesActionPerformed(evt);
            }
        });
        getContentPane().add(boton_instalaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, -1));

        jButton5.setText("Cuerpo Técnico");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        boton_socios.setText("Socios");
        boton_socios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_sociosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_socios, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 110, -1));

        jButton7.setText("Empleados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 110, -1));

        boton_medicos.setText("Médicos");
        boton_medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_medicosActionPerformed(evt);
            }
        });
        getContentPane().add(boton_medicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 110, -1));

        jButton9.setText("Lesiones");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 150, -1));

        jButton10.setText("Torneos");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 150, -1));

        Boton_salir.setText("Salir");
        Boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_salirActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 90, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/mitre-santiago-del-estero-cancha2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-8, -7, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_partidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partidosActionPerformed
        VistaPartidos partidos = new VistaPartidos();
        partidos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_partidosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void boton_instalacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_instalacionesActionPerformed
        VistaInstalaciones instalaciones = new VistaInstalaciones();
        instalaciones.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_instalacionesActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void boton_sociosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_sociosActionPerformed
        VistaSocios socios = new VistaSocios();
        socios.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_sociosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void boton_medicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_medicosActionPerformed
        VistaMedicos medicos = new VistaMedicos();
        medicos.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_boton_medicosActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_salirActionPerformed
        int opcion = JOptionPane.showOptionDialog(null, "Está seguro que desea salir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Sí", "No"}, this);
        if (opcion == JOptionPane.YES_OPTION) {
            this.dispose();
            System.exit(0);
        }
    }//GEN-LAST:event_Boton_salirActionPerformed

    private void Boton_FutbolistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_FutbolistasActionPerformed
        VistaFutbolistas futbolistas = new VistaFutbolistas();
        futbolistas.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_Boton_FutbolistasActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Futbolistas;
    private javax.swing.JButton Boton_salir;
    private javax.swing.JButton boton_instalaciones;
    private javax.swing.JButton boton_medicos;
    private javax.swing.JButton boton_socios;
    private javax.swing.JButton btn_partidos;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
