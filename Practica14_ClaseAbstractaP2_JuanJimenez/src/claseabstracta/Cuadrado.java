package claseabstracta;

public class Cuadrado implements Figura,Dibujar {
	double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	

	@Override
	public double CalcularArea() {
		double resul = lado * lado;
		return resul;
	}

	@Override
	public void Dibujar() {
		System.out.println("Vas a dibujar");
		
	}

	
}
