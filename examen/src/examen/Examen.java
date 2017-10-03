/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer nOpcion;
        String szDato;
        Scanner scScanner = new Scanner(System.in);
        
        System.out.println("Ingrese nº de ejercicio: ");
        szDato = scScanner.next();
        nOpcion = Integer.parseInt(szDato);
       
        switch(nOpcion){
            
            case 1:
                guiaInicial.HacerEjercicio1();
                break;
            
            case 2:
                guiaInicial.HacerEjercicio2();
                break;
                
            case 3:
                guiaInicial.HacerEjercicio3();
                break;
                    
            case 5:
                guiaInicial.HacerEjercicio5();
                break;
                    
            case 7:
                guiaInicial.HacerEjercicio7();
                break;
                    
            case 9:
                guiaInicial.HacerEjercicio9();
                break;
                    
            case 11:
                guiaInicial.HacerEjercicio11();
                break;
                
            case 14:
                    GuiaIf.HacerEjercicio14();
                    break;
                    
            case 16:
                    GuiaIf.HacerEjercicio16();
                    break;
                    
            case 18:
                    GuiaIf.HacerEjercio18();
                    break;
                    
            case 20:
                    GuiaIf.HacerEjercicio20();
                    break;
                    
            case 22:
                    GuiaIf.HacerEjercicio22();
                    break;
                        
            case 13:
                GuiaIf.HacerEjercicio13();
                break;
        }

    }
    
    
    
}



/*public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("esto funciona de maravilla");
}*/

