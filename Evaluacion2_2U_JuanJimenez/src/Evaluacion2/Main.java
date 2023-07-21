package Evaluacion2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  Scanner bool2 = new Scanner(System.in);
		  Scanner bool3 = new Scanner(System.in);
		  String a,b;
		  int d,f,h = 0;
		  boolean c;
		  double g,k=0;
		  int opc,opc1,opc2;
		  
		  System.out.println("========Sistema administrativo personal===========");
		  System.out.println("1.Ingresar datos de Personal para revisar Salarios");
		  System.out.println("2.salir");
		  opc = sc.nextInt();
		  while(opc!=2) {
			  switch(opc) {
			  case 1:
				  System.out.println("===Ingresar datos de Personal para revisar Salarios===");
				  System.out.println("1.Docente");
				  System.out.println("2.Tecnico");
				  System.out.println("3.Administrativo");
				  System.out.println("4.Limpieza");
				  System.out.println("5.salir");
				  opc1=sc.nextInt();
				  while (opc1!=5) {
					  switch(opc1) {
					  case 1:
						  System.out.println("Ingrese el nombre del Docente: ");
						  a = sc.next();
						  System.out.println("Ingrese la edad del Docente: ");
						  d = sc.nextInt();
						  System.out.println("Ingrese el sueldo del Docente: ");
						  g = sc.nextDouble();
						  System.out.println("Ingrese si el Docente realizo comisiones(1: si || 0: no): ");
						  System.out.println("===Comisiones que realizo el Trabajador===");
							System.out.println("1.Llego pronto");
							System.out.println("2.Cumple sus actividades a tiempo");
							System.out.println("3.Ayuda a sus compañeros");
							System.out.println("4.Boto la basura");
							System.out.println("5.Realizo horas extras");
							System.out.println("6.salir");
							opc2=sc.nextInt();
							while(opc2!=6) {
								switch (opc2) {
								case 1:
									h = 1;
									break;
								case 2:
									h =2;
									break;
								case 3:
									h =3;
									break;
								case 4:
									h =4;
									break;
								case 5:
									h =5;
									break;
								default: 
									System.out.println("opcion no valida");
									break;
							}
								System.out.println("Ingrese si el Docente realizo comisiones(1: si || 0: no): ");
								  System.out.println("===Comisiones que realizo el Trabajador===");
									System.out.println("1.Llego pronto");
									System.out.println("2.Cumple sus actividades a tiempo");
									System.out.println("3.Ayuda a sus compañeros");
									System.out.println("4.Boto la basura");
									System.out.println("5.Realizo horas extras");
									System.out.println("6.salir");
									opc2=sc.nextInt();
						}
						System.out.println("Comisiones agregadas al valor final correctamente");
						  System.out.println("Ingrese el rango del Docente (del 1 al 6): ");
						  f = sc.nextInt();
						  System.out.println("Ingrese la asignatura del Docente: ");
						  b = sc.next();
						  Docente docente = new Docente(a,d,g,h,f,b);
						  System.out.println("Se mostrara los datos del Docente ingresado y su sueldo: ");
						  System.out.println("El nombre del docente: "+docente.nombre);
						  System.out.println("La edad del docente: "+docente.edad);
						  System.out.println("El rango del docente es: "+docente.rango);
						  System.out.println("El docente da la asignatura de: "+docente.asignatura);
						  System.out.println("El sueldo total del docente es de: "+docente.metodoDePago(k));
						  break;
					  case 2:
						  System.out.println("Ingrese el nombre del Tecnico: ");
						  a = sc.next();
						  System.out.println("Ingrese la edad del Tecnico: ");
						  d = sc.nextInt();
						  System.out.println("Ingrese el sueldo del Tecnico: ");
						  g = sc.nextDouble();
						  System.out.println("Ingrese si el Tecnico realizo comisiones(1: si || 0: no): ");
						  h = sc.nextInt();
						  System.out.println("Ingrese el rango del Tecnico (del 1 al 6): ");
						  f = sc.nextInt();
						  System.out.println("Ingrese la profesion del Tecnico: ");
						  b = sc.next();
						  Tecnico tecnico = new Tecnico(a,d,g,h,f,b);
						  System.out.println("Se mostrara los datos del tecnico ingresado y su sueldo: ");
						  System.out.println("El nombre del docente: "+tecnico.nombre);
						  System.out.println("La edad del docente: "+tecnico.edad);
						  System.out.println("El rango del docente es: "+tecnico.rango);
						  System.out.println("La profesion del tecnico es: "+tecnico.profesion);
						  System.out.println("El sueldo total del tecnico es de: "+tecnico.metodoDePago(k));
						  break;
					  case 3:
						  System.out.println("Ingrese el nombre del Administrativo: ");
						  a = sc.next();
						  System.out.println("Ingrese la edad del Administrativo: ");
						  d = sc.nextInt();
						  System.out.println("Ingrese el sueldo del Administrativo: ");
						  g = sc.nextDouble();
						  System.out.println("Ingrese si el Administrativo realizo comisiones(1: si || 0: no): ");
						  h = sc.nextInt();
						  System.out.println("Ingrese el rango del Administrativo (del 1 al 6): ");
						  f = sc.nextInt();
						  System.out.println("Ingrese si el Administrativo superviso (1: si || 0: no): ");
						  c = bool3.hasNext();
						  Administrativo adm = new Administrativo(a,d,g,h,f,c);
						  System.out.println("Se mostrara los datos del administrativo ingresado y su sueldo: ");
						  System.out.println("El nombre del administrativo: "+adm.nombre);
						  System.out.println("La edad del administrativo: "+adm.edad);
						  System.out.println("El rango del administrativo es: "+adm.rango);
						  System.out.println("El sueldo total del administrativo es de: "+adm.metodoDePago(k));
						  break;
					  case 4:
						  System.out.println("Ingrese el nombre del de la Limpieza: ");
						  a = sc.next();
						  System.out.println("Ingrese la edad del de la Limpieza: ");
						  d = sc.nextInt();
						  System.out.println("Ingrese el sueldo del de la Limpieza: ");
						  g = sc.nextDouble();
						  System.out.println("Ingrese si el de la Limpieza realizo comisiones(1: si || 0: no): ");
						  h = sc.nextInt();
						  System.out.println("Ingrese el rango del de la Limpieza (del 1 al 6): ");
						  f = sc.nextInt();
						  System.out.println("Ingrese si el de la Limpieza realizo algun merito por su trabajo (1: si || 0: no): ");
						  c = bool2.hasNext();
						  Limpieza limpieza = new Limpieza(a,d,g,h,f,c);
						  System.out.println("Se mostrara los datos del de la Limpieza ingresado y su sueldo: ");
						  System.out.println("El nombre del de la Limpieza: "+limpieza.nombre);
						  System.out.println("La edad del de la Limpieza: "+limpieza.edad);
						  System.out.println("El rango ddel de la Limpieza es: "+limpieza.rango);
						  System.out.println("El sueldo total del de la Limpieza es de: "+limpieza.metodoDePago(k));
						  break;
					  default:
						  System.out.println("Opcion no valida");
						  break;
					  }
					  System.out.println("===Ingresar datos de Personal para revisar Salarios===");
					  System.out.println("1.Docente");
					  System.out.println("2.Tecnico");
					  System.out.println("3.Administrativo");
					  System.out.println("4.Limpieza");
					  System.out.println("5.salir");
					  opc1=sc.nextInt();
				  }
			  }
			  System.out.println("========Sistema administrativo personal===========");
			  System.out.println("1.Ingresar datos de Personal para revisar Salarios");
			  System.out.println("2.salir");
			  opc = sc.nextInt();
		  }
		  System.out.println("Gracias por ingresar al programa.😀");
	}
}
