package practica7_herencia_2doparcial_juanjimenez;

public class Automovil extends Vehiculo{
    boolean parabrisas;
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
