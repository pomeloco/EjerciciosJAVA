/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclases_y_objetos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemplosClases_Y_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String szDato;
        
        //alumno mostrarAlumno;
        Usuario unUsuario;
        alumno[] alumnosArray;
        alumno Alumnos;
        
        Scanner scScanner = new Scanner(System.in);
        alumnosArray = new alumno[10];
        Alumnos = new alumno();
        unUsuario = new Usuario();
        
        /********************************************/
        
        unUsuario.dameNombre("natalia natalia");
        unUsuario.dameClave("123");
        
        System.out.println(unUsuario.GetterNombre());
        System.out.println(unUsuario.GetterClave());
        
       /* for (int i = 0; i < alumnosArray.length; i++) {
            
            System.out.println("Ingrese Apllido: ");
            alumnosArray[i].szApellido = scScanner.next();
            
            System.out.println("Ingrese nombre: ");
            alumnosArray[i].szNombre = scScanner.next();
            
            System.out.println("Ingrese sexo: ");
            alumnosArray[i].szSexo = scScanner.next();
            
            System.out.println("Ingrese correo: ");
            alumnosArray[i].szCorreo = scScanner.next();
            
            System.out.println("Ingrese direccion: ");
            alumnosArray[i].szDireccion = scScanner.next();
            
            System.out.println("Ingrese localidad: ");
            alumnosArray[i].szLocalidad = scScanner.next();
            
            System.out.println("Ingrese fecha de nacimiento: ");
            alumnosArray[i].szFechaNacimiento = scScanner.next();
            
            System.out.println("Ingrese legajo: ");
            alumnosArray[i].szLegajo = scScanner.next();
            
            System.out.println("Ingrese DNI: ");
            alumnosArray[i].szDni = scScanner.next();
        }
        */
       
       
       Alumnos.SetApellido("ramirez");
       Alumnos.SetNombre("juan");
       Alumnos.SetDireccion("av mitre 123");
       Alumnos.SetLocalidad("avellaneda");
       Alumnos.SetLegajo("123");
       Alumnos.SetFechaNacimiento("09/06/1996");
       Alumnos.SetSexo("machote");
       Alumnos.SetDni("12345");
       
       System.out.println(Alumnos.GetterApellido());
       System.out.println(Alumnos.GetterNombre());
       System.out.println(Alumnos.GetterSexo());
       System.out.println(Alumnos.GetterLocalidad());
       System.out.println(Alumnos.GetterDireccion());
       System.out.println(Alumnos.GetterFechaNacimiento());
       System.out.println(Alumnos.GetterDni());
       
       
       //alumnosArray[1] = new alumno();
      /* alumnosArray[1].SetApellido("juan");
       System.out.println(alumnosArray[1].GetterApellido());
       */
      
      
    }
    
}
