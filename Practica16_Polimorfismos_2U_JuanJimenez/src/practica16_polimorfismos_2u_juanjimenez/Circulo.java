
package practica16_polimorfismos_2u_juanjimenez;

public class Circulo extends Figura {
    private double radio;
    
    public Circulo(String color,double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double Superficie() {
        return Math.PI * radio * radio;
    }
    
    
}
