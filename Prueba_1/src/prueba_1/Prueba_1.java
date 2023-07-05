
package prueba_1;

public class Prueba_1 {

    public static void main(String[] args) {
       Auto auto = new Auto("JUJA69", "Mercedes", 4, 1);
        auto.OnOffParabrisas();
        auto.addMultas();
        System.out.println("Auto: ");
        System.out.println("Placa: " + auto.getnumPlaca());
        System.out.println("Marca: " + auto.marca);
        System.out.println("Numero de ruedas: " + auto.numRuedas);
        System.out.println("Estado: " + auto.getEstado());
        System.out.println("Transmision: " + auto.Transmision);
        System.out.println("Parabrisas encendido: " + auto.parabrisasOn);
        System.out.println("Multas: " + auto.getMultas());

        Camion camion = new Camion("JP277353", "CAT", 8, 0);
        camion.OnOffParabrisas();
        camion.setColor("Rojo");
        camion.setPeso(5000.0);
        System.out.println("Camion: ");
        System.out.println("Placa: " + camion.getnumPlaca());
        System.out.println("Marca: " + camion.marca);
        System.out.println("Numero de ruedas: " + camion.numRuedas);
        System.out.println("Estado: " + camion.getEstado());
        System.out.println("Color: " + camion.getColor());
        System.out.println("Peso: " + camion.getPeso()+" kg");
        System.out.println("Parabrisas encendido: " + camion.getParabrisasOn());
    }    
}
