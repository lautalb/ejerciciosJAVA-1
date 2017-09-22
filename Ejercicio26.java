/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg26;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio26 {
//de pide una temperatura y se pide si se quiere pasar Celsius o Fahrenhei
//hacer la cuenta y mostrar el resultado.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Declaracion de variables
 
 String dato;
 Double temperatura;
 Double celsius;
 Double farenheit;
 Scanner Misca = new Scanner (System.in);
 
 //mostramos el mensaje
        System.out.println(" Ingrese la temperatura ");
        dato = Misca.next();
        temperatura = Double.parseDouble(dato);
        
        System.out.println(" ¿Se quiere pasar a Clesius o Farenheit? ");
        dato = Misca.next();
        
        if (dato.equals("Celsius"));
        {
            celsius=(temperatura-32)*5/9;
            System.out.println(" Serian :  "+celsius+ "°C" );
        } if (dato.equals("Farenheit"));
        
        { farenheit = (1.8*temperatura)+32;
            System.out.println(" Serian : "+farenheit +"°F");
            
        
        }    
    }
    
}
