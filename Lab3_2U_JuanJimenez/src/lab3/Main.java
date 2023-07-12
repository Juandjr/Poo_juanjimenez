package lab3;

public class Main {

	public static void main(String[] args) {
		System.out.println("======Productos estandar=====");
		//objetos que llaman al metodo Estandar y le dan valores propios
		Estandar estandar1 = new Estandar("Doritos",0.50,"Seccion1");
		//imprecion del precio total de la compra
		System.out.println("El total de la compra de "+estandar1.nombre+" fue: "+estandar1.obtenerPrecioPedido(0));
		//imprecion del precio total de la compra
		Estandar estandar2 = new Estandar("Mouse",9.99,"Seccion2");
		System.out.println("El total de la compra de "+estandar2.nombre+" fue: "+estandar2.obtenerPrecioPedido(0));
		System.out.println("======Productos Ofertados======");
		//objetos que llaman al metodo Ofertado y le dan valores propios
		Ofertado ofertado1 = new Ofertado("Jean",5.50,2);
		//imprecion del precio total de la compra con su respectivo descuento
		System.out.println("El total de la compra de "+ofertado1.nombre+" fue: "+ofertado1.obtenerPrecioPedido(0));
		Ofertado ofertado2 = new Ofertado("Camiseta",7.50,2);
		//imprecion del precio total de la compra con su respectivo descuento
		System.out.println("El total de la compra de "+ofertado2.nombre+" fue: "+ofertado2.obtenerPrecioPedido(0));
		Ofertado ofertado3 = new Ofertado("Gorra",4.99,2);
		//imprecion del precio total de la compra con su respectivo descuento
		System.out.println("El total de la compra de "+ofertado3.nombre+" fue: "+ofertado3.obtenerPrecioPedido(0));
	}

}
