package Partidos;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloPartidos modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloPartidos();
    }
    
    public ArrayList<ModeloPartidos> llenarDatos(){
        ModeloPartidos datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloPartidos> lista = new ArrayList<>();
        String sql = "select partido.id_partido,torneo.nombre_torneo,partido.rival_partido,partido.condicion_partido,partido.goles_recibidos,partido.goles_marcados,partido.instancia_partido,partido.estadio_partido FROM partido INNER JOIN torneo on partido.id_torneo=torneo.id_torneo";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
         
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
        return lista;
    }
}
