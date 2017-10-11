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
       //EjemploWhile.PedirNumeros();
       //EjemploWhile.ValidarNumerosConWhile();
       //EjemploWhile.TomarLosDatosValidos();
       //EjemploWhile.ContadoresYAcumuladores();
       //EjemploWhile.NumeroPrimo();
       EjemploWhile.PrimosDelUnoAlCien();
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
    
    public static void ValidarNumerosConWhile() {
     
      Scanner scScanner = new Scanner(System.in);
      String szDato;
      float fNota;
      
        System.out.println("Ingrese nota del alumno: ");
        szDato = scScanner.next();
        fNota = Float.parseFloat(szDato);
        
        while(fNota < 1 || fNota >10){
            
            System.out.println("Nota incorrecta, reingrese ");
            szDato = scScanner.next();
            fNota = Float.parseFloat(szDato);
        }
           
        System.out.println("La nota es: "+fNota);
        
    }//fin validar con while
    
    public static void ValidarLetrasConWhile() {
        
      Scanner scScanner = new Scanner(System.in);
      String szDato;
        
        System.out.println("Ingrese su sexo: ");
        szDato = scScanner.next();
                
        while(szDato.equalsIgnoreCase("f") && szDato.equalsIgnoreCase("m")){
            
            System.out.println("sexo incorrecto, reingrese ");
            szDato = scScanner.next();
            
        }
    }
    
    
    /**
     * nombre
     * validar edad  1-100
     * sexo f/m
     * estado civil soltero, casado, divorciado, viudo
     * nacionalidad: L:latiuno E: uropeo N:nativo R resto del mundo
     * sueñldo 8k - 50k
     * dona organos "si/no"
     */
    public static void TomarLosDatosValidos() {
        
    Scanner scScanner = new Scanner(System.in);
    String szAux, szNombre, szSexo, szEstadoCivil, szNacionalidad, szDonador, szContraseña;  
    Integer nEdad, nSueldo;
    
        System.out.println("Ingresar nombre: ");
        szNombre = scScanner.next();
        
        System.out.println("Ingrese edad: ");
        szAux = scScanner.next();
        nEdad = Integer.parseUnsignedInt(szAux);
        
        while( nEdad<1 || nEdad > 100){
            
            System.out.println("Reingrese edad:");
            szAux = scScanner.next();
            nEdad = Integer.parseUnsignedInt(szAux);
        }
    
        System.out.println("Ingrese sexo: ");
        szSexo = scScanner.next();
        
        while(!szSexo.equalsIgnoreCase("f") && !szSexo.equalsIgnoreCase("m")){
            
            System.out.println("sexo incorrecto, reingrese ");
            szSexo = scScanner.next();         
        }
        
        System.out.println("Ingrese Estado Civil: ");
        szEstadoCivil = scScanner.next();   
        
        while(!szEstadoCivil.equalsIgnoreCase("soltero") && !szEstadoCivil.equalsIgnoreCase("casado") && !szEstadoCivil.equalsIgnoreCase("viudo") && !szEstadoCivil.equalsIgnoreCase("divorciado")){
            
            System.out.println("estado civil incorrecto, reingrese ");
            szEstadoCivil = scScanner.next();         
        }       
        
    
        System.out.println("Ingrese nacionalidad: ");
        szNacionalidad = scScanner.next();
        
        while(!szNacionalidad.equalsIgnoreCase("N") && !szNacionalidad.equalsIgnoreCase("L") && !szNacionalidad.equalsIgnoreCase("E") && !szNacionalidad.equalsIgnoreCase("R")){
            
            System.out.println("nacionalidad incorrecto, reingrese ");
            szNacionalidad = scScanner.next();         
        }
        
        System.out.println("Ingrese sueldo: ");
        szAux = scScanner.next();
        nSueldo = Integer.parseUnsignedInt(szAux);
        
        while( nSueldo<8000 || nSueldo > 50000){
            
            System.out.println("Reingrese sueldo:");
            szAux = scScanner.next();
            nSueldo = Integer.parseUnsignedInt(szAux);
        }
        
        System.out.println("Dona organos?: ");
        szDonador = scScanner.next();
        
        while(!szDonador.equalsIgnoreCase("si") && !szDonador.equalsIgnoreCase("no")){
            
            System.out.println("respuesta incorrecta, reingrese ");
            szDonador = scScanner.next();         
        }      
        
        System.out.println("Ingrese contraseña: ");
        szContraseña = scScanner.next();
        
        while(szContraseña.length() <6 ){
            
            System.out.println("Contaseña demasiado corta, reingrese: ");
            szContraseña = scScanner.next();
        }
        
        System.out.println("Nombre: "+szNombre+"\nEdad: "+nEdad+"\nSexo: "+szSexo+"\nEstado civil: "+szEstadoCivil+"\nNacionalidad: "+szNacionalidad+"\nSueldo: "+nSueldo+"\nDonador: "+szDonador+"\nContraseña: "+szContraseña);
    } //ingresar datos validos FIN
    
    public static void ContadoresYAcumuladores() {
        
        Integer nAcumulador=0,nContador=0,nMultiplicador=1, nResta=0, nContadorDePares=0, nMultiplosDeTres=0;
        
        while(nContador < 10){
            nContador++;
            System.out.println("numero: "+nContador);
            nAcumulador += nContador;
            nMultiplicador *=nContador;
            nResta -= nContador;
            
            if(nContador%2 == 0){
                nContadorDePares++;
            }
            
            if(nContador%3 == 0){
                nMultiplosDeTres++;
            }
        }
        System.out.println("la suma es: "+nAcumulador);
        System.out.println("factorial es: "+nMultiplicador);
        System.out.println("resta es: "+nResta);
        System.out.println("los pares es: "+nContadorDePares);
        System.out.println("multiplos de 3 es: "+nMultiplosDeTres);
       
    }
    
    public static void NumeroPrimo() {
        
        Integer nNumero=16, nContador=2,nContadorDivisores=0;
        
        while(nContador < nNumero){
            
            if(nNumero % nContador == 0){
                nContadorDivisores++;
                break;
            }
            nContador++;
        }
        
        if(nContadorDivisores > 0){
            System.out.println("no es primo");
        }else{
            System.out.println("es primo");
        }
    }
    
    public static void PrimosDelUnoAlCien() {
        Integer nNumero=1, nContador=2,nContadorDivisores=0;
        
        
        while(nNumero<101){
            
            
            while(nContador < nNumero){

                if(nNumero % nContador == 0){
                    nContadorDivisores++;
                    break;
                }
                nContador++;
            }

            if(nContadorDivisores > 0){
                System.out.println("no es primo");
            }else{
                System.out.println("es primo "+nNumero);
            }
      
        nNumero++;
        }
    
    }
}

    


        