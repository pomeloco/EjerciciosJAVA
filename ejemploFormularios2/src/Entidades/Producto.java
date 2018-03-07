/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alumno
 */
public class Producto implements Comparable<Producto>{
    
    String nombre;
    String precio;
    public Producto(String nombre,String precio){
        this.nombre= nombre;
        this.precio= precio;
    }
    
    public String mostrarProducto(){
        return this.nombre +" "+ this.precio;
    }
    
    @Override
    public int compareTo(Producto Producto){
     
        int retorno;
        
        if(Producto.nombre.equalsIgnoreCase(this.nombre)){
            retorno=-1;
        }else if(!Producto.nombre.equalsIgnoreCase(this.nombre)){
            retorno=1;
        }else{
            retorno=0;
        }
        
        return retorno;
    }
    
    
    
    
}
