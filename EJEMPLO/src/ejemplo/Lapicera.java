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
public class Lapicera {
    
    private int nRojo=100;
    private int nAzul=100;
    
    
    public void Escribir(String szColor, Integer nCantidadDeTinta) {
        
        if(szColor.equalsIgnoreCase("rojo")){
            
            if(nCantidadDeTinta > this.nRojo){
                
                System.out.println("No hay tinta suficiente");
            }else{
                
                this.nRojo -= nCantidadDeTinta; 
            }
            
        }/* szColor.equalsIgnoreCase("rojo")*/else if(szColor.equalsIgnoreCase("azul")){
            
            if(nCantidadDeTinta > this.nAzul){
                
                System.out.println("No hay tinta suficiente");
            }else{
                
                this.nAzul -= nCantidadDeTinta; 
            }
        }//szColor.equalsIgnoreCase("azul")        
    }// ESCRIBIR
    
    
    public void RecargarTinta(String szColor, Integer nCantidadTinta){
        
        if(szColor.equalsIgnoreCase("rojo")){
                
            this.nRojo += nCantidadTinta; 
            
            
        }/* szColor.equalsIgnoreCase("rojo")*/else if(szColor.equalsIgnoreCase("azul")){
                          
            this.nAzul += nCantidadTinta; 
            
        }//szColor.equalsIgnoreCase("azul")
        
    }
}
