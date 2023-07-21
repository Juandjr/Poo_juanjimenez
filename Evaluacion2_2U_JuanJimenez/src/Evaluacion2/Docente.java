package Evaluacion2;
//clase hija que extiende a la clase Padre personal
public class Docente extends Personal {
	//Atributo unico de la clase hija 
	protected String asignatura;
	int opc;
	//el constructor de la clase hija que contiene los metodos de la clase padre y añade la propia de la clase hija
	public Docente(String nombre, int edad, double sueldo, int comisiones, int rango,String asignatura) {
		super(nombre, edad, sueldo, comisiones, rango);
		this.asignatura=asignatura;
	}
	//metodos getter y setter de la clase hija
	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	//metodo que hereda de la clase padre ques sirve para calcular la forma de pagar el sueldo del Docente
	@Override
    public double metodoDePago(double pagoTotal) {
		pagoTotal=sueldo;
		if (comisiones > 0 && comisiones <2) {
			System.out.println("Se le añadio un valor extra de 50$ por ser de comisiones");
			pagoTotal=pagoTotal+50;
		}if (comisiones > 1 && comisiones <3) {
			System.out.println("Se le añadio un valor extra de 100$ por ser de comisiones");
			pagoTotal=pagoTotal+100;
		}if (comisiones > 2 && comisiones <4) {
			System.out.println("Se le añadio un valor extra de 150$ por ser de comisiones");
			pagoTotal=pagoTotal+150;
		}if (comisiones > 3 && comisiones <5) {
			System.out.println("Se le añadio un valor extra de 200$ por ser de comisiones");
			pagoTotal=pagoTotal+200;
		}if (comisiones > 4 && comisiones <6) {
			System.out.println("Se le añadio un valor extra de 250$ por ser de comisiones");
			pagoTotal=pagoTotal+250;
		}
		return pagoTotal;
	}
}
