package Evaluacion2;

public class Laboratorio {
	String nombre;
	int capacidad;
	String equipos;
	
	public Laboratorio(String nombre,int capacidad,String equipos) {
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.equipos = equipos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public String getEquipos() {
		return equipos;
	}
	
}
