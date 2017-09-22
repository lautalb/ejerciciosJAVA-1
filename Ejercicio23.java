/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg23;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio23 {
    // Debemos pedir el ancho y el largo de un terreno e informar 
    //metro de alambre necesitamos para dar tres (3) vueltas de alambre.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declaracion de variables
     
     String dato;
     Double ancho;
     Double largo;
     Double total;
     Scanner Misc = new Scanner (System.in);
     
     //se muestra el mensaje
        System.out.println(" Ingrese el ancho del terreno ");
        dato = Misc.next();
        ancho = Double.parseDouble(dato);
        
        //Se muestra el siguiente mensaje
        System.out.println("Ingrese el largo del terreno");
        dato = Misc.next();
        largo = Double.parseDouble(dato);
        
        total = (ancho*largo)*3;
        //mostramos el total
        System.out.println(" Necesitamos  "+total+ " de alambre ");        
        
    }
    
}
