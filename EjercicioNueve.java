/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionueve;

import java.util.Scanner;

/**
 *
 * @author pomelo
 */
public class EjercicioNueve {

    /**
     * @param args the command line arguments
     * - Se ingresa la cantidad y precio de un producto y se informa el total a pagar
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidad=0;
        float precioProducto=0, total=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad del producto: ");
        cantidad = miSc.nextInt();
        
        System.out.println("Ingrese precio del producto: ");
        precioProducto = miSc.nextFloat();
        
        total = cantidad*precioProducto;
        System.out.println("El total es: "+total);
        
    }
    
}
