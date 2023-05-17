/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_juanjimenez_lab1_metodos_parametros_argumentos;

/**
 *
 * @author ESPE
 */
public class operaciones {
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void sumar(int num1, int num2){
        suma = num1 + num2;
        
    }
    
    public void resultados(){
        System.out.println("El resultado de la suma es: "+suma);
    }
}
