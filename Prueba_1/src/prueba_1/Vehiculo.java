
package prueba_1;

public class Vehiculo {
    String numPlaca;
    public String marca;
    public int numRuedas;
    int estado;
    
    public Vehiculo(String placa,String marca, int numRuedas, int estado){
    this.numPlaca = placa;
    this.marca = marca;
    this.numRuedas = numRuedas;
    this.estado = estado;
}
    
    public String getnumPlaca(){
        return numPlaca;
    }
    
   public void setnumPlaca(String numPlaca){
       this.numPlaca = numPlaca;
   }
   
   public void setEstado(int estado){
       this.estado = estado;
   }
   
   public int getEstado(){
       return estado;
   }
    
}
