/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio16 {
//16_Se ingresa el importe de un pasaje de avion y el mes de viaje,
// si es enero, se le descuenta un 10% por temporada baja.
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    String dato;
    Double importe;
    Integer mes;
    Double descuento;
    Double total;
    Scanner Misc = new Scanner (System.in);
    //se muestra el mensaje
    System.out.println("Ingrese el importe del pasaje de avion");
    //se guardan las variab les y se parsea.
    dato = Misc.next();
    importe = Double.parseDouble(dato);
    //se muestra el mensaje
    System.out.println("Ingrese el mes de viaje : 1_enero,2_febrero,etc..");
    //se guardan las variables y se persea
    dato = Misc.next();
    mes = Integer.parseInt(dato);
    
    //se hace la condicion
    if (mes==1)
    { descuento=importe*10/100;
    total=descuento-importe;
      
    System.out.println("El descuento del mes de enero es : " +total );
        
       
        
}
            
      
    }
    
}
