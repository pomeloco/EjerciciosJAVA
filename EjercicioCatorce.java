/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave, si es "UTN750" se mostrara el mensaje "bienvenido", de lo contrario el mensaje "clave erronea" 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Clave;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese contraseña: ");
        Clave = miSc.next();

        //System.out.println(""+Clave);
        if (Clave.equals("UTN750")) { //equals compara cadenas 
            
            System.out.println("Bienvenido!");
        }else{
            
            System.out.println("contraseña erronea");
        }
    }
    
}
