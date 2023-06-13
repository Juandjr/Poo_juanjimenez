package practica7_herencia_2doparcial_juanjimenez;

public class motocicleta extends Vehiculo {
    boolean patada;
     
    @Override
    public void encendido(){
        encendido = true;
        estado ="Vehiculo encendido";
    }
    @Override
    public void apagado(){
        encendido = false;
        estado ="Vehiculo apagado";
    }
}
