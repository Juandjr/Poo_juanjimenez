
package lab2_2doparcial_juanjimenez;

public class Asignatura {
    private String nombre;
    private int horario;
    private Laboratorio laboratorio;

    public Asignatura(String nombre, int horario, Laboratorio laboratorio) {
        this.nombre = nombre;
        this.horario = horario;
        this.laboratorio = laboratorio;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}

