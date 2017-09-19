/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioseis;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     * se piden tres numeros y se informa el promedio
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int [3];
        int suma=0;
        float promedio;
        Scanner miSc = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Ingrese un numero: ");
            numeros[i] = miSc.nextInt();
            suma=suma+numeros[i];
        }
        
        promedio = suma/3;
        
        System.out.println("El promedio de los numeros ingresados es: "+promedio);
    }
    
    
}
