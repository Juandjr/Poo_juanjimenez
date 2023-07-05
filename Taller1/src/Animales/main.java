
package Animales;

public class main {

    public static void main(String[] args) {
        //estados buenos
        Gato gato = new Gato();
        gato.Come();
        Gato gato2 = new Gato();
        gato2.Duerme();
        Gato gato3 = new Gato();
        gato3.Corre();
        Gato gato4 = new Gato();
        gato4.Maulla();
        Perro perro = new Perro();
        perro.Come();
        Perro perro1 = new Perro();
        perro1.Duerme();
        Perro perro2 = new Perro();
        perro2.Corre();
        Perro perro3 = new Perro();
        perro3.Ladra();
        Mono mono = new Mono();
        mono.Come();
        Mono mono1 = new Mono();
        mono1.Duerme();
        Mono mono2 = new Mono();
        mono2.Corre();
        Mono mono3 = new Mono();
        mono3.Aulla();
        //estados negativos
        Gato gato1 = new Gato();
        gato1.noCome();
        Gato gato5 = new Gato();
        gato5.noDuerme();
        Gato gato6 = new Gato();
        gato6.noCorre();
        Gato gato7 = new Gato();
        gato7.noMaulla();
        Perro perro4 = new Perro();
        perro4.noCome();
        Perro perro5 = new Perro();
        perro5.noDuerme();
        Perro perro6 = new Perro();
        perro6.noCorre();
        Perro perro7 = new Perro();
        perro7.noLadra();
        Mono mono4 = new Mono();
        mono4.noCome();
        Mono mono5 = new Mono();
        mono5.noDuerme();
        Mono mono6 = new Mono();
        mono6.noCorre();
        Mono mono7 = new Mono();
        mono7.Aulla();
        System.out.println("===Estado positivo===");
        System.out.println("-Gato");
        System.out.println(gato.estado);
        System.out.println(gato2.estado);
        System.out.println(gato3.estado);
        System.out.println(gato4.estado);
        System.out.println("-Perro");
        System.out.println(perro.estado);
        System.out.println(perro1.estado);
        System.out.println(perro2.estado);
        System.out.println(perro3.estado);
        System.out.println("-Mono");
        System.out.println(mono.estado);
        System.out.println(mono1.estado);
        System.out.println(mono2.estado);
        System.out.println(mono3.estado);
        System.out.println("===Estado negativo===");
        System.out.println("-Gato");
        System.out.println(gato1.estado);
        System.out.println(gato5.estado);
        System.out.println(gato6.estado);
        System.out.println(gato7.estado);
        System.out.println("-Perro");
        System.out.println(perro4.estado);
        System.out.println(perro5.estado);
        System.out.println(perro6.estado);
        System.out.println(perro7.estado);
        System.out.println("-Mono");
        System.out.println(mono4.estado);
        System.out.println(mono5.estado);
        System.out.println(mono6.estado);
        System.out.println(mono7.estado);

    }
    
}
