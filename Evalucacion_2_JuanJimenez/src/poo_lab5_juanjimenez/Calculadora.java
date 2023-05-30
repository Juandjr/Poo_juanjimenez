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
public class Calculadora {
    Scanner numer1=new Scanner(System.in);
    Scanner leer1=new Scanner(System.in);
    int[] num=new int [5];
    int suma=0;
    int promedio=0;
    int opcCal;
    
    public void calculadora(){
        System.out.println("===Menu de Pseudocalculadora===");
        System.out.println("1. Agregar numeros");
        System.out.println("2. Suma de los numeros");
        System.out.println("3. Promedio de los numeros");
        System.out.println("4. Par o Impar");
        System.out.println("5. Salir");
        opcCal = leer1.nextInt();
        while (opcCal != 5){
            switch(opcCal){
                case 1:
                    for(int i=0;i<num.length;i++){
                        num[i]= numer1.nextInt();
                    }
                    break;
                case 2:
                    for(int j=0;j<num.length;j++){
                        suma += num[j];
                    }
                    System.out.println("La suma de los numeros es: "+suma);
                    break;
                case 3:
                    promedio = suma/5;   
                    System.out.println("El promedio de los numeros es: "+promedio);
                    break;
                case 4:
                    for(int k=0;k<num.length;k++){
                        if (num[k]%2== 0){
                            System.out.println("Sí es par: "+num[k]);
                        } else {
                            System.out.println("No es par: "+num[k]);
                        }
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("===Menu de Pseudocalculadora===");
            System.out.println("1. Agregar numeros");
            System.out.println("2. Suma de los numeros");
            System.out.println("3. Promedio de los numeros");
            System.out.println("4. Par o Impar");
            System.out.println("5. Salir");
            opcCal = leer1.nextInt();
        } 
    }

}