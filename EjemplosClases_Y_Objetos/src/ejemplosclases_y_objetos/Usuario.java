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
public class Usuario {
    
    /*ATRIBUTOS*/
    private String szNombre;
    private String szClave;
    
    /*METODOS*/
    
    public void dameNombre(String szDato){ //metodo setter
        
        this.szNombre=szDato;
   
    }


    public void dameClave(String szDato){   //metodo setter
        
        if(szDato.length() < 4){
            
        this.szClave="mal";
        }else{
        this.szClave=szDato;
        }
    }    
    
    public void mostrarDatos() {
        
        System.out.println("este nombre es: "+this.szNombre+"\nY su clave: "+this.szClave);
    }
    
    public String GetterNombre() {
        
      return this.szNombre.toUpperCase();
    }
    
    public String GetterClave() {
        
       return this.szClave;
        
    }
    
    
}
