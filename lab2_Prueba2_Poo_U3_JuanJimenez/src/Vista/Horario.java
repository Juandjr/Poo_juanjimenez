package Vista;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import control.Conexion;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

public class Horario extends JFrame {
    //realizamos la conexione con el SQL
    Conexion cc=new Conexion();
    Connection con = cc.conexion();
    JTextField cajatxt1 = new JTextField();
    JTextField cajatxt = new JTextField();
    JTextField cajatxt2 = new JTextField();
    JComboBox combox = new JComboBox();
    JTable tabla = new JTable();
    //Creamos una ventana grafica con JFrame
    public JPanel panel;
    public Horario(){
        this.setSize(1280,720);
        setTitle("Horario");
        
        //para que se cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //centrar la ventana
        //setBounds(500,200,500,500); primer metodo(te toca buscar el X y Y para que se centre
        setLocationRelativeTo(null);
        colocarPanel();
        ColocarBotones();
        colocarCajaTexto();
        Combobox();
        tabla();
        colocarEtiquetas();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        ColocarBotones();
        colocarCajaTexto();
        Combobox();
        tabla();
        colocarEtiquetas();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //damos color al panel
        panel.setBackground(Color.cyan);
        panel.setBounds(0, 0,1280 , 720);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    //crear etiquetas
    public void colocarEtiquetas(){
        JLabel label = new JLabel("horario",SwingConstants.CENTER);
        panel.add(label);
        //para bloquear los diseños que vienen por defecto del label
        panel.setLayout(null);
        label.setBounds(455,10,350,50);
        label.setForeground(Color.yellow);
        label.setBackground(Color.black);
        label.setOpaque(true);
        //creamos objeto
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        label2.setText("CODIGO:");
        label3.setText("HORA:");
        label4.setText("PROFESOR ASIGANDO:");
        label5.setText("DISPONIBILIDAD:");
        //agregamos la etiqueta al panel
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        //Ubicamos los labels y les damos valores como el tipo de letra el color el tamaño,entre otros.
        label2.setHorizontalAlignment(HEIGHT);
        label2.setFont(new Font("arial",Font.PLAIN,15));
        label2.setBounds(50, 150, 350, 50);
        label2.setForeground(Color.red);
        //valores del label3
        label3.setHorizontalAlignment(HEIGHT);
        label3.setFont(new Font("arial",Font.PLAIN,15));
        label3.setBounds(50, 200, 350, 50);
        label3.setForeground(Color.red);
        //valores del label4
        label4.setHorizontalAlignment(HEIGHT);
        label4.setFont(new Font("arial",Font.PLAIN,15));
        label4.setBounds(50, 250, 350, 50);
        label4.setForeground(Color.red);
        //valores del label5
        label5.setHorizontalAlignment(HEIGHT);
        label5.setFont(new Font("arial",Font.PLAIN,15));
        label5.setBounds(50, 300, 350, 50);
        label5.setForeground(Color.red);
        
   
    }
    
    public void ColocarBotones(){
        //añadimos las botones 
        //primero declaramos los objetos
        JButton boton = new JButton("Nuevo"); 
        JButton boton2 = new JButton("Guardar");
        JButton boton3 = new JButton("Editar");
        JButton boton4 = new JButton("Eliminar");
        JButton boton5 = new JButton("Salir");
        //valores de boton2
        ImageIcon imagen4 = new ImageIcon("botonnew.png");
        boton.setBounds(40, 500, 100, 50);
        panel.add(boton);
        boton.setEnabled(true);
        boton.setMnemonic('a');
        boton.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_SMOOTH)));
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            cajatxt.setText("");
            cajatxt1.setText("");
            cajatxt2.setText("");
            combox.setSelectedItem(null);
            }
        });
        //valores de boton2
        ImageIcon imagen3 = new ImageIcon("botongua.jpg");
        boton2.setBounds(150, 500, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('s');
        boton2.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            String SQL="INSERT INTO horario(horario_codigo,horario_hora,horario_profe,horario_disponibilidad)values(?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,cajatxt.getText());
            pst.setString(2, cajatxt1.getText());
            pst.setString(3, cajatxt2.getText());
            int a=combox.getSelectedIndex();
            pst.setString(4, (String) (combox.getItemAt(a))) ;
            //aqui ejecutamos la consulta
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
                 
        } catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error de insercion");
        }
    }
});
        //valores de boton3
        ImageIcon imagen5 = new ImageIcon("botonedi.jpg");
        boton3.setBounds(260, 500, 100, 50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('d');
        boton3.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        try {
            String SQL="update horario set horario_codigo=?,horario_hora=?,horario_profe=?,horario_disponibilidad=? where horario_codigo=?";
            int filaSeleccionada=tabla.getSelectedRow();
            String dao=(String)tabla.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, cajatxt.getText());
            pst.setString(2, cajatxt1.getText());
            pst.setString(3, cajatxt2.getText());
            int seleccion=combox.getSelectedIndex();
            pst.setString(4, (String) combox.getItemAt(seleccion));
            pst.setString(5, dao);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion "+e.getMessage());
        }
    }
});
        //valores de boton4
        ImageIcon imagen6 = new ImageIcon("botonborrar.jpg");
        boton4.setBounds(370, 500, 100, 50);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('f');
        boton4.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_SMOOTH)));
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                int filaSeleccionada=tabla.getSelectedRow();
                try {
                String SQL= "delete from horario where horario_codigo="+tabla.getValueAt(filaSeleccionada, 0);
                Statement st=(Statement) con.createStatement();
                int n=st.executeUpdate(SQL);
                if(n>=0){
                JOptionPane.showMessageDialog(null, "Registro Eliminado correctamente");
            }
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en eliminar registro"+e.getMessage());
        }
            }
        });
        
        //valores de boton5
        ImageIcon imagen7 = new ImageIcon("botonsalir.png");
        boton5.setBounds(480, 500, 100, 50);
        panel.add(boton5);
        boton5.setEnabled(true);
        boton5.setMnemonic('g');
        boton5.setIcon(new ImageIcon(imagen7.getImage().getScaledInstance(boton5.getWidth(), boton5.getHeight(), Image.SCALE_SMOOTH)));
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
    }
     
    public void colocarCajaTexto(){
        //añadimos las Text fields para escribir los valores que deseemos
        //primero declaramos los objetos
        
        //les damos los valores a los texte fields
        //valores de cajatxt
        cajatxt.setBounds(215, 165, 350, 20);
        panel.add(cajatxt);
        cajatxt.setText("");
        //valores de cajatxt1
        cajatxt1.setBounds(215, 215, 350, 20);
        panel.add(cajatxt1);
        cajatxt1.setText("");
        //valores de cajatxt2
        cajatxt2.setBounds(215, 265, 350, 20);
        panel.add(cajatxt2);
        cajatxt2.setText("");
        
    }
    
    public void Combobox(){
        //primero declaramos los objetos para el Combox
        
        //añadimos los valores que deseamos al combo box
        //valores del primer combox
        panel.add(combox);
        combox.setBounds(215, 315, 350, 20);
        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "disponibilidad", "DISPONIBLE", "NO DISPONIBLE"}));
    }
    
    public void tabla(){
       //añadimos los valores a la tabla
       panel.add(tabla);
       tabla.setBounds(700, 100, 500, 500);
       tabla.setModel(new javax.swing.table.DefaultTableModel(new Object [][] {
       },
       new String [] {
       }
       ));
       JScrollPane barra = new JScrollPane(tabla);
        //vertical
        barra.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //horizontal
        barra.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        barra.setBounds(700 , 100, 500, 500);
        panel.add(barra);
        String titulos[]={"Codigo","Hora","Profesor asignado","Disponiblidad"};
        String registro[]=new String [11];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        String SQL="select * from horario";
        try{
            Statement st =(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]= rs.getString("horario_codigo");
                registro[1]= rs.getString("horario_hora");
                registro[2]= rs.getString("horario_profe");
                registro[3]= rs.getString("horario_disponibilidad");
                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostar los datos"+ e);
        }
    }
}
