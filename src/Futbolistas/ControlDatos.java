package Futbolistas;

import Instalaciones.ModeloInstalacion;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlDatos {
    private Conectar conectar;
    private ModeloFutbolista modelo;
    private Connection con;
    
    public ControlDatos(){
        conectar = new Conectar();
        modelo = new ModeloFutbolista();
    }
    
        public ArrayList<ModeloFutbolista> llenarDatos(){
        ModeloFutbolista datos;
        ResultSet rs;
        PreparedStatement ps;
        ArrayList<ModeloFutbolista> lista = new ArrayList<>();
        String sql = "select persona.nombre_persona,persona.apellido_persona,futbolista.posición_futbolista,futbolista.altura_futbolista,futbolista.piernahabil_futbolista,futbolista.sueldo_futbolista,futbolista.inicio_contrato,futbolista.fin_contrato FROM futbolista INNER JOIN persona ON futbolista.id_persona=persona.id_persona";
        try{
            con = conectar.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                datos = new ModeloFutbolista();
                datos.setNombre(rs.getString("persona.nombre_persona")); 
                datos.setApellido(rs.getString("persona.apellido_persona")); 
                datos.setPosicion(rs.getString("futbolista.posición_futbolista")); 
                datos.setAltura(rs.getInt("futbolista.altura_futbolista")); 
                datos.setPiernahabil_futbolista(rs.getString("futbolista.piernahabil_futbolista")); 
                datos.setSueldo(rs.getFloat("futbolista.sueldo_futbolista")); 
                datos.setInicio_contrato(rs.getDate("futbolista.inicio_contrato").toString()); 
                datos.setFin_contrato(rs.getDate("futbolista.fin_contrato").toString()); 
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
