package Evaluacion2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		String a, b,c,d,e,f;
		double g;
		int h,i,j,k;
		System.out.println("===Menu de opciones===");
		System.out.println("1. Administrar personal");
		System.out.println("2. Ingresar laboratorios");
		System.out.println("3. Asignar Horarios a Asignaturas");
		System.out.println("4. Mostrar la información de los laboratorios.");
		System.out.println("5. Salir");
		opc = sc.nextInt();
		while (opc != 5) {
			switch (opc) {
			case 1:
				System.out.println("===Administrar personal===");
				System.out.println("1. Ingresar personal");
				System.out.println("2. ver personal");
				System.out.println("3. Salir");
				h = sc.nextInt();
				while(h!=3) {
					switch (h) {
					case 1:
						System.out.println("===Ingresar personal===");
						System.out.println("1. Estudiante");
						System.out.println("2. Profesor");
						System.out.println("3. Salir");
						h = sc.nextInt();
						while(h!=3) {
							switch (h) {
							case 1:
								System.out.println("Ingrese el nombre del estudiante: ");
								a = sc.next();
								System.out.println("Ingrese la edad del estudiante: ");
								j = sc.nextInt();
								System.out.println("Ingrese el estado civil del estudiante: ");
								b = sc.next();
								Estudiantes estudiante1 = new Estudiantes(a,j,b);
								System.out.println("Guardado con exito");
								break;
							case 2:
								System.out.println("Ingrese el nombre del profesor: ");
								c = sc.next();
								System.out.println("Ingrese la edad del profesor: ");
								k = sc.nextInt();
								System.out.println("Ingrese el cargo del profesor: ");
								d = sc.next();
								Profesor profesor1 = new Profesor(c,k,d);
								System.out.println("Guardado con exito");
								break;
								default: 
									System.out.println("Opcion no valida");
									break;
							}
							System.out.println("===Ingresar personal===");
							System.out.println("1. Estudiante");
							System.out.println("2. Profesor");
							System.out.println("3. Salir");
							h = sc.nextInt();
					}
					case 2:
						System.out.println("==Estudiante==");

						break;
				}
				
				
			}
		}
			System.out.println("===Menu de opciones===");
			System.out.println("1. Administrar personal");
			System.out.println("2. Ingresar laboratorios");
			System.out.println("3. Asignar Horarios a Asignaturas");
			System.out.println("4. Mostrar la información de los laboratorios.");
			System.out.println("5. Salir");
			opc = sc.nextInt();
	}

}
}