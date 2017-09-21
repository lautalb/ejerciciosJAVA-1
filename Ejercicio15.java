/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio13 {
//15_Se ingresa un importe si supera los 100 pesos , se le suma
     //un 23% , si es menor a 100 pesos , se le descuenta el 50%.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String dato;
    Double importe;
    Double descuento;
    Double total;
    Scanner Misc = new Scanner (System.in);
    
        System.out.println("ingrese el importe");
        dato = Misc.next();
        importe = Double.parseDouble(dato);
        
        if (importe>100)
        { descuento=importe*23/100;
        total=importe+descuento;
        //se muestra el mensaje
        System.out.println("El descuento es : "+descuento+" El total : " + total + " ");

        }
        if (importe<100)
        { descuento=importe*50/100;
        total = importe-descuento;
        //se muestra el mensaje
        System.out.println("El descuento es : "+descuento+" El total : "+total+"");

        }
                    
    }
    
}
