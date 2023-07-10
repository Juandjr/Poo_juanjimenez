
package practica16_polimorfismos_2u_juanjimenez;

public class Cuadrado extends Figura {
    private int lado;
    
    public Cuadrado(String color,int lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double Superficie() {
        return lado * lado;
    }   
}
