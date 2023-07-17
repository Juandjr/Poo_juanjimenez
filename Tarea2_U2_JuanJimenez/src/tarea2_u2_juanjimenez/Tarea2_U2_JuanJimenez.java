
package tarea2_u2_juanjimenez;

public class Tarea2_U2_JuanJimenez {

    public static void main(String[] args) {
        Director director = new Director("Juan Jimeenez", 18, "12+ meses", 2500.0, "Ventas", 25);
        Operario operario = new Operario("Luisa Perez", 35, "24+ meses", 1000.0, 3);

        director.incentivar();
        operario.incentivar();
        operario.actualizarNivel();

        System.out.println("El salario del director es de: " + director.getSalario());
        System.out.println("El salario del operador es de: " + operario.getSalario()+" y es de nivel "+ operario.getNivel()+" de seguridad");
    }
}
    
    

