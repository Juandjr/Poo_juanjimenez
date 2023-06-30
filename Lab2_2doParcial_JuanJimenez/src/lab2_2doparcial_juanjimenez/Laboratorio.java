
package lab2_2doparcial_juanjimenez;
public class Laboratorio {
    private String nombre;
    private int capacidad;
    private String[] equipos;

    public Laboratorio(String nombre, int capacidad, String[] equipos) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.equipos = equipos;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String[] getEquipos() {
        return equipos;
    }

    public void setEquipos(String[] equipos) {
        this.equipos = equipos;
    }

}