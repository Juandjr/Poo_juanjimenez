
package prueba_1;

public class Auto extends Vehiculo{
    String Transmision;
    boolean parabrisasOn;
    private int multas;
    
    public Auto(String placa,String marca, int numRuedas, int estado){
        super(placa, marca, numRuedas,estado);
        this.Transmision = Transmision="";
        this.parabrisasOn = false;
        this.multas = multas = 0;
    }
    
    public void OnOffParabrisas(){
        if(this.parabrisasOn){
            this.parabrisasOn = false;
            System.out.println("Se apago");
        }else{
            this.parabrisasOn = true;
            System.out.println("Se encendio");
        }
    }
    
    public void setMultas(int multas){
        this.multas = multas;
    }
    
    public void addMultas(){
        multas = 3;
    }
    
    public int getMultas(){
        return multas;
    }
    
}
