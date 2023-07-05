package Animales;

class Perro extends Animales {
    boolean ladra;
    
    @Override
    public void Come(){
        come = true;
        estado = "Perro si come";
    }
    
    @Override
    public void noCome(){
        come = false;
        estado = "Perro no come";
    }

    @Override
    public void Duerme(){
        duerme = true;
        estado = "Perro si duerme";
    }
    
    @Override
    public void noDuerme(){
        duerme = false;
        estado = "Perro no duerme";
    }
    
    @Override
    public void Corre(){
        corre = true;
        estado = "Perro si corre";
    }
    
    @Override
    public void noCorre(){
        corre = false;
        estado = "Perro no corre";
    }
    
    public void Ladra(){
        ladra = true;
        estado = "Perro si ladra";
    }
    
    public void noLadra(){
        ladra = false;
        estado = "Perro no ladra";
    }
}
