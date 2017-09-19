/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciotres;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     * se debe pedir el nombre y el apellido, luego mostrarlo en el siguiente mensaje 
     * "su nombre es: xxxx y su apellido es xxxxx"
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre,apellido; 
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = miSc.nextLine();
        
        System.out.println("Su nombre es: "+nombre+" y su apellido es: "+apellido);
    }
    
}