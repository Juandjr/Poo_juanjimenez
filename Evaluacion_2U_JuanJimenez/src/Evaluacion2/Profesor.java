package Evaluacion2;

public class Profesor extends Personal {
	String cargo;
	
	public Profesor(String nombre, int edad,String cargo) {
		super(nombre, edad);
		this.cargo=cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
}
