/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario CD
 */
public class planilla  extends conexion{

   
    Statement state;
    ResultSet result;
    double L1;
    double M1;
    double MM1;
    double J1;
    double V1;
    double S1;
    double L2;
     double M2;
      double MM2;
       double J2;
        double V2;
         double S2;
            String Dui;

    public planilla(double L1, double M1, double MM1, double J1, double V1, double S1, double L2, double M2, double MM2, double J2, double V2, double S2, String Dui) {
        this.L1 = L1;
        this.M1 = M1;
        this.MM1 = MM1;
        this.J1 = J1;
        this.V1 = V1;
        this.S1 = S1;
        this.L2 = L2;
        this.M2 = M2;
        this.MM2 = MM2;
        this.J2 = J2;
        this.V2 = V2;
        this.S2 = S2;
        this.Dui = Dui;
    }

    public double getL1() {
        return L1;
    }

    public void setL1(double L1) {
        this.L1 = L1;
    }

    public double getM1() {
        return M1;
    }

    public void setM1(double M1) {
        this.M1 = M1;
    }

    public double getMM1() {
        return MM1;
    }

    public void setMM1(double MM1) {
        this.MM1 = MM1;
    }

    public double getJ1() {
        return J1;
    }

    public void setJ1(double J1) {
        this.J1 = J1;
    }

    public double getV1() {
        return V1;
    }

    public void setV1(double V1) {
        this.V1 = V1;
    }

    public double getS1() {
        return S1;
    }

    public void setS1(double S1) {
        this.S1 = S1;
    }

    public double getL2() {
        return L2;
    }

    public void setL2(double L2) {
        this.L2 = L2;
    }

    public double getM2() {
        return M2;
    }

    public void setM2(double M2) {
        this.M2 = M2;
    }

    public double getMM2() {
        return MM2;
    }

    public void setMM2(double MM2) {
        this.MM2 = MM2;
    }

    public double getJ2() {
        return J2;
    }

    public void setJ2(double J2) {
        this.J2 = J2;
    }

    public double getV2() {
        return V2;
    }

    public void setV2(double V2) {
        this.V2 = V2;
    }

    public double getS2() {
        return S2;
    }

    public void setS2(double S2) {
        this.S2 = S2;
    }

    public String getDui() {
        return Dui;
    }

    public void setDui(String Dui) {
        this.Dui = Dui;
    }


 

   

   


     public boolean insertarDatos(){
        try{
            String myQuery="Insert into tb_planilla values('"+L1+"','"+M1+"','"+MM1+"' ,'"+J1+"','"+V1+"','"+S1+"','"+L2+"','"+M2+"','"+MM2+"' ,'"+J2+"','"+V2+"','"+S2+"','"+Dui+"');";
            
            int estado=0;
            state=obtenerConexion().createStatement();
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
     public ArrayList<planilla> consultarRegistros(){
        ArrayList<planilla> planilla = new ArrayList();
        try{
            String miQuery="select * from tb_planilla;";
            state =obtenerConexion().createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                planilla.add(new planilla(result.getDouble("L1"), result.getDouble("M1"), result.getDouble("MM1"), result.getDouble("J1"), result.getDouble("V1"), result.getDouble("S1"), result.getDouble("L2"), result.getDouble("M2"), result.getDouble("MM2"), result.getDouble("J2"), result.getDouble("V2"), result.getDouble("S2"), result.getString("Dui")));
            }
        }catch (SQLException ex){
            Logger.getLogger(planilla.class.getName()).log(Level.SEVERE, null, ex);
        }
            return planilla;
    }
     
     
      public boolean actualizar(double L1,double M1, double MM1,double J1,double V1,double S1,double L2,double M2,double MM2,double J2,double V2,double S2,String Dui){
        
        try{
            int estado = 0;
             String miQuery = "update tb_planilla set L1 = " + "'" + L1 + "', M1 = '" + M1 + "', MM1 = '" + MM1 + "', J1 = '" + J1 + "', V1 = '" + V1 + "', S1 = '" + S1 + "', L2 = '" + L2 + "', M2 = '" + M2+ "', MM2 = '" + MM2 + "', J2 = '" + J2 + "', V2 = '" + V2 + "', S2 = '" + S2 + "'where Dui = '" + Dui + "'" ;
            state = obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if(estado == 1){
                return true;
            }
                
        }catch (SQLException ex){
           // Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            Logger.getLogger(planilla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
      
      public boolean eliminarDatos(){
        try{
            String miQuery = "delete from tb_planilla where Dui='" + Dui +"'";
            int estado = 0;
            state= obtenerConexion().createStatement();
            estado = state.executeUpdate(miQuery);
            if (estado == 1 ){
                return true;
            }
                    
        }catch (SQLException ex ){
            Logger.getLogger(planilla.class.getName()).log(Level.SEVERE,null, ex);
        }
        return false;
    }
}
