/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen;                    

import java.util.Scanner;

         //agregar en "main"
/**
 *
 * @author alumno
 */
public class guiaInicial {                      // clase
         
    /**
     * Se debe mostrar el siguiente mensaje “esto funciona de maravilla
     */
    public static void HacerEjercicio1() {              //metodo 
        
        System.out.println("esto funciona de maravilla");
    }
    
    public static void HacerEjercicio2(){
        
        String szNombre;
        Scanner scScanner = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        szNombre = scScanner.next();
        
        System.out.println("Su nombre es "+szNombre);
    }
    
    public static  void  HacerEjercicio3(){
        
        String nombre,apellido; 
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = miSc.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = miSc.nextLine();
        
        System.out.println("Su nombre es: "+nombre+" y su apellido es: "+apellido);

    }
    
    public static void HacerEjercicio5(){
        
        int numeroUno, numeroDos,Resultado;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numeroUno = miSc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = miSc.nextInt();

        Resultado=numeroUno+numeroDos;
        System.out.println("El Resultado de la suma es: " +Resultado);
    }
    
    public static void HacerEjercicio7(){
        
        float base=0,perimetro=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese la base del cuadrado: ");
        base = miSc.nextInt();
        
        perimetro = 4*base;
        System.out.println("El perimetro es de: "+perimetro);
    }
    
    public static void HacerEjercicio9(){
        
        String Dato; 
        Integer cantidad=0;
        float precioProducto=0, total=0;
        Scanner miSc = new Scanner(System.in);

        System.out.println("Ingrese cantidad de poducto");
        Dato = miSc.next();
        cantidad = Integer.parseInt(Dato);
        //System.out.println("El dato ingresado es: "+cantidad);
        
        System.out.println("Ingrese precio del producto: ");
        Dato = miSc.next();
        precioProducto = Float.parseFloat(Dato);
        //System.out.println(" el precio ingresado es: "+precioProducto);
        total=cantidad*precioProducto;
        System.out.println("El total es: "+total);
    }
    
    public static void HacerEjercicio11(){
        
        String Dato;
        float valorHoraTrabajo=0, cantidadHorasTrabajadas=0, sueldo=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la hora trabajada: ");
        //valorHoraTrabajo = miSc.nextFloat();
        Dato = miSc.next();
        valorHoraTrabajo = Float.parseFloat(Dato);
        
        System.out.println("Ingrese cantidad de horas trabajadas: ");
        //cantidadHorasTrabajadas = miSc.nextFloat();
        Dato = miSc.next();
        cantidadHorasTrabajadas = Integer.parseInt(Dato);
        
        sueldo = (valorHoraTrabajo*cantidadHorasTrabajadas) - ((valorHoraTrabajo*cantidadHorasTrabajadas)*15/100);
        //sueldo = sueldo - (sueldo*15/100);
        System.out.println("El sueldo correspondiente es de: "+sueldo);
        
    }
}

