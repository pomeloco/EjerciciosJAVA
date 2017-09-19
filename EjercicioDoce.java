/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodoce;

import java.util.Scanner;

/**
 *
 * @author pomelo
 */
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     * Se ingresa el importe de un producto importado y se le debe agregar el 35 % de impuestos
internos.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Dato;
        float precioProductoImporado=0, precioTotal=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese importe de producto: ");
        //precioProductoImporado = miSc.nextFloat();
        Dato = miSc.next();
        precioProductoImporado = Float.parseFloat(Dato);
        
        precioTotal = precioProductoImporado + (precioProductoImporado*35/100);
        System.out.println("El precio total es: "+precioTotal);
    }
    
}
