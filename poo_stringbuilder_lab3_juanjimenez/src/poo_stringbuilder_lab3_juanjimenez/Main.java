package poo_stringbuilder_lab3_juanjimenez;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		//Objeto para pedir y leer el dato por consola
				//asociado a System. in al teclado
		Scanner sc = new Scanner(System.in)) {
			//variable string donde s eva guardar la cadena a crear
			String cad;
			//Creamos el objeto Stringbuilder
			//llamaos una variable aux donde guardamos la cadena invertida
			//la asociamos a una cadena vacia
			StringBuilder aux=new StringBuilder("");
			//le pedimos al usuario que introdusca cadena 
			System.out.println("Introduce una cadena");;
			//La vamos a guardar en la variable cad llamamos al objeto nexline
			cad=sc.nextLine();
			//hay que recorrerla en orden inverso desde la ultima posicion a la 1ra
			//Usamos un "for" iniciamos desde el ultimo usando length
			//sacamos caracter por caracter señalada a StringBuilder
			//entramos a "for" se va decrementando
			for(int i=cad.length()-1;i>-1;i--) {
				//sacamos caracter a caracter con el metodo charAt
				//nos lo pone en el aux
				aux.append(cad.charAt(i));
			}
			//para mostrar metodo toString de StringBuilder
			//nos devuelve la cadena invertida
			System.out.println(aux.toString());
		}
	}

}
