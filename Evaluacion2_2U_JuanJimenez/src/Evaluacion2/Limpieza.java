package Evaluacion2;

import java.util.Scanner;

//clase hija que extiende a la clase Padre personal
public class Limpieza extends Personal {
	//Atributo unico de la clase hija
	protected boolean merito;
	int opc;
	Scanner sc = new Scanner(System.in);
	//el constructor de la clase hija que contiene los metodos de la clase padre y añade la propia de la clase hija
	public Limpieza(String nombre, int edad, double sueldo, int comisiones, int rango, boolean merito) {
		super(nombre, edad, sueldo, comisiones, rango);
		this.merito=merito;
	}
	//metodos getter y setter de la clase hija
	public boolean getMerito() {
		return merito;
	}

	public void setMerito(boolean merito) {
		this.merito = merito;
	}
	//metodo que se heredo de la clase padre que elabora la funcion para devolver el sueldo a pagar del de la limpieza
	@Override
	public double metodoDePago(double pagoTotal) {
	pagoTotal=sueldo;
	if (comisiones > 0 && comisiones <2) {
		pagoTotal+=pagoTotal+50;
                       System.out.println("Se le añadio un valor extra de "+(pagoTotal-sueldo)+"$ por hacer comisiones");
	}if (comisiones > 1 && comisiones <3) {
		pagoTotal+=pagoTotal+100;
                System.out.println("Se le añadio un valor extra de "+(pagoTotal-sueldo)+"$ por hacer comisiones");
	}if (comisiones > 2 && comisiones <4) {
		pagoTotal+=pagoTotal+150;
                System.out.println("Se le añadio un valor extra de "+(pagoTotal-sueldo)+"$ por hacer comisiones");
	}if (comisiones > 3 && comisiones <5) {
        	pagoTotal+=pagoTotal+200;
                System.out.println("Se le añadio un valor extra de "+(pagoTotal-sueldo)+"$ por hacer comisiones");
	}if (comisiones > 4 && comisiones <6) {		
		pagoTotal+=pagoTotal+250;
                System.out.println("Se le añadio un valor extra de "+(pagoTotal-sueldo)+"$ por hacer comisiones");	
	}if(merito) {
		System.out.println("Se le añadio un valor extra de 100$ por su merito por hacer un exelente trabajo");
		pagoTotal=pagoTotal+100;	
	}
	System.out.println("Comisiones agregadas al valor final correctamente");
	return pagoTotal;
}
}
