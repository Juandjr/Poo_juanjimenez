/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_juanjimenez_laboratorio1;

/**
 *
 * @author ESPE
 */
public class Poo_juanjimenez_laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Perro perro1 = new Perro();
       perro1.sexo="masculino";
       perro1.edad=3;
       perro1.color="dorado";
       perro1.raza="golden";
       perro1.tampelaje="largo";
       
       
       System.out.println(perro1.sexo);
       System.out.println(perro1.edad);
       System.out.println(perro1.color);
       System.out.println(perro1.raza);
       System.out.println(perro1.tampelaje);
       
       Perro perro2 = new Perro();
       perro2.sexo="masculino";
       perro2.edad=5;
       perro2.color="negro";
       perro2.raza="bulldog";
       perro2.tampelaje="corto";
       
       
       System.out.println(perro2.sexo);
       System.out.println(perro2.edad);
       System.out.println(perro2.color);
       System.out.println(perro2.raza);
       System.out.println(perro2.tampelaje);
       
       Gato gato1 = new Gato();
       gato1.nombre="nieve";
       gato1.edad=2;
       gato1.color="blanco";
       gato1.sexo="Femenino";
       gato1.tampelaje="Largo";
       
       
       System.out.println(gato1.nombre);
       System.out.println(gato1.edad);
       System.out.println(gato1.color);
       System.out.println(gato1.sexo);
       System.out.println(gato1.tampelaje);
       
       
       Gato gato2 = new Gato();
       gato2.nombre="Lia";
       gato2.edad=5;
       gato2.color="Gris";
       gato2.sexo="Femenino";
       gato2.tampelaje="Corto";
       
       
       System.out.println(gato2.nombre);
       System.out.println(gato2.edad);
       System.out.println(gato2.color);
       System.out.println(gato2.sexo);
       System.out.println(gato2.tampelaje);
       
       Lapiz lapiz1 = new Lapiz();
       lapiz1.artnum="HB";
       lapiz1.color="Rojo y negro";
       lapiz1.marca="BIC";
       lapiz1.material="Madera";
       lapiz1.tamaño=5;
       
       
       System.out.println(lapiz1.artnum);
       System.out.println(lapiz1.color);
       System.out.println(lapiz1.marca);
       System.out.println(lapiz1.material);
       System.out.println(lapiz1.tamaño);
       
       Lapiz lapiz2 = new Lapiz();
       lapiz2.artnum="2B";
       lapiz2.color="Amarillo";
       lapiz2.marca="Paper mate";
       lapiz2.material="Madera";
       lapiz2.tamaño=5;
       
       
       System.out.println(lapiz2.artnum);
       System.out.println(lapiz2.color);
       System.out.println(lapiz2.marca);
       System.out.println(lapiz2.material);
       System.out.println(lapiz2.tamaño);
    }
    
}
