
package sistema.bancario_poo_u2;
import java.util.Scanner;

public class SistemaBancario_poo_U2 {

    public static void main(String[] args) {
        int opc;
        int retiro;
        int dinero;
        Scanner scan = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        CueLimit limite = new CueLimit();
        System.out.println("===Sistema bancario===");
        System.out.println("1.Ingresar saldo");
        System.out.println("2.Retirar saldo");
        System.out.println("3.mostrar saldo");
        System.out.println("4.Salir");
        opc = scan.nextInt();
        while(opc!= 4){
            switch (opc){
                case 1:
                    System.out.println("Ingrese el nombre de la cuenta: ");
                    cuenta1.nombre = scan.next();
                    System.out.println("Ingrese la cantidad que va a depositar: ");
                    dinero = scan.nextInt();
                    if(dinero > limite.limtCue){
                        System.out.println("no se puede depositar mas de 1000$");
                    }else{
                        cuenta1.IngreSald = dinero;
                        cuenta1.SaldoTotal=cuenta1.IngreSald;
                        System.out.println("se deposito correctamente");
                    }
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar?: ");
                    retiro = scan.nextInt();
                    cuenta1.SaldoTotal = cuenta1.SaldoTotal - retiro; 
                    if(cuenta1.SaldoTotal<0){
                        System.out.println("se retiro correctamente");
                    }else{
                        System.out.println("Fondo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Usuario: "+cuenta1.nombre);
                    System.out.println("Dinero: "+cuenta1.SaldoTotal);
                    break;
            }
        System.out.println("===Sistema bancario===");
        System.out.println("1.Ingresar saldo");
        System.out.println("2.Retirar saldo");
        System.out.println("3.mostrar saldo");
        System.out.println("4.Salir");
        opc = scan.nextInt();
        }
        
    }
    
}
