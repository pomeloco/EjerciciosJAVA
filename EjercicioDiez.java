/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodiez;

import java.util.Scanner;

/**
 *
 * @author pomelo
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     * Se ingresa la cantidad de ganadores da la lotería nacional y el monto total del premio,
informar cuánto dinero le corresponde a cada uno.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantidadGanadoresLoteria=0;
        float montoTotalAcumulado=0, dineroRepartidoEntreGanadores=0;
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de ganadores: ");
        cantidadGanadoresLoteria = miSc.nextInt();
        
        System.out.println("Ingrese dinero total acumulado: ");
        montoTotalAcumulado = miSc.nextFloat();
        
        dineroRepartidoEntreGanadores = montoTotalAcumulado/cantidadGanadoresLoteria;
        System.out.println("el suma de dinero que le toca a cada uno es; "+dineroRepartidoEntreGanadores);
    }
    
}
