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
		}if(supervisa) {
			System.out.println("Se le añadio un valor extra de 100$ por supervisar");
			pagoTotal=pagoTotal+100;	
		}
		System.out.println("Comisiones agregadas al valor final correctamente");
		return pagoTotal;
	}
		
}

