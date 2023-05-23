/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion1_poo_juanjimenez;

/**
 *
 * @author ESPE
 */
public class Evaluacion1_poo_juanjimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Evalucion 1
        //Enunciado
        //Realizar un programa para la gestion de notas que al iniciarse muestre el siguiente menu:
        //1-agregar nota
        //2-ver nota media
        //3-ver aprobados
        //4-salir
        //A elegir la opcion se solicitara la introduccion de una nota y se guardara, volviendo a mostrar de nuevo el menu
        //Con la opciones 2 y 3 se mostrara, respectivamente, la nota media registrada hasta el momento y el numero de aprobado. A elegir 4 se abandonara el programa.
        //Este es el menu de opciones del programa
        System.out.println("Menu de opciones");
        System.out.println("1.Ingresar notas");
        System.out.println("2.Ver nota media");
        System.out.println("3.Ver Aprobado");
        System.out.println("4.Salir");
            
        //crea una nuevo objeto "persona1"
        Persona persona1 = new Persona();
        //llamo a la funcion con la 
        persona1.elejirnum();
    }
    
}
