/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_lab3_juanjimenez;

import java.util.Scanner;

/**
 *
 * @author jrome
 */
public class Poo_lab3_juanjimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String nombre,apellido;
        int edad;
        
       
          System.out.println("ingresar nombre");
          nombre=teclado.nextLine();
          
          System.out.println("ingresar apellido");
          apellido=teclado.nextLine();
            
           System.out.println("ingresar edad");
          edad=teclado.nextInt();
          
          
          
          //crear el objeto
          Persona persona1=new Persona();
          persona1.setNombre(nombre);
          persona1.setApellido(apellido);
          persona1.setEdad(edad);
          
          
          System.out.println("El nombre es: "+ persona1.getNombre());
          System.out.println("El Apellido es: " + persona1.getApellido() );      
          System.out.println("La edad es: " + persona1.getEdad());
    }
    
}
