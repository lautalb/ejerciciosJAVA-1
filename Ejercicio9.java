/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author alumno
 */
import java.util.Scanner;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String datoaux;
   Integer ganadores;
   double monto;
   double total;
   Scanner Misc = new Scanner (System.in);
   
   //se guarda el mensaje y se convierte el dato
   System.out.println("ingrese la cantidad de ganadores ");
   datoaux = Misc.next();
   ganadores= Integer.parseInt(datoaux);
   
   System.out.println(" ingrese el monto ganado ");
   datoaux = Misc.next();
   monto = Double.parseDouble(datoaux);
   
   total =monto/ganadores;
        System.out.println("el monto total es "+total);
        
    
    
    }
    
}
