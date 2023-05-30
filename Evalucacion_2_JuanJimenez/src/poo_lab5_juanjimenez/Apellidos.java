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
public class Apellidos {
    Scanner leer2=new Scanner(System.in);
    Scanner contacto=new Scanner(System.in);
    String[] apellido=new String [5];
    int opcApe;
    
    
    public void apellidos(){
        System.out.println("===Menu de Contactos===");
        System.out.println("1. Agregar apellido");
        System.out.println("2. mostrar apellidos añadidos");
        System.out.println("3. salir");
        opcApe = leer2.nextInt();
        while (opcApe != 3){
            switch(opcApe){
                case 1:
                    for(int i=0 ;i< apellido.length;i++ ){
                    apellido[i]= contacto.next();
                    }
                    System.out.println("Contactos agregados correctamente");
                    break;
                case 2:
                    for(int j=0 ;j< apellido.length;j++ ){
                      System.out.println("Contacto numero: "+j);
                      System.out.println(apellido[j]);
                    }
                    break;
                default:
                    
                    break;
            }
            System.out.println("===Menu de Contactos===");
            System.out.println("1. Agregar apellido");
            System.out.println("2. mostrar apellidos añadidos");
            System.out.println("3. salir");
            opcApe = leer2.nextInt();
        }
    }     
}
