package Evaluacion2;

public class Laboratorio1 extends Laboratorio {
	String tipo;
	double espacio;
	
	public Laboratorio1(String nombre, int capacidad, String equipos,String tipo, double espacio) {
		super(nombre, capacidad, equipos);
		this.tipo = tipo;
		this.espacio = espacio;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getEspacio() {
		return espacio;
	}
}
