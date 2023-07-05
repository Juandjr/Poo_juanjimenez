
package Animales;

public class Animales {
    boolean come;
    boolean duerme;  
    boolean corre;
    String estado;

    public void Come(){
        come = true;
        estado = "Si come";
    }
    
    public void noCome(){
        come = false;
        estado = "No come";
    }

    public void Duerme(){
        duerme = true;
        estado = "Si duerme";
    }
    
    public void noDuerme(){
        duerme = false;
        estado = "No duerme";
    }
    
    public void Corre(){
        corre = true;
        estado = "Si corre";
    }
    
    public void noCorre(){
        corre = false;
        estado = "No corre";
    }
}
