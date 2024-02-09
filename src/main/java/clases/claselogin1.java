/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author anaca
 */
public class claselogin1 extends claslogin{
    controlador.controlador1 objConecta;
    
    public claselogin1(){
        objConecta = new controlador.controlador1();
    }
    
    public boolean valide(){
        String SQL = "select * from Administrador.Login where Nombre='"+super.getNombre()+"' and password='"+super.getContra()+"' ";
        
       
        if(objConecta.validar(SQL) == false){
            return false;
        } else{
           return true; 
        }
        
    }
    
}






