package Cuotas;


import Socios.*;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloCuota modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloCuota();
    }
    
        public ArrayList<ModeloCuota> llenarDatos(){
        ModeloCuota datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloCuota> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona, persona.apellido_persona, cuota.descripcion_cuota, cuota.forma_pago, cuota.monto_cuota, cuota.fecha_pago FROM persona inner join socio ON persona.id_persona=socio.id_persona inner join cuota ON persona.id_persona=cuota.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloCuota();
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setDescripcion(rs.getString("cuota.descripcion_cuota"));
                datos.setForma(rs.getString("cuota.forma_pago"));
                datos.setMonto(rs.getString("cuota.monto_cuota"));
                datos.setFecha(rs.getString("cuota.fecha_pago"));
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
