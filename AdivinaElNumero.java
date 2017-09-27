/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivinaelnumero;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random iRandom = new Random();
        Scanner scScanner = new Scanner(System.in);
        String szDatoAux;
        Integer iNumRandom,iNumeroUsuario, iDiferencia;
        
        iNumRandom = (int)(iRandom.nextDouble()*10+1);  //Genera random de 1 a 10
        //iNumRandom = iRandom.nextInt(10); //aparece el 0
        
        System.out.println("Ingrese numero: ");
        szDatoAux = scScanner.next();
        iNumeroUsuario = Integer.parseInt(szDatoAux);
        
        if(iNumeroUsuario == iNumRandom){
            
            System.out.println("Felicitaciones, GANASTE!");
            
        }else{
            
            System.out.println("Segui participando!");
            
            if(iNumeroUsuario < iNumRandom){
                System.out.println("Te falto!!");
            }else{
                System.out.println("Te pasaste!!");
            }
        
            
        iDiferencia=Math.abs(iNumRandom-iNumeroUsuario); //valor siempre positivo
        
            switch(iDiferencia){

                case 1:
                    System.out.println("Casi Casi");
                    break;

                case 2:
                    System.out.println("Cerca!");
                    break;

                case 3:
                    System.out.println("ni cerca!");
                    break;
                    
                case 4:
                    System.out.println("Bien lejos!");
                    break;

                 default: System.out.println("Sos horrible :v");                

            }//switch 
        }//else (perdio)
    } 
}

/**
 * Informar si: 
 * A) si le erro por un punto " ksi ksi"
 * B) si le erro por dos puntos "cerca"
 * C) si le erro por tres puntos "ni cerca"
 * D) si le erro por cuatro puntos "bien lejos"
 * E) para todos los demas "sos horrible en este juego"
 */