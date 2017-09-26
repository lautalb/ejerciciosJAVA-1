/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.sowitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IfSowitch {
//switch en if 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //declaracion de variables y asignar scanner
 
 Scanner Misc = new Scanner (System.in);
 
 String dato;
 Integer edad;
 String mesdelaño;
 String vacaciones;
 
 System.out.println(" Ingrese mes del año ");
 mesdelaño = Misc.next();
 
 System.out.println(" Vas de vaciones ");
 vacaciones = Misc.next();
 
 if (vacaciones.equals("si")) 
 {
 
 switch (mesdelaño)
     
     { case "enero" :
       case "febrero":
             //mostramos el mensaje
             System.out.println(" Lindo veranito ");
             break;
       case "julio" :
             System.out.println(" Lindo invierno ");
             System.out.println(" Ingrese la edad ");
             dato = Misc.next();
             edad = Integer.parseInt(dato);
    
             if (edad>80)
             System.out.println(" vacunate contra la gripe ");
             break;
       default: 
           System.out.println(" no es verano ");
           break;
 }
 }
}

}
    

    

