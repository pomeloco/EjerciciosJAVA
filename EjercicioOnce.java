/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioonce;

import java.util.Scanner;

/**
 *
 * @author pomelo
 */
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     * Se pide el valor de la hora de trabajo de un empleado y la cantidad de horas trabajadas,
informar cuanto le corresponde de sueldo, restándole el 15% de aportes.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valorHoraTrabajo=0, cantidadHorasTrabajadas=0, sueldo=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la hora trabajada: ");
        valorHoraTrabajo = miSc.nextFloat();
        
        System.out.println("Ingrese cantidad de horas trabajadas: ");
        cantidadHorasTrabajadas = miSc.nextFloat();
        
        sueldo = valorHoraTrabajo*cantidadHorasTrabajadas;
        System.out.println("El sueldo correspondiente es de: "+sueldo);
        
    }
    
}
