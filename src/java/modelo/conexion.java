/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Mario CD
 */
public class conexion {
      public Connection obtenerConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //return  DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "SistemaBibliotecario", "root", "");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_platilla?zeroDateTimeBehavior=convertToNull","root","");
        }catch (Exception ex){
            System.out.println("No se pudo establecer la conexión... " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }
}
