/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alumno
 */
public class producto {
    String sNombre,sPrecio;
    
    public producto (String sNombre, String sPrecio){
        this.sNombre = sNombre;
        this.sPrecio = sPrecio;
    }
    
    public String mostrarProducto(){
        return this.sNombre+" "+this.sPrecio;
    }
}


