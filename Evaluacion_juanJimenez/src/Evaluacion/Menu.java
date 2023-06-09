package Evaluacion;
import java.util.Scanner;
public class Menu {
    Scanner scanner = new Scanner(System.in);
    Producto[] productos = new Producto[4];
    Proovedor[] proovedores = new Proovedor[2];
    Pedidos[] pedidos = new Pedidos[2];
    int opc;
	public void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("====MENU DE OPCIONES====");
		System.out.println("1. Productos");
		System.out.println("2. Proveedores");
		System.out.println("3. Nuevo pedido.");
		System.out.println("4. Pedido mayor.");
		System.out.println("5. Total facturado.");
		System.out.println("6. Salir");
		opc = Integer.parseInt(sc.nextLine());
		while(opc!=6) {
			switch(opc) {
			case 1:
				for (int i = 0; i < productos.length; i++) {
                                System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
                                String nombre = scanner.next();
                                productos[i] = new Producto(nombre);
                                }
				break;
			case 2:
				for (int i = 0; i < proovedores.length; i++) {
                                System.out.print("Ingrese el nombre del proveedor " + (i + 1) + ": ");
                                String nombre = scanner.next();
                                proovedores[i] = new Proovedor(nombre); 
                                        }
				break;
			case 3:
				for (int i = 0; i < pedidos.length; i++) {
                                System.out.print("Ingrese el nombre del producto del pedido " + (i + 1) + ": ");
                                String nombreProducto = scanner.next();
                                Producto producto = null;
                                for (Producto p : productos) {
                                   if (p.getNombre().equals(nombreProducto)) {
                                   producto = p;
                                   break;
                                   }
                                }
                                System.out.print("Ingrese el nombre del proveedor del pedido " + (i + 1) + ": ");
                                String nombreProveedor = scanner.next();
                                Proovedor proovedor = null;
                                    for (Proovedor p : proovedores) {
                                    if (p.getNombre().equals(nombreProveedor)) {
                                    proovedor = p;
                                    break;
                                   }
                                }
                                System.out.print("Ingrese el precio unitario del pedido " + (i + 1) + ": ");
                                double precioUnitario = scanner.nextDouble();
                                System.out.print("Ingrese la cantidad de unidades del pedido " + (i + 1) + ": ");
                                int unidades = scanner.nextInt();
                                pedidos[i] = new Pedidos(producto, proovedor, precioUnitario, unidades);
                                }
				break;
			case 4:
				Pedidos pedidoMayor = null;
                                for (Pedidos p : pedidos) {
                                if (pedidoMayor == null || p.getUnidades() > pedidoMayor.getUnidades()) {
                                   pedidoMayor = p;
                                   }
                                }
                                System.out.println("Pedido con mas unidades:");
                                System.out.println(pedidoMayor);
				break;
			case 5:
				double totalFacturado = 0;
                                for (Pedidos p : pedidos) {
                                   totalFacturado += p.getPrecioUnitario() * p.getUnidades();
                                }
                                System.out.println("Total facturado: " + totalFacturado);
				break;
			default: 
				System.out.println("Opcion no valida");
				break;
			}
			System.out.println("====MENU DE OPCIONES====");
			System.out.println("1. Productos");
			System.out.println("2. Proveedores");
			System.out.println("3. Nuevo pedido.");
			System.out.println("4. Pedido mayor.");
			System.out.println("5. Total facturado.");
			System.out.println("6. Salir");
			opc = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Gracias por ingresar");
	}


}

