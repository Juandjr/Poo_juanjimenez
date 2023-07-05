
package lab2_2doparcial_juanjimenez;

public class Horario {
    private boolean disponible;

    public Horario() {
        this.disponible = true;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void asignarHorario() {
        if (disponible) {
            disponible = false;
            System.out.println("Horario asignado correctamente");
        } else {
            System.out.println("Horario no disponible");
        }
    }
}

