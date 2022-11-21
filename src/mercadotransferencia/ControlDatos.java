package mercadotransferencia;


import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloMercadotransferencia modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloMercadotransferencia();
    }
    
        public ArrayList<ModeloMercadotransferencia> llenarDatos(){
        ModeloMercadotransferencia datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloMercadotransferencia> lista = new ArrayList<>();
        String sql = "select persona.dni_persona,persona.nombre_persona,persona.apellido_persona,futbolista.altura_futbolista,futbolista.posición_futbolista, mercado_transferencias.año_mercado,mercado_transferencias.tipo_mercado,movimientos.costo_movimiento,movimientos.tipo_movimiento ,movimientos.calidad_movimiento FROM persona INNER JOIN futbolista ON persona.id_persona=futbolista.id_persona INNER JOIN involucrado ON futbolista.id_persona=involucrado.id_futbolista INNER JOIN movimientos ON involucrado.id_movimiento=movimientos.id_movimiento INNER JOIN mercado_transferencias ON mercado_transferencias.id_mercado=movimientos.id_mercado";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloMercadotransferencia();
                datos.setDni(rs.getInt("persona.dni_persona"));
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setAltura(rs.getInt("futbolista.altura_futbolista"));
                datos.setPosicion(rs.getString("futbolista.posición_futbolista"));
                datos.setAño(rs.getInt("mercado_transferencias.año_mercado"));
                datos.setTipomer(rs.getString("mercado_transferencias.tipo_mercado"));
                datos.setCosto(rs.getInt("movimientos.costo_movimiento"));
                datos.setTipomov(rs.getString("movimientos.tipo_movimiento"));
                datos.setCalidadmov(rs.getString("movimientos.calidad_movimiento"));
                
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
