/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_juanjimenez_lab1_metretorvalores_pract7;
  import javax.swing.JOptionPane;
/**
 *
 * @author ESPE
 * 
 */
public class Operaciones {

    static Operaciones op1;
    public int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
        
    }
    
    static Operaciones op2;
    public int restar(int num1, int num2){
        int resta = num1 - num2;
        return resta;
        
    }
    
    static Operaciones op3;
    public int multiplicar(int num1, int num2){
        int multiplicacion = num1 * num2;
        return multiplicacion;
        
    }
    
    static Operaciones op4;
    public int division(int num1, int num2){
        int dividir = num1 + num2;
        return dividir;
        
    }
    
    
    public void resultados(int suma){
        System.out.println("el resultado de la suma"+suma);
        
    }
}