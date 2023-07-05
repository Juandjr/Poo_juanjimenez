package claseabstracta;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int opc;
		double a = 0;
		double b=0;
		System.out.println("==Menu de opciones==");
		System.out.println("1.Cuadrado");
		System.out.println("2.Triagulo");
		System.out.println("3.Rectangulo");
		System.out.println("4.Salir");
		opc = scanner.nextInt();
		while(opc!=4) {
			switch(opc) {
			case 1:
				System.out.println("Ingrese el valor de lado del cuadrado: ");
				a = scanner.nextDouble();
				Cuadrado cuadrado = new Cuadrado(a);
				cuadrado.CalcularArea();
				System.out.println("El Area del cuadrado es: "+cuadrado.CalcularArea());		
				break;
			case 2:
				System.out.println("Ingrese el valor de radio del circulo: ");
				a = scanner.nextDouble();
				Circulo circulo = new Circulo(a);
				circulo.CalcularArea();
				System.out.println("El Area del circulo es: "+circulo.CalcularArea());
				break;
			case 3:
				System.out.println("Ingrese el valor de altura del rectangulo: ");
				a = scanner.nextDouble();
				System.out.println("Ingrese el valor de base del rectangulo: ");
				b = scanner.nextDouble();
				Rectangulo recta = new Rectangulo(a, b);
				recta.CalcularArea();
				System.out.println("El Area del Rectangulo es: "+recta.CalcularArea());
				break;			
				default:
					System.out.println("Opcion no valida");
					break;
			}
			System.out.println("==Menu de opciones==");
			System.out.println("1.Cuadrado");
			System.out.println("2.Triagulo");
			System.out.println("3.Rectangulo");
			System.out.println("4.Salir");
			opc = scanner.nextInt();
		}
		System.out.println("Gracias por ingresar");
	}

}
