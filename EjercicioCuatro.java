/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuatro;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     * al ingresar una edad y el nombre se debe mostrar el siguiente mensaje
     * "usted se llama: xxxx y tiene xxxxx años de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        String nombre;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        edad = miSc.nextInt();
        miSc.nextLine(); //soluciona problema de buffer 
        
        //no pide nombre 
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.nextLine();
        
        System.out.println("Usted se llama: "+nombre+" y tiene "+edad+" años de edad");
    }
    
}
