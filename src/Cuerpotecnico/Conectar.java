package Cuerpotecnico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
    Autor: 12matienzo
    Descripción: Clase para gestionar la conexión.
 */
public class Conectar {
    private static final String URL = "jdbc:mysql://localhost:3306/camitre";
    private static final String USER = "root";
    private static final String CLAVE = "";
    
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error :" + e.getMessage());
        }
        return con;
    }
}
