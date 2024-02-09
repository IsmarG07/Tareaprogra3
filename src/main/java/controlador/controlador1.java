/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anaca
 */
public class controlador1 {
    
    java.sql.Connection con;
    java.sql.Statement st;
    java.sql.ResultSet res;
    
    public controlador1(){
        
        try {
            
            try {
                Class.forName("org.postgresql.Driver");
                System.out.println("Driver cargado");
                
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al cargar el Driver");
            }
            
          con = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "Muni123$");  
        } catch (SQLException ex) {
            System.out.println("No se pudo conectar con con el motor");
        }
        
        
    }
    
    public void insertar(String sql){
        try {
            st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            System.out.println("Error insertando" +ex.toString());
             
        }
    }
    
    
    public java.sql.ResultSet consulta(String sql){
        try {
            st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error consultando: ");
            return null;
        }
         
        }
    
    public String eliminar (String sql){
        try {
            st = con.createStatement();
            int resutado = st.executeUpdate(sql);
            if(resutado == 1)
                return "eliminado";
            else
                return "Error";
        } catch (SQLException ex) {
            System.out.println("Error insertado"+ex.toString());
            return "Error";
        }
    }
    
    public String modifica (String sql){
        try {
            st = con.createStatement();
            int resutado = st.executeUpdate(sql);
            if(resutado == 1)
                return "modifco";
            else 
                return "error";
        } catch (SQLException ex) {
            System.out.println("Error insertado"+ex.toString());
            return "error";
        }
    }
    public boolean validar(String sql){
        java.sql.ResultSet hoja_resultado = null;
        try {
            st = con.createStatement();
            hoja_resultado = st.executeQuery(sql);
            if(hoja_resultado.next()){
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error consultando"+ex.toString());
            return false;
        }
        
    }
    
    
    
        
        
    
}
