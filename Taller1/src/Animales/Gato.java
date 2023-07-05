package Animales;

public class Gato extends Animales {
    boolean maulla;
    
    @Override
    public void Come(){
        come = true;
        estado = "Gato si come";
    }
    
    @Override
    public void noCome(){
        come = false;
        estado = "Gato no come";
    }

    @Override
    public void Duerme(){
        duerme = true;
        estado = "Gato si duerme";
    }
    
    @Override
    public void noDuerme(){
        duerme = false;
        estado = "Gato no duerme";
    }
    
    @Override
    public void Corre(){
        corre = true;
        estado = "Gato si corre";
    }
    
    @Override
    public void noCorre(){
        corre = false;
        estado = "Gato no corre";
    }
    
    public void Maulla(){
        maulla = true;
        estado = "Gato si maulla";
    }
    
    public void noMaulla(){
        maulla = false;
        estado = "Gato no maulla";
    }
}
