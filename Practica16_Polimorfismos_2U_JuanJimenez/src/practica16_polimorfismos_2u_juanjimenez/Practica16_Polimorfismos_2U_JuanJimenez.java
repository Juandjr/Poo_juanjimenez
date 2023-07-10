package practica16_polimorfismos_2u_juanjimenez;
import java.util.Scanner;

public class Practica16_Polimorfismos_2U_JuanJimenez {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        String a;
        int b;
        int c;
        double d;
        System.out.println("====Menu de opciones====");
        System.out.println("1.Triangulo");
        System.out.println("2.Cirulo");
        System.out.println("3.Cuadrado");
        System.out.println("4.Salir");
        opc = scan.nextInt();
        while(opc!=4){
            switch(opc){
                case 1: 
                    System.out.println("Ingrese el color del Triangulo: ");
                    a = scan.next();
                    System.out.println("Ingrese la base del Triangulo: ");
                    b = scan.nextInt();
                    System.out.println("Ingrese la altura del Triangulo: ");
                    c = scan.nextInt();
                    mostrarDatosFiguras(new Triangulo(a,b,c));
                    break;
                case 2:
                    System.out.println("Ingrese el color del Circulo: ");
                    a = scan.next();
                    System.out.println("Ingrese el radio del Circulo: ");
                    d = scan.nextDouble();
                    mostrarDatosFiguras(new Circulo(a,d));
                    break;
                case 3:
                    System.out.println("Ingrese el color del Cuadrado: ");
                    a = scan.next();
                    System.out.println("Ingrese el lado del Cuadrado: ");
                    b = scan.nextInt();
                    mostrarDatosFiguras(new Cuadrado(a,b));
                    break;
                default: 
                    System.out.println("Opcion no valida");
                    break;
            }
            System.out.println("====Menu de opciones====");
            System.out.println("1.Triangulo");
            System.out.println("2.Cirulo");
            System.out.println("3.Cuadrado");
            System.out.println("4.Salir");
            opc = scan.nextInt();
        }
        System.out.println("Gracias por ingresar");
    }
    //aplicando polimorfismo
    //la gran ventaja del polimorfismo es la reutilizacion del codigo
    //al forzar a todas las clases a tener el mismo formato de metodo
    //esta exprecion vale para cualquier subclase de "Figura"
    //cuyos objetos vengan aqui como parametros
    private static void mostrarDatosFiguras(Figura f){
        System.out.println("Color: "+f.getColor());
        System.out.println("Superficie: "+f.Superficie());
    }
    
}
