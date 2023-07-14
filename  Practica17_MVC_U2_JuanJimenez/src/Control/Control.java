
package Control;
import Modelo.Modelo;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {
    private Vista view;
    private Modelo model;
    
    public Control(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        this.view.btnSalir.addActionListener(this);
                //.btnSalir.addActionListener(this);
    }

    public void iniciar(){
        view.setTitle("Calculadora por medio de MVC");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtN3.setText(String.valueOf(model.getV3()));
        view.txtN4.setText(String.valueOf(model.getV4()));
        view.txtN5.setText(String.valueOf(model.getV5()));
        view.txtN6.setText(String.valueOf(model.getV6()));
        view.txtResultado.setText(String.valueOf(model.sumar()));
        view.txtResultado.setText(String.valueOf(model.resta()));
        view.txtResultado.setText(String.valueOf(model.mult()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        model.setV2(Integer.valueOf(view.txtN2.getText()));
        model.setV3(Integer.valueOf(view.txtN2.getText()));
        model.setV4(Integer.valueOf(view.txtN4.getText()));
        model.setV5(Integer.valueOf(view.txtN5.getText()));
        model.setV6(Integer.valueOf(view.txtN6.getText()));
        model.sumar();
        model.resta();
        model.mult();
        view.txtResultado.setText(String.valueOf(model.getTotal()));
        view.txtResultado1.setText(String.valueOf(model.getTotal1()));
        view.txtResultado2.setText(String.valueOf(model.getTotal2()));
    }

   
   
}
