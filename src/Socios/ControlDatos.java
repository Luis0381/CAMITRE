package Socios;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloSocio modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloSocio();
    }
    
        public ArrayList<ModeloSocio> llenarDatos(){
        ModeloSocio datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloSocio> lista = new ArrayList<>();
        String sql = "select persona.dni_persona,persona.nombre_persona,persona.apellido_persona,socio.tipo_socio,persona.id_persona FROM socio INNER JOIN persona ON socio.id_persona=persona.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloSocio();
                datos.setDni(rs.getInt("persona.dni_persona"));
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setTipo(rs.getString("socio.tipo_socio"));
                datos.setId(rs.getInt("persona.id_persona")); 
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
