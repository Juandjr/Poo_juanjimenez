
package lab15_ficherosp2_u2_juanjimenez;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    public static void crearArchivo(String Webadas){
        File archivo = new File(Webadas);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("El archivo se creo exitosamente");
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
            
            
        }
    }  
    
    public static void reEscribirArchivo(String Webadas, String contenido){
        File archivo = new File(Webadas);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.println("Webadas 👻👻");
            salida.close();
            System.out.println("El archivo se configuro exitosamente");
        }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);
            
            
        }
    }
    
    public static void leerArchivo(String Webadas, String contenido){
        File archivo = new File(Webadas);
        try{
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura  = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura  = entrada.readLine();
            }
            entrada.close();
            }catch (FileNotFoundException ex){
            ex.printStackTrace(System.out);   
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
    
    public static void eliminarArchivo(String Webadas, String contenido){
        File archivo = new File(Webadas);
        System.out.println(archivo.exists());
        archivo.delete();
        System.out.println("El archivo se elimino existosamente");
    }  
}