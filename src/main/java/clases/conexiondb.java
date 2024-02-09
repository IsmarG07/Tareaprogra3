/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author anaca
 */
public class conexiondb {
    
    Connection conectar = null;
    
    String usuario = "postgres";
    String contraseña = "Muni123$";
    String db = "Seguridad";
    String ip = "localhost";
    String puerto = "5432";
    
    String cadena = "jdbc:postgresql://"+ip+":"+puerto+"/"+db;
    
    public Connection establecerconexion(){
        try {
            Class.forName("org.posrtgresql.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, Error: " + e.toString());
        }
        return conectar;
    }
    
}
