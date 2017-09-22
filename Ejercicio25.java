/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg25;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio25 {
//Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1 metro
//cuadrado, se pide el alto y ancho y se informa la cantidad de cada material 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //declaracion de variables
     
     String dato;
     Double alto;
     Double ancho;
     Double cantidad;
     Double total;
     Double cal;
     Double cemento;
    Scanner Misc = new Scanner (System.in);
    
    //Mostramos el mensaje
        System.out.println(" Ingrese el alto del terreno :  ");  
        dato = Misc.next();
        alto = Double.parseDouble(dato);
        
        System.out.println(" Ingrese el ancho del terreno : ");
        dato = Misc.next();
        ancho = Double.parseDouble(dato);
        
        total= alto*ancho;
        
        cal = total*2;
        cemento=total*3;
        System.out.println(" Necesito : " +cal+ " y  " +cemento+ " para una pared de un metro " );
        
        
        
     
    }
    
}
