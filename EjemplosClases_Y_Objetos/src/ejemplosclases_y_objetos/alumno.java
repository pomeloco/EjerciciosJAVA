/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclases_y_objetos;

import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author alumno
 */
public class alumno {
    
    /*
    crear atributos y generar 10 objetos alunnos
    */
    private String szNombre; //mayor 3 letras o nn
    private String szApellido;   // mayor 3 letras o mm
    private String szCorreo; //8 de largo
    private String szSexo;   //f o m o esta mal
    private String szFechaNacimiento;    // 
    private String szLocalidad;  // mayor 4
    private String szDireccion;  // mayor 8 letras
    private String szLegajo; // mayor 6 o esta mal
    private String szDni;    // mayor 8 caracteres 
    

    
    /*************************SETS********************/
    public void SetNombre(String szDato){
        
        if(szDato.length()<3){
            this.szNombre="nn"; 
        }else{
            this.szNombre=szDato;
        }
    }
    
    public void SetApellido(String szDato){
        
        if(szDato.length()<3){
            this.szApellido="nn";
        }else{
            this.szApellido=szDato;
        }
    }    
    
     public void SetSexo(String szDato){
        
         if(szDato.length()!='f' && szDato.length()!='m'){
            this.szSexo="esta mal"; 
         }else{
            this.szSexo=szDato;
         }
    }
     
    public void SetFechaNacimiento(String szDato){
        
        this.szFechaNacimiento=szDato;
    }
    
    public void SetLocalidad(String szDato){
        
        if(szDato.length()<4){
            this.szLocalidad="mal";   
        }else{
            this.szLocalidad=szDato;
        }
    }
    
     public void SetDireccion(String szDato){
        
         if(szDato.length()<8){
            this.szDireccion="mal";   
         }else{
            this.szDireccion=szDato;
         }
    }
     
    public void SetLegajo(String szDato){
        
        if(szDato.length()<6){
        this.szLegajo="mal";
        }else{
        this.szLegajo=szDato;
        }
    }
    
    public void SetDni(String szDato){
        
        if(szDato.length()<6){
        this.szDni="mal";
        }else{
        this.szDni=szDato;
        }
    
    }
    
    /**********************GETS********************/
    
    public String GetterNombre() {
        
       return this.szNombre.toUpperCase();       
    }
    
    public String GetterApellido() {
        
       return this.szApellido.toUpperCase();
        
    }
    
    public String GetterFechaNacimiento() {
        
       return this.szFechaNacimiento;
        
    }
    
    public String GetterLocalidad() {
        
       return this.szLocalidad.toUpperCase();
        
    }
    
    public String GetterDireccion() {
        
       return this.szDireccion.toUpperCase();
        
    }
    
    public String GetterLegajo() {
        
       return this.szLegajo.toUpperCase();
        
    }
    
    public String GetterSexo() {
        
       return this.szSexo.toUpperCase();
        
    }
    
    public String GetterDni() {
        
       return this.szDni;
        
    }

/******************************************************/
    public void MostrarAlumnos() {

        System.out.println(this.szNombre);
        System.out.println(this.szApellido);
        System.out.println(this.szCorreo);
        System.out.println(this.szSexo);
        System.out.println(this.szFechaNacimiento);
        System.out.println(this.szLocalidad);
        System.out.println(this.szDireccion);
        System.out.println(this.szLegajo);
        System.out.println(this.szDni);
    }
    
    
    public void mostrarInstanciaAlumno(){
        
        //1er metodo
        //System.out.println(this.szApellido);
        
        //2do metodo
        alumno.mostrarEstaticoAlumno(this);
    }
    
    
    public static void mostrarEstaticoAlumno(alumno unAlumno) {
        
        //1er metodo
        //unAlumno.mostrarInstanciaAlumno();
        
        //2do metodo
        System.out.println(unAlumno.GetterApellido());
        
       
    }
    
    
}
