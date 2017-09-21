/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14.pkgif;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio14If {
    //Se pide el sexo y el nombre, si es “f” de femenino, 
    //muestra el mensaje” feliz dia XXXXX”, donde XXXX es el nombre.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //declaracion de varibles
    String nombre;
    String sexo;
    Scanner Misc = new Scanner(System.in);    
    
    //se muestra el mensaje
        System.out.println( " Ingrese el sexo ");
        sexo = Misc.next();
        
        //se muestra el siguiente mensaje
        System.out.println( " Ingrese el nombre ");
        nombre = Misc.next();
        
        //se realiza el condicional if
        if (sexo.equals("f"))
            System.out.println( " Feliz dia : " +nombre);
    
    }
    
}
