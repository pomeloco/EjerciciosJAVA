/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.management.Query;
/**
 *
 * @author alumno
 */
public class Conexion {
    
    String sJDBC_Driver = "com.mysql.jdbc.Driver";
    String sJDBC_User = "root";
    String sJDBC_Pass = "";
    String sJDBC_URL = "jdbc:mysql://localhost:3306/mydb"; //direccion base de datos
    //private String Query;
    
    public Conexion(){
            
        try {
            
            Class.forName(sJDBC_Driver);
            Connection CNN = DriverManager.getConnection(sJDBC_URL, sJDBC_User, sJDBC_Pass); //establecer conexion
            PreparedStatement PS = CNN.prepareStatement("select * from cine"); //consulta
            ResultSet rs =  PS.executeQuery();
             
            while(rs.next()){
                
               
                System.out.println(""+rs.getInt(1)); //columna a mostrar
            }
            rs.close();
            CNN.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
            
    }
}
