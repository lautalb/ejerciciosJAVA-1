/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     * agregar : informar si : 
     * a: si le erro por 1 punto mensaje "Casi casi"
     * b:si le erro por 2 puntos mensaje "Cerca"
     * c:si le erro por 3 puntos mensaje "ni cerca"
     * d: si le erro por 4 puntos "bien lejos"
     * f:para todos los demas "sos horrible en este juego ".
     * 
     */
    public static void main(String[] args) {
        
                
        //para importar el generador de numeros random se utiliza java.util.Random
        String datoAux;
        Integer numero;
        Scanner miscan= new Scanner(System.in);
        Integer numeroSecreto;
        Integer resultado;
        //para generar el numero random  el +1 para que empieze del 1 y el *10 para 10 numeros
        numeroSecreto = (int) (Math.random()* 10)+1; 
        
        
        System.out.println("el numero random es : "+numeroSecreto);
        System.out.println("Adivina el numero entre el 1 y el 10");
        datoAux = miscan.next();
        numero = Integer.parseInt(datoAux);
        
        resultado=numeroSecreto-numero;
        if (resultado<0)
        {
            resultado=numero-numeroSecreto;
        }
        
        switch (resultado)
        {
            case 1:
                System.out.println("Casi Casi");
                break;
            
            case 2:
                System.out.println("Cerca");
                break;
                
            case 3:
                System.out.println("Ni cerca");
                break;
            
            case 4:
                System.out.println("Bien lejos");
                break;
            
            default:
                System.out.println("Sos horrible en este juego");
                break;
        
        
        
        }
        
        
        
        
        
        
        
//        if (numeroSecreto==numero)
//        {
//            System.out.println("Acertaste");
//        }else
//        {
//        
//            System.out.println("Numero Incorrecto.");
//            if(numero>numeroSecreto)
//            {
//                System.out.println("te pasaste");
//            }else
//            {
//                System.out.println("te falto");
//            }
//        }
           
        
        /***la otra forma es usando
         * java.security.SecureRandom
         * Random aleatorio = new Random(System.currentTimeMillis());
        // Producir nuevo int aleatorio entre 0 y 99
            int intAletorio = aleatorio.nextInt(100);
        // Más código
         // Refrescar datos aleatorios 
            aleatorio.setSeed(System.currentTimeMillis());
         * 
         */
         
        
    }
    
}