/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosiete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSiete {

    /**
     * @param args the command line arguments
     * se pide la base de un cuadrado y se informa el perimetro
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base=0,perimetro=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del cuadrado: ");
        base = miSc.nextInt();
        
        perimetro = 4*base;
        System.out.println("El perimetro es de: "+perimetro);
    }
    
}
