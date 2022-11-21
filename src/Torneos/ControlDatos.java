package Torneos;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloTorneos modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloTorneos();
    }
    
    public ArrayList<ModeloTorneos> llenarDatos(){
        ModeloTorneos datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloTorneos> lista = new ArrayList<>();
        String sql = "select id_torneo,nombre_torneo,formato_torneo,fecha_torneo FROM torneo";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloTorneos();
                datos.setId(rs.getInt("id_torneo"));
                datos.setNombre(rs.getString("nombre_torneo"));
                datos.setFormato(rs.getString("formato_torneo"));
                datos.setFecha_inicio(rs.getString("fecha_torneo"));
                lista.add(datos);                 
            }            
            rs.close();
            ps.close();
            con.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return lista;
    }
}
