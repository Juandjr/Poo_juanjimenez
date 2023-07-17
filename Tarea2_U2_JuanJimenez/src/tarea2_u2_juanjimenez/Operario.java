package tarea2_u2_juanjimenez;

public class Operario extends Empleado {
    private int nivel;

    public Operario(String nombre, int edad, String fechaIngreso, double salario, int nivel) {
        super(nombre, edad, fechaIngreso, salario);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void incentivar() {
        if (getEdad() > 30 && getNivel() > 2) {
            setSalario(getSalario() + (2 * BONO));
        } else if (getEdad() > 30 || getNivel() > 2) {
            setSalario(getSalario() + BONO);
        }
    }

    public void actualizarNivel() {
        if (getFechaIngreso().equals("2+ años") && getNivel() < 5) {
            setNivel(getNivel() + 1);
        }
    }
}

