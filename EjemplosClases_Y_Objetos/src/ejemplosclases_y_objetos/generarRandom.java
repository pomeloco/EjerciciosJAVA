/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclases_y_objetos;

/**
 *
 * @author alumno
 */
public class generarRandom {
    
    public static String DameUnNombre() {
    
        String szDato="";
        int random = (int)Math.random()*10;
        
        switch(random){ 
            
            case 0:
                szDato="alfredo";
                break;
            case 1:
                szDato="rogelio";
                break;
            case 2:
                szDato="julieta";
                break;
            case 3:
                  szDato="carlos";
                  break;
                  
            case 4:
              szDato="juan";
              break;
              
            case 5:
                szDato="carolina";
                break;
                
            case 6:
                szDato="ayelen";
                break;
                
             case 7:
                szDato="camila";
                break;
                
             case 8:
                szDato="rocio";
                break;
                
            case 9:
                szDato="chiche";
                break;    
            case 10:
                szDato="pepito";
                break;

        }
        
        return szDato;
    }
    
    
    
}
