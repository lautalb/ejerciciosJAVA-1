/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17.pkgif;
//Se pide una edad y se informa si es niño adolescente o mayor de edad

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio17If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  //declaracion de variables
  
  String dato;
  int edad;
  Scanner Misc = new Scanner(System.in);
  
  //se muestra el mensaje
  System.out.println(" Ingrese la edad ");
  //se parsea el mensaje
  dato = Misc.next();
  edad = Integer.parseInt(dato);
  
  //uso del condicional IF
  if ((edad>14) && (edad<18))
  { System.out.println("es niño adolescente");
  } else {
      if (edad>=18)
      System.out.println("Es mayor de edad");
  }
  }
  
    }
   
