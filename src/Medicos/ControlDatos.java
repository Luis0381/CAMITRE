package Medicos;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloMedico modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloMedico();
    }
    
        public ArrayList<ModeloMedico> llenarDatos(){
        ModeloMedico datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloMedico> lista = new ArrayList<>();
        String sql = "select persona.dni_persona,persona.nombre_persona,persona.apellido_persona,medico.especialidad_medico,medico.numero_licencia,medico.sueldo_medico FROM medico INNER JOIN persona ON medico.id_persona=persona.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloMedico();
                datos.setDni(rs.getInt("persona.dni_persona"));
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setEspecialidad(rs.getString("medico.especialidad_medico"));
                datos.setNumerolicencia(rs.getString("medico.numero_licencia")); 
                datos.setSueldo(rs.getString("medico.sueldo_medico")); 
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
