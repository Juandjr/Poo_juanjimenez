package Evaluacion2;
abstract class Personal {
	//Atributos de la clase padre
	protected String nombre;
	protected int edad;
	protected double sueldo;
	protected int comisiones;
	protected int rango;
	
	//constructor de la clase padre que contiene los atributos del mismo.
	public Personal(String nombre, int edad,double sueldo,int comisiones,int rango) {
		this.nombre=nombre;
		this.edad=edad;
		this.sueldo=sueldo;
		this.comisiones=comisiones;
		this.rango=rango;
	}
	//metodos getter y setter que envian y obtienen los valores
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public int getComisiones() {
		return comisiones;
	}

	public void setComisiones(int comisiones) {
		this.comisiones = comisiones;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}
	//metodo que sirve para el metodo que se va a pagar al Personal
	public abstract double metodoDePago(double pagoTotal);
	
	
}
