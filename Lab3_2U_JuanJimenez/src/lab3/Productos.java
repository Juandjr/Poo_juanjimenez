package lab3;
import java.util.Scanner;
//Clase padre del programa
public class Productos {
	Scanner sc = new Scanner(System.in);
	//declaracion de los atributos de la clase padre
	int unidades;
	String nombre;
	double precio;
	//constructor principal que contiene un valor de tipo String y otro de tipo double
	public Productos(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	//metodo que retorna el valor de nombre
	public String getNombre() {
		return nombre;
	}
	//metodo que retorna el valor de precio
	public double getPrecio() {
		return precio;
	}
	//metodo base que devuelve el precioPedido de los productos.
	public double obtenerPrecioPedido(double prePedido){
		System.out.println("Ingrese las unidades pedidas del producto: ");
		unidades = sc.nextInt();
		prePedido = unidades * precio;
		return prePedido;
	}
}
