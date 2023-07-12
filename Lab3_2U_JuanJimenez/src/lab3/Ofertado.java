package lab3;
//clase que contiene a los productos "Ofertado" que hereda la clase Productos
public class Ofertado extends Productos {
	//declaracion de los atributos de la clase hija "Ofertado"
	int dias;
	double precioTotal;
	//metodo heredado de la clase Productos agregando el valor propio de Ofertado
	public Ofertado(String nombre, double precio,int dias) {
		super(nombre, precio);
		this.dias = dias;
	}
	//metodo que retorna el valor de dias;
	public int getDias() {
		return dias;
	}
	//metodo que retorna el precio total del pedido por medio de "if" y realiza el descuento dependiendo del dia
	public double obtenerPrecioPedido(double prePedido){
		System.out.println("Ingrese las unidades pedidas del producto: ");
		unidades = sc.nextInt();
		precioTotal = unidades * precio;
		if(dias >0 && dias <2) {
			prePedido = precioTotal * 0.8;
		}if (dias>1 && dias <4) {
			prePedido = precioTotal * 0.85;				
		}if(dias>3) {
			prePedido = precioTotal * 0.9;	
		}
		return prePedido;
	}
}
