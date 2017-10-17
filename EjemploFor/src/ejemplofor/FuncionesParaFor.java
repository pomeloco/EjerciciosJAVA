/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FuncionesParaFor {
    
    public static void saludar() {
        
        System.out.println("hola mundo");
        
    }
    
    public static void mostrarNumerosCrecientes() {
        
        for (int i = 0; i < 100; i++) {
            
            System.out.println("el numero es: "+i);
        }
    }
    
    public static void mostrarNumerosDecrecientes(){
        
        for (int i = 100; i > 0; i--) {
            
            System.out.println("el numero es: "+i);
        }
    }
    
    public static void mostrarNumerosPares(){
        
        for (int i = 1; i < 100; i++) {
            
            if(i%2==0){
                System.out.println("numero par: "+i);
            }
        }
        
    }
    
    public static void mostrarNumerosDivisiblesPorSeis(){
        
        for (int i = 0; i < 100; i++) {
            
            if(i%6==0){
                System.out.println("numero divisible: "+i);
            }
        }
    }
    
    public static void mostrarTablaDeMultiplicar(){
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero,nResultado;
        String szDato;
        
        System.out.println("Ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);
        
        while(nNumero < 0 || nNumero >20){
            
        System.out.println("Ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);    
            
        }
              
        
        for (int i = 1; i <= 10; i++) {
            
            nResultado = nNumero*i;
            System.out.println(nNumero+"x"+i+"= "+nResultado);
        }
    }
    
    public static void mostrarTablaDeDividir(){
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero;
        Float nResultado;
        String szDato;
        
        System.out.println("Ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);
        
        while(nNumero < 0){
            
        System.out.println("Ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);    
            
        }
              
        
        for (int i = 1; i <= 10; i++) {
            
            nResultado = (float)nNumero/i;
            System.out.println(nNumero+"/"+i+"= "+nResultado);
        }
    }
    
     public static void NumeroPrimo() {
        
        Scanner scScanner = new Scanner(System.in);
        Integer nNumero, nContador=2;
        Boolean bFlag=true;
        String szDato;
        
         System.out.println("ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);
        
        while(nNumero < 0 || nNumero >100){
            
        System.out.println("Ingrese numero: ");
        szDato =  scScanner.next();
        nNumero = Integer.parseInt(szDato);    
            
        }
        
        
        for(int i = 2 ; i < nNumero; i++){
            
            if(nNumero % i == 0){
                
                bFlag = false;
                break;
            }
   
        }
        
        if(bFlag == false){
            System.out.println("no es primo");
        }else{
            System.out.println("es primo");
        }
    }
    
}

