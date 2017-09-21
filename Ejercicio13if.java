/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13if;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio13if {
    //13- Se ingresa un color y una localidad, si es avellaneda o Lanús y 
    //el color es rojo, mostrar el mensaje “sos de independiente
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //declaracion de variables
    String localidad;
    String color;
    boolean verdadero;
    Scanner Misc = new Scanner (System.in);
    //se ingresa el mensaje 
    System.out.println(" Ingrese la localidad :  ");
    //se guardan las variables y se persea
    localidad = Misc.next();   
    //se muestra el siguiente mensaje
    System.out.println(" Ingrese el color : ");
    //se guardan las variables y se persea
    color = Misc.next();
    verdadero = localidad.equals("Avellaneda");
    
    
    //Uso del condicional
    if (localidad.equals("lanus") && color.equals("rojo"));
    { System.out.println(" sos de Independiente ");
       
    }
    }
}
