
package lab2_2doparcial_juanjimenez;
import java.util.Scanner;

public class Lab2_2doParcial_JuanJimenez {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir cantidad de laboratorios
        System.out.print("Ingrese la cantidad de laboratorios: ");
        int cantidadLaboratorios = scanner.nextInt();
        scanner.nextLine();

        // Crear arreglo de laboratorios
        Laboratorio[] laboratorios = new Laboratorio[cantidadLaboratorios];

        // Llenar arreglo de laboratorios
        for (int i = 0; i < cantidadLaboratorios; i++) {
            System.out.println("Ingrese los datos del laboratorio " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Capacidad: ");
            int capacidad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Equipos: ");
            String[] equipos = scanner.nextLine().split(",");
            System.out.print("Espacio: ");
            int espacio = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Lugar: ");
            String lugar = scanner.nextLine();

            if (espacio != 0) {
                laboratorios[i] = new Laboratorio1(nombre, capacidad, equipos, espacio);
            } else if (!lugar.isEmpty()) {
                laboratorios[i] = new Laboratorio2(nombre, capacidad, equipos, lugar);
            } else {
                laboratorios[i] = new Laboratorio(nombre, capacidad, equipos);
            }
        }

        // Pedir cantidad de asignaturas
        System.out.print("Ingrese la cantidad de asignaturas: ");
        int cantidadAsignaturas = scanner.nextInt();
        scanner.nextLine();

        // Crear arreglo de asignaturas
        Asignatura[] asignaturas = new Asignatura[cantidadAsignaturas];

        // Llenar arreglo de asignaturas
        for (int i = 0; i < cantidadAsignaturas; i++) {
            System.out.println("Ingrese los datos de la asignatura " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Horario: ");
            int horario = scanner.nextInt();
            scanner.nextLine();

            // Mostrar lista de laboratorios disponibles
            System.out.println("Laboratorios disponibles:");
            for (int j = 0; j < cantidadLaboratorios; j++) {
                System.out.println((j + 1) + ". " + laboratorios[j].getNombre());
            }

            // Pedir laboratorio asignado
            System.out.print("Seleccione el laboratorio asignado: ");
            int laboratorioIndex = scanner.nextInt() - 1;
            scanner.nextLine();

            asignaturas[i] = new Asignatura(nombre, horario, laboratorios[laboratorioIndex]);
            System.out.println("Laboratorio asignado correctamente");
        }
    }
}
