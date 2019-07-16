package Ventanas;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar=null;
   
    public Connection conexion(){
     try{
     Class.forName("com.mysql.jdbc.Driver");
     
     conectar=DriverManager.getConnection("jdbc:mysql://localhost/callcenter","root","");

     }
     catch(Exception e){
         System.out.println(e.getMessage()+"aqui esta el error");
     
     }
     
    return conectar;
     
    }
}