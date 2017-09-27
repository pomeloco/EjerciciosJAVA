/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ferreteriaferrete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class FerreteriaFerrete {

    /**
     * @param args the command line arguments
     * cada lamparita $35
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scScanner = new Scanner(System.in);
        Integer nCantLamparitas, iPrecioLamparitas=35;
        float  iTotalAPagar=0, iPrecioFinal=0;
        String szMarcaLamparitas, szDatoAux;
        
        System.out.println("Ingrese cant de lamparitas: ");
        szDatoAux = scScanner.next();
        nCantLamparitas = Integer.parseInt(szDatoAux);
        
        System.out.println("Ingrese marca de lamparitas: ");
        szMarcaLamparitas = scScanner.next();
        
        if(nCantLamparitas>=3){
            
            if(nCantLamparitas <= 6){
                
                iTotalAPagar= (nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*50)/100);
                
            }else{
                
                switch(nCantLamparitas){
                    
                    case 5: 
                        if(szMarcaLamparitas.equals("ArgentinaLuz")){
                        
                        iTotalAPagar= (float)(nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*40)/100);
                            
                        }else{
                         
                         iTotalAPagar= (float)(nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*30)/100);
                            
                        }
                        break;
                    
                    
                    case 4:
                        
                        if(szMarcaLamparitas.equals("ArgentinaLuz") || szMarcaLamparitas.equals("FelipeLamparas")){
                            
                            iTotalAPagar= (float)(nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*25)/100);
                            
                        }else{
                            
                            iTotalAPagar= (float)(nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*20)/100);
                        }
                        
                        break;
                    
                    case 3:
                            if(szMarcaLamparitas.equals("ArgentinaLuz")){
                                iTotalAPagar= (nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*15)/100);
                            }else if(szMarcaLamparitas.equalsIgnoreCase("FelipeLamparas")){
                                iTotalAPagar= (nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*10)/100);
                            }else{
                                iTotalAPagar= (nCantLamparitas*iPrecioLamparitas) - ((iPrecioLamparitas*5)/100);
                            }
                        
                        break;
                }
                
            }
         
            
        }else{
            
            iTotalAPagar = nCantLamparitas*iPrecioLamparitas;            
        }
        
        
        if(iTotalAPagar>120){
            
            iPrecioFinal=iTotalAPagar+(iTotalAPagar*10/100);
            System.out.println("IIBB usted pago: "+iPrecioFinal);
        }else{
            System.out.println("Total a pagar: "+iTotalAPagar);
        }
        
    }
    
}
