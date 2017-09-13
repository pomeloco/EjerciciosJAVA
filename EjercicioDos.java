/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * se debe pedir un nombre y se debe mostrar el mismo nombre
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        Scanner miSc = new Scanner(System.in); //Scanner (scanf)
        
        
        System.out.println("Ingresar un nombre: "); //pido un nombre 
        nombre=miSc.nextLine(); //Scaneo nombre
        System.out.println("el nombre ingresado es: "+nombre); // muestro el nombre 
        
    }
    
}
