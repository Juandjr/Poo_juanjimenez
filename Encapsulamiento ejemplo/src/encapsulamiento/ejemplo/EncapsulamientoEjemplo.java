
package encapsulamiento.ejemplo;

public class EncapsulamientoEjemplo {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Jimenez");
        persona.setEdad(18);
        persona.setCedula(235063461);
        System.out.println("Nombre ingresado: " + persona.getNombre());
        System.out.println("Apellido ingresado: "+ persona.getApellido());
        System.out.println("Edad ingresada: " + persona.getEdad());
        System.out.println("Cedula ingresada: "+ persona.getCedula());
    }
}
    
    

