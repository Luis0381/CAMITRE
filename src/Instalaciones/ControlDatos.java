package Instalaciones;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloInstalacion modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloInstalacion();
    }
    
    public ArrayList<ModeloInstalacion> llenarDatos(){
        ModeloInstalacion datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloInstalacion> lista = new ArrayList<>();
        String sql = "select id_instalacion, tipo_instalacion, disponibilidad_instalacion from instalacion";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
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
        return lista;
    }
}
