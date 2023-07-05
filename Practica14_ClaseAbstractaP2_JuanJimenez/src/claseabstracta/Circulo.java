package claseabstracta;

public class Circulo implements Figura, Dibujar, Rotar {
	double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	@Override
	public double CalcularArea() {
		double pi = 3.14156;
		double resul= radio * pi * pi;
		return resul;
	}

	@Override
	public void Dibujar() {
		System.out.println("Vas a dibujar");
		
	}

	@Override
	public void Rotar() {
		System.out.println("Usted va a rotar");
		
	}
	
	
}
