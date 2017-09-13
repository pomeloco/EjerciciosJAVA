/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * se necesita pedir dos numeros y sumarlos, mostrar el resultado
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
int numeroUno, numeroDos,Resultado;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numeroUno = miSc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = miSc.nextInt();

        Resultado=numeroUno+numeroDos;
        System.out.println("El Resultado de la suma es: " +Resultado);
    }
    
}
