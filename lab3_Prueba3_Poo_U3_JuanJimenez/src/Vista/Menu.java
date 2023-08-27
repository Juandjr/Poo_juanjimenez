
package Vista;

import Vista.Estudiantes;
import Vista.Horario;
import Vista.Profesor;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Menu extends JFrame {
    
    public Menu(){
        JFrame menuFrame = new JFrame("Menú Principal");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(1280, 720);
        menuFrame.setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu opcionesMenu = new JMenu("Opciones");
        JMenuItem estudiantesItem = new JMenuItem("Estudiantes");
        JMenuItem profesorItem = new JMenuItem("Profesor");
        JMenuItem horariosItem = new JMenuItem("Horarios");
        JMenuItem laboratorioItem = new JMenuItem("Laboratorios");

        opcionesMenu.add(estudiantesItem);
        opcionesMenu.add(profesorItem);
        opcionesMenu.add(horariosItem);
        opcionesMenu.add(laboratorioItem);
        menuBar.add(opcionesMenu);

        estudiantesItem.addActionListener(e -> openEstudiantesFrame());
        profesorItem.addActionListener(e -> openProfesorFrame());
        horariosItem.addActionListener(e -> openhorario());
        laboratorioItem.addActionListener(e -> openlab());

        menuFrame.setJMenuBar(menuBar);
        menuFrame.setVisible(true);
    }
     private static void openEstudiantesFrame() {
        SwingUtilities.invokeLater(() -> {
            Estudiantes estudiantesFrame = new Estudiantes();
            estudiantesFrame.setVisible(true);
        });
    }

    private static void openProfesorFrame() {
        SwingUtilities.invokeLater(() -> {
            Profesor profesorFrame = new Profesor();
            profesorFrame.setVisible(true);
        });
    }

    private static void openhorario() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Horario horariosFrame = new Horario();
                horariosFrame.setVisible(true);
            }
        });
    }
    
    private static void openlab() {
        SwingUtilities.invokeLater(() -> {
            Laboratorio laboratorio = new Laboratorio();
            laboratorio.setVisible(true);
        });
    }
}
