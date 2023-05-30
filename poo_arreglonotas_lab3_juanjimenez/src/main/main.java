package main;
import java.util.Scanner;
import notas1.GestionNotas;

public class main {

public static void main(String[] args) {
		// TODO Auto-generated method stub
GestionNotas gnotas = new GestionNotas();
int op;
Scanner sc=new Scanner(System.in);
double notas;

do {
	System.out.println("1. Añadir notas");
	System.out.println("2. Ver media");
	System.out.println("3. Ver aprobado");
	System.out.println("4. Salir");
	op= Integer.parseInt(sc.nextLine());
}while(op!=4);
switch(op) {
case 1: 
	System.out.println("Ingresar nota");
	notas=Double.parseDouble(sc.nextLine());
	gnotas.guardarNota(notas);
	break;
case 2:
	System.out.println("La media es: "+gnotas.media());
	break;
case 3:
	System.out.println("Aprobados"+gnotas.aprobados());
	break;
}
}
}
