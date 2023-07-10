
package practica16_polimorfismos_2u_juanjimenez;

public abstract class Figura {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Figura(String color) {
        super();
        this.color = color;
    }
    
    public abstract double Superficie();
       
}
