/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16.pkgif;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio16If {
   //Se debe ingresar una edad  e  informar si es mayor de edad o no.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){       
    //declaracion de variables
    
    String dato;
    int edad;
    Scanner Misc = new Scanner (System.in);
    
    //se muestra el mensaje
        System.out.println(" Ingrese una edad ");
        dato = Misc.next();
        edad = Integer.parseInt(dato);
        
        //uso del condicional IF
        
        if (edad<18)
        {System.out.println(" es menor de edad " );
        } else
            if (edad>=18)
                System.out.println(" es mayor de edad ");
                }
        }
        
            
    
   

