/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

/**
 *
 * @author alumno
 */
public class EJEMPLO {

    /**
     * @param args the command line arguments
     * dos lapiceras rojo y azul
     * cada una tiene 100
     * el metodo escribir recive el color y la cant de tinta a utilizar, de no tener tinta suficiente se muestra un mensaje 
     * el metodo cargar tinta recive el color y la cant para cargar 
     */
    public static void main(String[] args) {
        
        Lapicera unaLapicera = new Lapicera();
            
        unaLapicera.Escribir("rojo", 100);
        unaLapicera.RecargarTinta("rojo", 50);
        unaLapicera.RecargarTinta("rojo", 30);
        
    }
    
}
