/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_juanjimenez_lab1_metretorvalores_pract7;

import javax.swing.JOptionPane;

/**
 *
 * @author ESPE
 */
public class Poo_juanjimenez_lab1_metretorvalores_pract7 {
    /**
     * @param args
     */
   //en este no se declara valores
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones op1 = new Operaciones();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Denme su primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Denme su primer numero"));
        
        int suma = op1.sumar(num1,num2);
        
        
        op1.resultados(suma);
    }
    
}
