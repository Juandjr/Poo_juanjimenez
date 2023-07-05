
package Animales;

public class Mono extends Animales {
    boolean aulla;
    
    @Override
    public void Come(){
        come = true;
        estado = "Mono si come";
    }
    
    @Override
    public void noCome(){
        come = false;
        estado = "Mono no come";
    }

    @Override
    public void Duerme(){
        duerme = true;
        estado = "Mono si duerme";
    }
    
    @Override
    public void noDuerme(){
        duerme = false;
        estado = "Mono no duerme";
    }
    
    @Override
    public void Corre(){
        corre = true;
        estado = "Mono si corre";
    }
    
    @Override
    public void noCorre(){
        corre = false;
        estado = "Mono no corre";
    }
    
    public void Aulla(){
        aulla = true;
        estado = "Mono si ladra";
    }
    
    public void noAulla(){
        aulla = false;
        estado = "Mono no ladra";
    }
}
