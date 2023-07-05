
package prueba_1;

public class Camion extends Vehiculo {
    private String color;
    private double peso;
    private boolean parabrisasOn;
    
    public Camion(String placa,String marca, int numRuedas, int estado){
        super(placa, marca, numRuedas,estado);
        this.parabrisasOn = false;
        this.peso = peso;
        this.color = color;
    }
    
    public boolean getParabrisasOn(){
        return parabrisasOn;
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
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
}
