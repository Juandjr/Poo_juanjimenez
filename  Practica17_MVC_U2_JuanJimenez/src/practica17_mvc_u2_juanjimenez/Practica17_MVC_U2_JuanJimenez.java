package practica17_mvc_u2_juanjimenez;
import Modelo.Modelo;
import Vista.Vista;
import Control.Control;
public class Practica17_MVC_U2_JuanJimenez {

    public static void main(String[] args) {
        Modelo model = new Modelo();
        Vista vis = new Vista();
        Control con = new Control(vis,model);
        con.iniciar();
        vis.setVisible(true);
    }
    
}
