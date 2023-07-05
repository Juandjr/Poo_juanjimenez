package claseabstracta;

public class Circulo extends Figura {
	double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio, double x, double y) {
		super(x,y);
		this.radio = radio;
	}
	
	@Override
	public double CalcularArea() {
		double pi = 3.14156;
		double resul= radio * pi * pi;
		return resul;
	}
}
