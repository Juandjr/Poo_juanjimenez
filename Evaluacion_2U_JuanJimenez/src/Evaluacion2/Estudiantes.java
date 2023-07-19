package Evaluacion2;

public class Estudiantes extends Personal{
	String estado;
	public Estudiantes(String nombre, int edad,String estado) {
		super(nombre, edad);
		this.estado=estado;
	}
	
	public String getEstado() {
		return estado;
	}
}
