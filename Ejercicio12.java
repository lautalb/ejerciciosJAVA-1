/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio122;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String aux;
    Double importe;
    Double impuestos;
    Double total;
        Scanner Misc = new Scanner (System.in);
        
        System.out.println("Ingrese el importe del producto importado");
        aux = Misc.next();
        importe = Double.parseDouble(aux);
        
        impuestos = importe*35/100;
        total=impuestos + importe;
        System.out.println("el 35% del importe es : "+total);
    
    }
    
}
