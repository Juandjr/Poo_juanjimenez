package poo_2doparcial_practica2_juanjimenez;

import java.util.ArrayList;
import java.io.*;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.util.List;
public class Poo_2doParcial_Practica2_JuanJimenez {

    public static void main(String[] args) {
        // TODO code application logic here
        List <Persona> persona = new ArrayList<Persona>();
        persona.add(new Persona("aaa L","xd@mail.com",123456));
        persona.add(new Persona("Juan J","d.romerohd@mail.com",123456));
        persona.add(new Persona("CivilJuan Horse","j.romerohd@mail.com",123456));
        persona.add(new Persona("Mateo J","gkarirome@mail.com",123456));
        ImportarCSV();
        ExportarCSV(persona);
        
    }

    private static void ExportarCSV(List<Persona> persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void ImportarCSV() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}
