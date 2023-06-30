
package lab2_2doparcial_juanjimenez;

public class Laboratorio1 extends Laboratorio {
   private int espacio;

    public Laboratorio1(String nombre, int capacidad, String[] equipos, int espacio) {
        super(nombre, capacidad, equipos);
        this.espacio = espacio;
    }

    // Getters and setters
    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
}


