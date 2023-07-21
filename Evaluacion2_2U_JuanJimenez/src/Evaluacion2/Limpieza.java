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
		System.out.println("===Comisiones que realizo el Trabajador===");
		System.out.println("1.Llego pronto");
		System.out.println("2.Cumple sus actividades a tiempo");
		System.out.println("3.Ayuda a sus compañeros");
		System.out.println("4.Boto la basura");
		System.out.println("5.Realizo horas extras");
		System.out.println("6.salir");
		opc=sc.nextInt();
		while(comisiones!=6) {
			switch (comisiones) {
			case 1:
				System.out.println("Se le añadio un valor extra de 50$ por la comision");
				pagoTotal=sueldo+50;
				break;
			case 2:
				System.out.println("Se le añadio un valor extra de 100$ por la comision");
				pagoTotal=sueldo+100;
				break;
			case 3:
				System.out.println("Se le añadio un valor extra de 150$ por la comision");
				pagoTotal=pagoTotal+150;
				break;
			case 4:
				System.out.println("Se le añadio un valor extra de 200$ por la comision");
				pagoTotal=pagoTotal+200;
				break;
			case 5:
				System.out.println("Se le añadio un valor extra de 250$ por la comision");
				pagoTotal=pagoTotal+250;
				break;
			default: 
				System.out.println("opcion no valida");
				break;
		}	
	}if(merito) {
		System.out.println("Se le añadio un valor extra de 100$ por su merito por hacer un exelente trabajo");
		pagoTotal=pagoTotal+100;	
	}
	System.out.println("Comisiones agregadas al valor final correctamente");
	return pagoTotal;
}
}
