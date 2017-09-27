/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informerica;

import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;
import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Informerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scScanner = new Scanner (System.in);
        Integer iNumeroIngresado;
        String szAuxDato;
        /*Integer iNumeroUno;
        Integer iNumeroDos;
        Integer iResultado;
        
        iNumeroUno=2;
        iNumeroDos=10;
        
        iResultado= iNumeroDos%iNumeroUno;
        System.out.println(""+iResultado);
        
        iResultado= iNumeroUno%iNumeroDos;
        System.out.println(""+iResultado);*/
        
        System.out.println("Ingrese un numero: ");
        szAuxDato = scScanner.next();
        iNumeroIngresado = Integer.parseInt(szAuxDato);
        
      if(iNumeroIngresado<100){
          
          System.out.println("Es menor a 100!");
          
      }else if(iNumeroIngresado>100){
          System.out.println("Es mayor a 100!");
      }
      
      if(iNumeroIngresado<0){
          System.out.println("Es negativo");
      }else if(iNumeroIngresado>0){
          System.out.println("Es positivo");
      }
      

      if(iNumeroIngresado%2 == 0){
          System.out.println("Es par!");
      }else{
          System.out.println("Es impar!");
      }
    }
    
}
   