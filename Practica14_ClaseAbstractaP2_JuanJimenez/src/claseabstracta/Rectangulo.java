package claseabstracta;

public class Rectangulo implements Figura,Dibujar {
	double altura;
	double base;
	
	public Rectangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	}

	@Override
	public void Dibujar() {
		System.out.println("Vas a dibujar");
		
	}

	@Override
	public double CalcularArea() {
		double resul = altura * base;
		return resul;
	}
	
}
