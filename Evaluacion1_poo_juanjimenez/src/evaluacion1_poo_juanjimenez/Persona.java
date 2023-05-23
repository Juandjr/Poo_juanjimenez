/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion1_poo_juanjimenez;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Persona {
    Scanner leer=new Scanner(System.in);
    Scanner numer1=new Scanner(System.in);
    Scanner numer2=new Scanner(System.in);
    Scanner numer3=new Scanner(System.in);
    Scanner numer4=new Scanner(System.in);
    Scanner numer5=new Scanner(System.in);
    int nota1;
    int nota2;
    int nota3;
    int nota4;
    int nota5;
    int x;
    int notamed;
    
    public void elejirnum(){
       x = leer.nextInt();
       while (x!=4){
       switch (x){
           case 1:
               System.out.println("Ingrese la primera nota:");
               nota1 = numer1.nextInt();
               System.out.println("Ingrese la segunda nota:");
               nota2 = numer2.nextInt();
               System.out.println("Ingrese la tercera nota:");
               nota3 = numer3.nextInt();
               System.out.println("Ingrese la cuarta nota:");
               nota4 = numer4.nextInt();
               System.out.println("Ingrese la quinta nota:");
               nota5 = numer5.nextInt();
               System.out.println("Notas agregadas");
               break;
           case 2:
               notamed= nota1 + nota2 + nota3 + nota4 + nota5 / 5;
               System.out.println("La nota media es: "+notamed);
               break;
           case 3:
               if (notamed >=70){
                   System.out.println("Aprobado");
               } 
                   System.out.println("No aprobado");
                   System.out.println("Para Aprobar necesita una nota media de 70");
               break;

           default:
               System.out.println("Numero no valido");
               break;
       }
       System.out.println("Menu de opciones");
       System.out.println("1.Ingresar notas");
       System.out.println("2.Ver nota media");
       System.out.println("3.Ver Aprobado");
       System.out.println("4.Salir");
       x = leer.nextInt();
    }
    System.out.println("Gracias por usar el programa");
 }
}

