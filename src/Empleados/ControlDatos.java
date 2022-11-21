package Empleados;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloEmpleado modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloEmpleado();
    }
    
        public ArrayList<ModeloEmpleado> llenarDatos(){
        ModeloEmpleado datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloEmpleado> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona,persona.apellido_persona,persona.genero_persona,persona.paisorigen_persona,mantenimiento.cargo_mantenimiento,mantenimiento.sueldo_mantenimiento FROM persona INNER JOIN mantenimiento ON persona.id_persona=mantenimiento.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloEmpleado();
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona"));
                datos.setGenero(rs.getString("persona.genero_persona"));
                datos.setPais(rs.getString("persona.paisorigen_persona"));  
                datos.setCargo(rs.getString("mantenimiento.cargo_mantenimiento")); 
                datos.setSueldo(rs.getFloat("mantenimiento.sueldo_mantenimiento")); 
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
