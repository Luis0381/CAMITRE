package Lesiones;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloLesiones modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloLesiones();
    }
    
    public ArrayList<ModeloLesiones> llenarDatos(){
        ModeloLesiones datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloLesiones> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona,persona.apellido_persona,lesion.tipo_lesion FROM persona inner join Futbolista ON persona.id_persona=futbolista.id_persona INNER JOIN lesion ON futbolista.id_persona=lesion.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloLesiones();
                datos.setNombre(rs.getString("persona.nombre_persona"));
                datos.setApellido(rs.getString("persona.apellido_persona"));
                datos.setTipo_lesion(rs.getString("lesion.tipo_lesion"));
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
