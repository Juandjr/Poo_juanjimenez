/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_juanjimenez_laboratorio1_operaciones_practica.pkg7;
  import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 * 
 */
public class Operaciones {
    int num1;
    int num2;
    int suma; 
    int restar; 
    int multiplicar; 
    int division;
    
    
    
    public void capturanumeros(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Denme su primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Denme su primer numero"));
    }

    public int sumar(){
        suma = num1+num2;
        return suma;
    }
    
    public int restar(){
        restar = num1-num2;
        return restar;
    }
    
    public int multiplicar(){
        multiplicar = num1*num2;
        return multiplicar;
    }
    
    public int division(){
        division = num1/num2;
        return division;
    }
    
    
    public void resultados (){
        System.out.println("el resultado de la suma es: "+suma);
        System.out.println("el resultado de la suma es: "+restar);
        System.out.println("el resultado de la suma es: "+multiplicar);
        System.out.println("el resultado de la suma es: "+division);
    }
    
    
    
    
}
