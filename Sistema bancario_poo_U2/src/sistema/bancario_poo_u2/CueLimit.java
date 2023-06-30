package sistema.bancario_poo_u2;

public class CueLimit extends Cuenta{
    //clase que controla el limite que saca el usuario
    int limtCue = 1000;

    public int getLimtCue() {
        return limtCue;
    }

    public void setLimtCue(int limtCue) {
        this.limtCue = limtCue;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getIngreSald() {
        return IngreSald;
    }

    @Override
    public void setIngreSald(int IngreSald) {
        this.IngreSald = IngreSald;
    }

    @Override
    public int getSaldoTotal() {
        return SaldoTotal;
    }

    public void setSaldoTotal(int SaldoTotal) {
        this.SaldoTotal = SaldoTotal;
    }

    @Override
    public int[] getCuentaID() {
        return cuentaID;
    }

    @Override
    public void setCuentaID(int[] cuentaID) {
        this.cuentaID = cuentaID;
    }

}
