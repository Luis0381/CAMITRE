package Dirigentes;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloDirigente modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloDirigente();
    }
    
        public ArrayList<ModeloDirigente> llenarDatos(){
        ModeloDirigente datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloDirigente> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona,persona.apellido_persona,persona.genero_persona,persona.paisorigen_persona,dirigente.cargo_dirigente,dirigente.fecha_inicio,dirigente.fecha_fin,cuenta.tipo_cuenta FROM persona INNER JOIN dirigente ON persona.id_persona=dirigente.id_persona INNER JOIN cuenta ON dirigente.id_cuenta=cuenta.id_cuenta";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloDirigente();
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona"));
                datos.setGenero(rs.getString("persona.genero_persona"));
                datos.setPais(rs.getString("persona.paisorigen_persona"));  
                datos.setCargo(rs.getString("dirigente.cargo_dirigente")); 
                datos.setInicio_contrato(rs.getString("dirigente.fecha_inicio")); 
                datos.setFin_contrato(rs.getString("dirigente.fecha_fin")); 
                datos.setTipo_cuenta(rs.getString("cuenta.tipo_cuenta")); 
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
