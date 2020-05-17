
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class personal extends conexion{
    
  String Dui;
  String Nombres ;
  String Apellidos;
  String Telefono;
  String Direccion ;
  String email;
  String tipo;
     
     
     Connection cnn;
    Statement state;
    ResultSet result;
     

    public personal(String Dui, String Nombres, String Apellidos, String Telefono, String Direccion, String email, String tipo) {
        this.Dui = Dui;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.email = email;
        this.tipo = tipo;
    }

    private personal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

      
    public boolean insertarDatos(){
        try{
            String myQuery="Insert into tb_persona values('"+Dui+"','"+Nombres+"','"+Apellidos+"','"+Telefono+"','"+Direccion+"','"+email+"','"+tipo+"');";
            
            int estado=0;
            state=cnn.createStatement();
            estado=state.executeUpdate(myQuery);
            if(estado==1){
                return true;
            }
        }catch(SQLException ex){
            //Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error. YA EXISTE UN REGISTROCON EL"+"dui: "+this.Dui);
        }
        return false;
    }
    
    
    
     public ArrayList<personal> consultarRegistros(){
        ArrayList<personal> person = new ArrayList();
        try{
            String miQuery="select * from tb_persona;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                person.add(new personal());
            }
        }catch (SQLException ex){
            Logger.getLogger(personal.class.getName()).log(Level.SEVERE, null, ex);
        }
            return person;
   
}
     
     
      public boolean actualizar(String duip, String nombrep, String apellidop){
        
        try{
            int estado = 0;
             String miQuery = "update tb_persona set nombre_persona = " + "'" + Nombres + "', apellidos_persona = '" + Apellidos + "'where dui_persona = '" + Dui + "'" ;
            state = cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
                
        }catch (SQLException ex){
           // Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(personal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
      
       public boolean eliminarDatos(){
        try{
            String miQuery = "delete from tb_persona where dui_persona='" + Dui +"'";
            int estado = 0;
            state= cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1 ){
                return true;
            }
                    
        }catch (SQLException ex ){
            Logger.getLogger(personal.class.getName()).log(Level.SEVERE,null, ex);
        }
        return false;
    }
    
      public boolean modificarDatos(){
       try{
           String miQuery ="update tb_persona set nombre_persona= "+ "'" + Nombres + "',apellidos_persona='" + Apellidos + 
                   "' where dui_persona='" + Dui + "'";
           int estado = 0;
            state= cnn.createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1 ){
                return true;
            }
                    
        }catch (SQLException ex ){
            Logger.getLogger(personal.class.getName()).log(Level.SEVERE,null, ex);
        }
        return false;
    }
      
     
     }
