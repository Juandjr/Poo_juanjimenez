
package tarea2_u2_juanjimenez;

public class Director extends Empleado {
    private String departamento;
    private int personal;

    public Director(String nombre, int edad, String fechaIngreso, double salario, String departamento, int personal) {
        super(nombre, edad, fechaIngreso, salario);
        this.departamento = departamento;
        this.personal = personal;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getPersonal() {
        return personal;
    }

    public void setPersonal(int personal) {
        this.personal = personal;
    }

    @Override
    public void incentivar() {
        if (getFechaIngreso().equals("30+ meses") && getPersonal() > 20) {
            setSalario(getSalario() + (2 * BONO));
        } else if (getFechaIngreso().equals("30+ meses") || getPersonal() > 20) {
            setSalario(getSalario() + BONO);
        }
    }
}

