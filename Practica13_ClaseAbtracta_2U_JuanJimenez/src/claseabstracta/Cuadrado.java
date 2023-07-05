package claseabstracta;

public class Cuadrado extends Figura {
	double lado;
	
	public Cuadrado() {
		
	}
	
	public Cuadrado(double lado, double x, double y) {
		super(x,y);
		this.lado = lado;
	}
	
	@Override
	public double CalcularArea() {
		double resul = lado * lado;
		return resul;
	}

	
}
