/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica7_herencia_2doparcial_juanjimenez;

/**
 *
 * @author ESPE
 */
public class Practica7_herencia_2doParcial_JuanJimenez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.encendido();
        vehiculo1.apagado();
        Automovil auto = new Automovil();
        auto.encendido();
        auto.apagado();
        motocicleta moto = new motocicleta();
        moto.encendido();
        moto.apagado();
        System.out.println(vehiculo1.estado);
        System.out.println(auto.estado);
        System.out.println(moto.estado);
    }
    
}
