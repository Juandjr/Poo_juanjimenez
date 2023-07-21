package Evaluacion2;

import java.util.Scanner;

//clase hija que extiende a la clase Padre personal
public class Administrativo extends Personal {
	//Atributo unico de la clase hija
	protected boolean supervisa;
	int opc;
	Scanner sc = new Scanner(System.in);
	//el constructor de la clase hija que contiene los metodos de la clase padre y añade la propia de la clase hija
	public Administrativo(String nombre, int edad, double sueldo, int comisiones, int rango, boolean supervisa) {
		super(nombre, edad, sueldo, comisiones, rango);
		this.supervisa=supervisa;
	}
	//metodos getter y setter de la clase hija
	public boolean getSupervisa() {
		return supervisa;
	}

	public void setSupervisa(boolean supervisa) {
		this.supervisa = supervisa;
	}
	//metodo que hereda de la clase padre ques sirve para calcular la forma de pagar el sueldo del Administrativo
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
	}if(supervisa) {
            System.out.println("Se le añadio un valor extra de 100$ por supervisar");
	    pagoTotal=pagoTotal+100;	
	}
	System.out.println("Comisiones agregadas al valor final correctamente");
	return pagoTotal;
	}	
}

