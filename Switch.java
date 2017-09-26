/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String szPalabra, szVacaciones, szDato;
        Integer iEdad;
        Scanner scScanner = new Scanner(System.in);
        
        System.out.println("vas de vacaciones? : ");
        szVacaciones=scScanner.nextLine();
        
        System.out.println("ingrese edad: ");
        szDato = scScanner.nextLine();
        iEdad = Integer.parseInt(szDato);
        
        if(szVacaciones.equals("si")){
            
            System.out.println("Ingrese mes: ");
            szPalabra=scScanner.nextLine();
            
            switch(szPalabra){

                case "enero":               
                case "febrero":
                   System.out.println("Lindo Veranito");
                   break;

                case "julio":
                    System.out.println("Lindo invierno!");
                    
                    if(iEdad>=80){
                        System.out.println("vacunate contra la gripe!");
                    }
                    break;

                default: 
                        System.out.println("no es verano");
            }//fin switch
        }//fin if
    
    }
}
