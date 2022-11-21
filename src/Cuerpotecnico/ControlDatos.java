package Cuerpotecnico;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloCuerpotecnico modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloCuerpotecnico();
    }
    
        public ArrayList<ModeloCuerpotecnico> llenarDatos(){
        ModeloCuerpotecnico datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloCuerpotecnico> lista = new ArrayList<>();
        String sql = "select persona.dni_persona,persona.nombre_persona,persona.apellido_persona, cuerpo_tecnico.sueldo_cuerpo, cuerpo_tecnico.cargo_cuerpo, cuerpo_tecnico.licencia_entrenador FROM cuerpo_tecnico INNER JOIN persona ON cuerpo_tecnico.id_persona=persona.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloCuerpotecnico();
                datos.setDni(rs.getInt("persona.dni_persona"));
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setSueldo(rs.getFloat("cuerpo_tecnico.sueldo_cuerpo"));
                datos.setCargo(rs.getString("cuerpo_tecnico.cargo_cuerpo"));
                datos.setLicencia(rs.getString("cuerpo_tecnico.licencia_entrenador"));
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
