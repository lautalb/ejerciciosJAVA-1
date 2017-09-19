/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //se ingresa una edad y se informa si es mayor de edad .
    //declaracion de variables
    String datoaux;
    Integer edad;
    Scanner Misc = new Scanner (System.in);
    
    System.out.println("ingrese la edad ");
    datoaux = Misc.next();
    edad = Integer.parseInt(datoaux);
        
    if (edad>17) 
    {System.out.println("es mayor ");
           
    }
    else if (edad<17)
     
    {System.out.println("es menor ");
    }
    }
}
