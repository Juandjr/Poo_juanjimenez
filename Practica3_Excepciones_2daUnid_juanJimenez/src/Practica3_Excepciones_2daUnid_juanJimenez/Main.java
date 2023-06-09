package Practica3_Excepciones_2daUnid_juanJimenez;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ArithmeticException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String nombre = br.readLine();
			int div = 8/0;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ArithmeticException es) {
				System.out.println("No se puede dividir entre 0");
			
		}
	}

}
