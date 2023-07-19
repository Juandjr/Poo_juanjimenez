package Evaluacion2;

public class Laboratorio2 extends Laboratorio {
	double espacio;
	String lugar;
	
	public Laboratorio2(String nombre, int capacidad, String equipos,double espacio,String lugar) {
		super(nombre, capacidad, equipos);
		this.espacio=espacio;
		this.lugar=lugar;
	}
	
	public double getEspacio() {
		return espacio;
	}
	
	public String getLugar() {
		return lugar;
	}

}
