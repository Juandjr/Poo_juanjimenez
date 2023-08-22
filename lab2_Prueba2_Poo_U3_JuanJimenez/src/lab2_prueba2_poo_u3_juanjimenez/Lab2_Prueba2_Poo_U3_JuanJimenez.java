/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_prueba2_poo_u3_juanjimenez;

import Vista.Estudiantes;
import Vista.Horario;
import Vista.Profesor;
import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Lab2_Prueba2_Poo_U3_JuanJimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        // TODO code application logic here 
        System.out.println("===Menu de opciones===");
        System.out.println("1.Aplicacion estudiante");
        System.out.println("2.Aplicacion profesor");
        System.out.println("3.Aplicacion horario");
        System.out.println("4.salir");
        opc=sc.nextInt();
        while (opc!=4){
            switch(opc){
                case 1:
                   Estudiantes registro = new Estudiantes();
                   registro.setVisible(true); 
                   break;
                case 2:
                    Profesor profe = new Profesor();
                    profe.setVisible(true);
                    break;
                case 3:
                    Horario hora = new Horario();
                    hora.setVisible(true);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("===Menu de opciones===");
            System.out.println("1.Aplicacion estudiante");
            System.out.println("2.Aplicacion profesor");
            System.out.println("3.Aplicacion horario");
            System.out.println("4.salir");
            opc=sc.nextInt();
        }
    }
    
}
                    