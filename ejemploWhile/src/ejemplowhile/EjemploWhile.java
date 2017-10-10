/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
       // EjemploWhile.SalidaPorLogica();
       EjemploWhile.PedirNumeros();
    }
    

    /**
     * pide los numeros informa el promedio 
     */
    public static void PromedioConIf(){

        Scanner scScanner = new Scanner(System.in);
        Integer nNumeroUno, nNumeroDos;
        float fPromedio;
        String szDato;
        
        System.out.println("Ingrese numero uno: ");
        szDato = scScanner.next();
        nNumeroUno = Integer.parseUnsignedInt(szDato);
        
        System.out.println("Ingrese numero dos: ");
        szDato = scScanner.next();
        nNumeroDos = Integer.parseUnsignedInt(szDato);
        
        fPromedio = (nNumeroUno+nNumeroDos)/2;
        
        System.out.println("El promedio es: "+fPromedio);
    } // fin promedioconif
   
    
    /**
     * pide los numeros informa el promedio 
     */
    public static void PromedioConWhile() {
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero,nCount=0,nSuma=0;
        float fPromedio;
        String szDato;
        
        while(nCount<3){
         
            nCount++;
            System.out.println("Ingrese numero "+(nCount)+": ");
            szDato = scScanner.next();
            nNumero = Integer.parseUnsignedInt(szDato);
            nSuma += nNumero;
            
        }
        
        fPromedio=nSuma/nCount;
                
        System.out.println("El promedio es: "+fPromedio);
        
    }//fin promedioconwhile

    /**
     * cuando no sabemos la cantidad de iteraciones 
    */
    public static void IteracionSinCantidad() {
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero,nCount=0,nSuma=0;
        float fPromedio;
        String szDato, szContinuar="si";
        
        while(!szContinuar.equalsIgnoreCase("no")){
            
            System.out.println("hola,Desea continuar? ");
            szContinuar = scScanner.next();
        }
    }
    
    public static void SalidaPorLogica() {
        
        Scanner scScanner = new Scanner(System.in);
        String szContinuar="si";
        
        while(true){

            System.out.println("hola,Desea continuar? ");
            szContinuar = scScanner.next();
            
            if(szContinuar.equalsIgnoreCase("no")){
            break;
            }
        }
        
    }
    
    public static void PedirNumeros() {
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero,nContador=0,nSuma=0;
        String szAuxString;
        
        while(nContador < 10 && nSuma<50){
            
            nContador++;
            
            System.out.println("ingrese numero: ");
            szAuxString = scScanner.next();
            nNumero = Integer.parseInt(szAuxString);
            
            nSuma=nSuma+nNumero;
        }
        System.out.println("la suma es: "+ nSuma);
        System.out.println("el contador es: "+nContador);
    }
}