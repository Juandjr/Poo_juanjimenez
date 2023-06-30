
package sistema.bancario_poo_u2;

public class Cuenta {
    //ingreso y salida
    String nombre;
    int IngreSald;
    int SaldoTotal;
    int cuentaID[];
    
    
    
    public String getNombre(){
        return nombre;
    }
    public int getSaldoTotal(){
        return SaldoTotal;
    }

    public int getIngreSald() {
        return IngreSald;
    }

    public void setIngreSald(int IngreSald) {
        this.IngreSald = IngreSald;
    }

    public int[] getCuentaID() {
        return cuentaID;
    }

    public void setCuentaID(int[] cuentaID) {
        this.cuentaID = cuentaID;
    }

}
