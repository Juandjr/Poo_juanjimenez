
package lab2_2doparcial_juanjimenez;

public class Laboratorio2 extends Laboratorio {
    private String lugar;

    public Laboratorio2(String nombre, int capacidad, String[] equipos, String lugar) {
        super(nombre, capacidad, equipos);
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
