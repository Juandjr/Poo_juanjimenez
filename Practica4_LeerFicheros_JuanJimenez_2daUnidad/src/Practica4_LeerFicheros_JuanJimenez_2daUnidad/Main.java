package Practica4_LeerFicheros_JuanJimenez_2daUnidad;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ESPE\\Documents\\webadas.txt"));
		String linea;
			try {
				while((linea=br.readLine())!=null) {
					System.out.println(linea);
				
				
}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}

