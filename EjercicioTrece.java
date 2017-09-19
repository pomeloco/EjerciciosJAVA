/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotrece;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     * se ingresa una edad y se informa si es mayor de edad 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer edad;
        String Dato;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese edad: ");
        Dato = miSc.next();
        edad = Integer.parseInt(Dato);
        
        if(edad>17){
            
            System.out.println("es mayor");
        }else{
            
            System.out.println("es menor");
        }
    } 
}
