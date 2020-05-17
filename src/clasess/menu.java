/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasess;

import java.util.Scanner;

/**
 *
 * @author Palacios
 */
public class menu {
    public static void main(String[] args) {
        desplegarMenu();
    }
    
     public static void desplegarMenu()  {
        Scanner opcionSeleccionada = new Scanner(System.in); 
        String opcionMenu;
        //menu que se va a desplegar
        System.out.println("***************************************");
        System.out.println("|   Integrantes SIS21A                  ");
        System.out.println("****************************************");
        System.out.println("| Opciones: |");
        System.out.println("|           1. Guillermo                ");
        System.out.println("|           2. Flor                     ");
        System.out.println("|           3. Ticas                    ");
        System.out.println("            4. Salir                    ");       
        System.out.println("***************************************");
        System.out.println("Seleccione opción: ");
        opcionMenu = opcionSeleccionada.next();
   
      switch(opcionMenu){
          case "1": 
              guillermo_palaciosClass guiller = new guillermo_palaciosClass();
              break;
          case "2":
            // flor_diaz flor = new flor_diaz();
              break;
          case "3":
             // nelson_ticasClass ticas = new nelson_ticasClass();
              break;
          
          case "4":
              System.exit(0);
              break;
          default:
           System.out.println("Seleccion no valida");
           break;
      }
    
    }
}
