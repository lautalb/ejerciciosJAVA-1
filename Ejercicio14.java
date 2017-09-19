/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio14 {
//se pide ingresar una clave, si es "utn750"  se mostrara el mensaje Bienvenido,
//de los contrario el mensaje clave "erronea".  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
     //15_Se ingresa un importe si supera los 100 pesos , se le suma
     //un 23% , si es menor a 100 pesos , se le descuenta el 50%.
     
     //16_Se ingresa el importe de un pasaje de avion y el mes de viaje,
     // si es enero, se le descuenta un 10% por temporada baja.
     
   
    String clave;
    Scanner  Misca = new Scanner (System.in);
    
    System.out.println(" Ingresar una clave ");
    clave = Misca.next();
    
    
    
    if (clave.equals("UTN750"))
        
    { System.out.println(" Bienvenido ");
    }
    else
        
    {System.out.println(" erronea ");   
    }
    }
    
}
