package lab3;
//clase que contiene a los productos "estandar" que hereda la clase Productos
public class Estandar extends Productos {
	//declaracion de los atributos de la clase hija "Estandar"
	String seccion;
	double precioTotal;
	//metodo heredado de la clase Productos agregando el valor propio de Estandar
	public Estandar(String nombre, double precio,String seccion) {
		super(nombre, precio);
		this.seccion = seccion;
	}
	//metodo que retorna el valor de seccion;
	public String getSeccion() {
		return seccion;
	}
	//metodo que retorna el precio total del pedido por medio de "if" y realiza el descuento dependiendo de las cantidades
	public double obtenerPrecioPedido(double prePedido){
		System.out.println("Ingrese las unidades pedidas del producto: ");
		unidades = sc.nextInt();
		precioTotal = unidades * precio;
		if(unidades>5) {
			prePedido = precioTotal * 0.9;
		}else {
			prePedido = precioTotal;				
		}
		return prePedido;
	}
}
