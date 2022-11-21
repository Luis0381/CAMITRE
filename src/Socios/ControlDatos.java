package Personas;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloPersona modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloPersona();
    }
    
    public ArrayList<ModeloPersona> llenarDatos(){
        ModeloPersona datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloPersona> lista = new ArrayList<>();
        String sql = "select id_persona, dni_persona,nombre_persona, apellido_persona, genero_persona, paisorigen_persona from persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloPersona();
                datos.setId(rs.getInt("id_persona"));
                datos.setDni(rs.getInt("dni_persona"));
                datos.setNombre(rs.getString("nombre_persona"));                
                datos.setApellido(rs.getString("apellido_persona"));
                datos.setGenero(rs.getString("genero_persona"));
                datos.setPais(rs.getString("paisorigen_persona"));
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
