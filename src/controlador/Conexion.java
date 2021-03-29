
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class Conexion {
    
    private static Connection conexion = null;
    private static final String URL = "jdbc:mysql://192.168.255.128:3306/db_test?useSSL=false";
    private final String us = "root";
    private final String pass = "1221";
    
    private PreparedStatement pst = null;
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    
    public Conexion(){

        try {
            Class.forName(DRIVER);

            conexion = DriverManager.getConnection(URL, us, pass);

            //JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        
    }
    
    public boolean consultaUsuario (String us,String pass){
        
        
        String consulta = "SELECT * FROM usuario WHERE nombre = ? AND pass = ?;";
       
        
        try {
            
            pst = conexion.prepareStatement(consulta);
            pst.setString(1, us);
            pst.setString(2, pass);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()) return true;
            else return false;
            
            
        } catch (SQLException ex) {
            
            return false;
        }  
        
    }
    
}
