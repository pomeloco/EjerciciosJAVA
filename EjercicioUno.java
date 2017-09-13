/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciouno;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioUno {

    /**
     * @param args the command line arguments
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

    private static int miSc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
