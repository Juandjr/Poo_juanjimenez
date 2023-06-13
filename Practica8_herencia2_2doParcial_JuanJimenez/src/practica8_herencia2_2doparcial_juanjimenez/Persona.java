/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica8_herencia2_2doparcial_juanjimenez;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
public class Persona {
    String nombre;
    
    public Persona(String nomb){
        this.nombre=nomb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Scanner leer=new Scanner(System.in);
        nombre = leer.next();
        this.nombre = nombre;
    }
   
}
