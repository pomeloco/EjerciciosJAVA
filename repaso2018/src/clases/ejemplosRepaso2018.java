/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejemplosRepaso2018 {
    
    /**
     * ejemplo ingreso de datos
     */
    public static void IngresoDeDatos(){
    
        Scanner scMiScanner = new Scanner(System.in);
        String sDato;
        Integer nNumeroUno, nNumeroDos, nResultado=0;
        
        System.out.println("ingresar primer numero:");
        sDato=scMiScanner.next();
        nNumeroUno = Integer.parseInt(sDato);
        
        System.out.println("ingresar segundo  numero:");
        sDato=scMiScanner.next();
        nNumeroDos = Integer.parseInt(sDato);
        
        
        nResultado=nNumeroUno+nNumeroDos;
        
        System.out.println("resultado: "+ nResultado);
    }//fin Ingreso de datos
    
    /**
     * ejemplo mostrar mayor
     */
    public static void mostarMayor(){
        
             Scanner scMiScanner = new Scanner(System.in);
        String sDato;
        Integer nNumeroUno, nNumeroDos, nResultado=0;
        
        System.out.println("ingresar primer numero:");
        sDato=scMiScanner.next();
        nNumeroUno = Integer.parseInt(sDato);
        
        System.out.println("ingresar segundo  numero:");
        sDato=scMiScanner.next();
        nNumeroDos = Integer.parseInt(sDato);
        
        
        nResultado=nNumeroUno+nNumeroDos;
        
        System.out.println("resultado: "+ nResultado);
        
        if(nNumeroUno>nNumeroDos){
            System.out.println("el primer numero es mayor");
            
        }else if(nNumeroUno<nNumeroDos){
            System.out.println("el segundo numero es mayor");
            
        }else{
            System.out.println("los numeros son iguales");
        
        }
    }//mostrar mayor
     
    /**
      * saludo
      */
    public static void saludar(){
        
        System.out.println("hola mundo");
        
    }//fin saludar
    
    /**
     * ejemplo switch
     */
    public static void usoDelSwitch(){
        
        Scanner scScanner = new Scanner(System.in);
        
        String szMes;
        
        System.out.println("ingrese mes:");
        szMes = scScanner.next();
        szMes = szMes.toLowerCase();
        
        switch(szMes){
            
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                            System.out.println("mes de 31 dias");
                            break;
            case "febrero": 
                            System.out.println("mes de 28 dias");
                            break;
                            
           default:
                    System.out.println("mes de 30 dias");
                    break;
           }//fin switch
    }

    /**
     * switch + if
     * se pide el ingreso de un dia de la semana y una edad
     * de ser fin de semana y tener menos de 13 años
     * mostrar "a descansar"
     * si es dia de la semana y la misma edad(menos de 13)
     * mostrar "a estudiar"
     * si la edda supera los 18 años
     * mostrar "a trabajar" 
     * si la edad esta entre 15 y 30
     * mostrar "a festejar" solo si es fin de semana
     */ 
    public static void SwitchConIf() {
        
        Scanner miSc = new Scanner(System.in);
        
        String szDiaDeSemana, sDato;
        Integer nEdad;
        
        System.out.println("Ingrese dia de la semana:");
        szDiaDeSemana = miSc.next();
        szDiaDeSemana = szDiaDeSemana.toLowerCase();
        
        System.out.println("Ingrese su edad:");
        sDato = miSc.next();
        nEdad = Integer.parseInt(sDato);
        
        switch(szDiaDeSemana){
            
            case "viernes":
            case "sabado":
            case "domingo":
                        if(nEdad<=13){
                            System.out.println("a descansar");
                        }else if(nEdad<=30 && nEdad>=18){
                            System.out.println("a festejar");
                        }
                        break;
                        
            default:
                
                        if(nEdad<=13){
                            System.out.println("a estudiar");
                        }else if(nEdad<=30 && nEdad>=18){
                            System.out.println("a trabajar");
                        }
                        break;
        }//fin switch
    }

    /**
     * ejemplo while
     */
    public static void iteracionWhile(){
        
        Integer nContador=0;
        
        while(nContador<10){
            
            nContador++;
            System.out.println(nContador);
        }
        
        while(nContador>=0){
            
            System.out.println(nContador);
             nContador--;
        }
    }//fin iteracion while

    /**
     * condiciones while
     */
    public static void condicionesWhile(){
        
        Scanner miSC = new Scanner(System.in);
        Integer nEdad; //entre 5 y 10
        Character cLetra; // s o f
        String sDato;
        
        System.out.println("ingrese edad");
        sDato = miSC.next();
        nEdad = Integer.parseInt(sDato);
        
        while(nEdad<5 || nEdad>10){
            System.out.println("Reingrese");
            sDato = miSC.next();
            nEdad = Integer.parseInt(sDato);
        }
       
        System.out.println("ingrese letra");
        cLetra = miSC.next().charAt(0);
                
       while(cLetra!='f' && cLetra!='m'){
           System.out.println("reingrese");
           cLetra = miSC.next().charAt(0);
       }
    }

    
}