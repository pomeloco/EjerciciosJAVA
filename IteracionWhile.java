/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteracionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class IteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scScanner = new Scanner(System.in);
        String szPassword;
        Integer nContador=0;
        
        System.out.println("Ingrese clave: ");
        szPassword = scScanner.next();
        
        
        while(!szPassword.equals("1234")){
            
            System.out.println("Reingrese: ");
            szPassword = scScanner.next();
            nContador++;
            
        }//while password
        
        System.out.println("Bienvenido");
        
        while(nContador <10){
            System.out.println(nContador+"... contando");
            nContador++;
        }
        System.out.println("termine");
    }
    
}
