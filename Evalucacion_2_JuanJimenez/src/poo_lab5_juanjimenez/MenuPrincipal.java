/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_lab5_juanjimenez;

import java.util.Scanner;

/**
 *
 * @author jrome
 */
public class MenuPrincipal {
     
    Scanner leer=new Scanner(System.in);
     
    int opc;
    public void menuPricipal(){
        System.out.println("=====Menu de opciones=====");
        System.out.println("1. Pseudocalculadora");
        System.out.println("2. Contactos por apellidos");
        System.out.println("3. Salir");
        opc = leer.nextInt();
        while(opc!=3){
            switch(opc){
                case 1:
                     Calculadora pseudocal = new Calculadora();
                     pseudocal.calculadora();
                     break;
                case 2:
                     Apellidos contacto = new Apellidos();
                     contacto.apellidos();  
                     break;
                default: 
                    System.out.println("Opcion no valida");
            }
            System.out.println("=====Menu de opciones=====");
            System.out.println("1. Pseudocalculadora");
            System.out.println("2. Contactos por apellidos");
            System.out.println("3. Salir");
            opc = leer.nextInt();
        }
        System.out.println("Gracias por ingresar");
    }
}
            
        

        
