/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioocho;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioOcho {

    /**
     * @param args the command line arguments
     * se pide el largo y el ancho de un terreno y se informa la superficie del mismo
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float largo=0, ancho=0, superficie=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese largo: ");
        largo = miSc.nextFloat();
        
        System.out.println("Ingrese ancho: ");
        ancho = miSc.nextFloat();
        
        superficie=largo*ancho;
        System.out.println("La superficie es: "+superficie);
    }
    
}
