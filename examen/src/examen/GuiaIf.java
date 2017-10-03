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
public class GuiaIf {
    
    public static void HacerEjercicio13(){
        
        String szColor, szLocalidad;
        Scanner scScanner = new Scanner(System.in);
        
        System.out.println("Ingresa color: ");
        szColor = scScanner.next();
        
        System.out.println("Ingresa localidad: ");
        szLocalidad = scScanner.next();
        
        if(szLocalidad.equalsIgnoreCase("Avellaneda") || szLocalidad.equalsIgnoreCase("Lanus")){
            
            if(szColor.equalsIgnoreCase("rojo")){
                
                System.out.println("sos de independiente");
                
            }
        }
    }// hacer ejercicio 13
    
    
    /**
     * Se pide el sexo y el nombre, si es “f” de femenino, se muestra el mensaje” feliz dia XXXXX”, donde XXXX es el nombre
     */
    public static void HacerEjercicio14(){
        
        String szNombre, szSexo;
        
        Scanner scScanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        szNombre = scScanner.next();
        
        System.out.println("Ingrese su sexo: ");
        szSexo = scScanner.next();
        
        if(szSexo.equals("femenino")){
            
            System.out.println("feliz dia!");
        }
    }//ejercicio 14
    
    /**
     * -Se debe ingresar un edad  e  informar si es mayor de edad o no.
     */
    
    public static void HacerEjercicio16(){
        
        Scanner scScanner = new Scanner(System.in);
        String szDato;
        Integer nEdad;
        
        System.out.println("Ingrese edad: ");
        szDato = scScanner.next();
        nEdad = Integer.parseInt(szDato);
        
        if(nEdad>=18){
            System.out.println("mayor de edad");
        }else{
            System.out.println("menor de edad");
        }
        
    }//ejercicio 16
    
    /**
     * - Se pide una clave  y si coincide de muestra el mensaje “Bienvenido”  de lo contrario mostrar el mensaje “clave incorrecta
     */
    public static void HacerEjercio18() {
       
        Scanner scScanner = new Scanner(System.in);
        String szPassword="123",szPasswordIngresada;
        
        System.out.println("Ingrese contraseña: ");
        szPasswordIngresada = scScanner.next();
        
        if(szPassword.equals(szPasswordIngresada)){
            
            System.out.println("Bienvenido!");
        }else{
            System.out.println("Contraseña incorrecta!");
        }
        
    }//ejercicio 18
    
    public static void HacerEjercicio20() {
        
    Scanner scScanner = new Scanner(System.in);
    String szMes,szDato;
    float dImporte,dPrecioTotal;
    
        System.out.println("Ingrese importe del pasaje: ");
        szDato = scScanner.next();
        dImporte = Float.parseFloat(szDato);
        
        System.out.println("Ingrese mes de salida: ");
        szMes = scScanner.next();
        
        if(szMes.equalsIgnoreCase("Enero")){
            dPrecioTotal = dImporte-(dImporte*10/100);
        }else{
            dPrecioTotal = dImporte;
        }
        System.out.println("usted debe pagar: "+dPrecioTotal);
    }//hacer ejercicio 20
    
    public static void HacerEjercicio22() {
        
    Scanner scScanner = new Scanner(System.in);
    float dNota;
    String szDato;
    
        System.out.println("Ingrese su nota: ");
        szDato = scScanner.next();
        dNota = Float.parseFloat(szDato);
        
        if(dNota==10){
            System.out.println("Exelente");
        }else if (dNota <= 9 && dNota >=4){
            System.out.println("Aprobado!");
        }else{
            System.out.println("suerte la proxima!");
        }
        
    }//hacer ejercicio 22
}


//3-5-7-9-11 (inical)
//guia if 14 16 18 20 22