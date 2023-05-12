/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_codicionales_if_elseif_juanjimenez;

/**
 *
 * @author ESPE
 */
public class Poo_codicionales_if_elseif_juanjimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hora = 18;
        if (hora>0 && hora <=12){
            System.out.println("buenos dias");
        }else if (hora > 12 && hora <= 18){
            System.out.println("buenas tardes");
        }else if (hora > 18 && hora <=23 ){
            System.out.println("buenas noches");
        }
    }
    
}
