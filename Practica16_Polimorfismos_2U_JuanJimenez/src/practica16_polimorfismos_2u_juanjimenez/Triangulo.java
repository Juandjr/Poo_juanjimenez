
package practica16_polimorfismos_2u_juanjimenez;

public class Triangulo extends Figura {
    private int base;
    private int altura;
    
    public Triangulo(String color,int base,int altura) {
        super(color);
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double Superficie() {
    return (base * altura)/2;
    }
    
}
