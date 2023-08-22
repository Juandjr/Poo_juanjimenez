
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

public class Estudiantes extends JFrame {
    //realizamos la conexione con el SQL
    Conexion cc=new Conexion();
    Connection con = cc.conexion();
    JTextField cajatxt1 = new JTextField();
    JTextField cajatxt = new JTextField();
    JTextField cajatxt2 = new JTextField();
    JTextField cajatxt3 = new JTextField();
    JTextField cajatxt4 = new JTextField();
    JTextField cajatxt5 = new JTextField();
    JTextField cajatxt6 = new JTextField();
    JTextField cajatxt7 = new JTextField();
    JTextField cajatxt8 = new JTextField();
    JRadioButton radiobtn = new JRadioButton();
    JRadioButton radiobtn1 = new JRadioButton();
    JComboBox combox = new JComboBox();
    JTable tabla = new JTable();
    //Creamos una ventana grafica con JFrame
    public JPanel panel;
    public Estudiantes(){
        this.setSize(1280,720);
        setTitle("Estuadiantes");
        
        //para que se cierre el sistema
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //centrar la ventana
        //setBounds(500,200,500,500); primer metodo(te toca buscar el X y Y para que se centre
        setLocationRelativeTo(null);
        colocarPanel();
        ColocarBotones();
        colocarCajaTexto();
        radioButton();
        Combobox();
        tabla();
        colocarEtiquetas();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        ColocarBotones();
        colocarCajaTexto();
        radioButton();
        Combobox();
        tabla();
        colocarEtiquetas();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        //damos color al panel
        panel.setBackground(Color.green);
        panel.setBounds(0, 0,640 , 720);
        //poner el panel sobre la ventana registro
        this.getContentPane().add(panel);
    }
    
    //crear etiquetas
    public void colocarEtiquetas(){
        JLabel label = new JLabel("Estudiantes",SwingConstants.CENTER);
        panel.add(label);
        //para bloquear los diseños que vienen por defecto del label
        panel.setLayout(null);
        label.setBounds(100,10,350,50);
        label.setForeground(Color.yellow);
        label.setBackground(Color.black);
        label.setOpaque(true);
        //creamos objeto
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label6 = new JLabel();
        JLabel label7 = new JLabel();
        JLabel label8 = new JLabel();
        JLabel label9 = new JLabel();
        JLabel label10 = new JLabel();
        JLabel label11 = new JLabel();
        JLabel label12 = new JLabel();
        label2.setText("CODIGO:");
        label3.setText("CEDULA:");
        label4.setText("APELLIDO:");
        label5.setText("NOMBRE:");
        label6.setText("MAIL:");
        label7.setText("TELEFONO:");
        label8.setText("DIRECCION:");
        label9.setText("MATERIA:");
        label10.setText("ESTADO:");
        label11.setText("USUARIO: ");
        label12.setText("CONTRASEÑA: ");
        //agregamos la etiqueta al panel
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(label7);
        panel.add(label8);
        panel.add(label9);
        panel.add(label10);
        panel.add(label11);
        panel.add(label12);
        //Ubicamos los labels y les damos valores como el tipo de letra el color el tamaño,entre otros.
        label2.setHorizontalAlignment(HEIGHT);
        label2.setFont(new Font("arial",Font.PLAIN,15));
        label2.setBounds(50, 60, 350, 50);
        label2.setForeground(Color.red);
        //valores del label3
        label3.setHorizontalAlignment(HEIGHT);
        label3.setFont(new Font("arial",Font.PLAIN,15));
        label3.setBounds(50, 100, 350, 50);
        label3.setForeground(Color.red);
        //valores del label4
        label4.setHorizontalAlignment(HEIGHT);
        label4.setFont(new Font("arial",Font.PLAIN,15));
        label4.setBounds(50, 140, 350, 50);
        label4.setForeground(Color.red);
        //valores del label5
        label5.setHorizontalAlignment(HEIGHT);
        label5.setFont(new Font("arial",Font.PLAIN,15));
        label5.setBounds(50, 180, 350, 50);
        label5.setForeground(Color.red);
        //valores del label6
        label6.setHorizontalAlignment(HEIGHT);
        label6.setFont(new Font("arial",Font.PLAIN,15));
        label6.setBounds(50, 220, 350, 50);
        label6.setForeground(Color.red);
        //valores del label7
        label7.setHorizontalAlignment(HEIGHT);
        label7.setFont(new Font("arial",Font.PLAIN,15));
        label7.setBounds(50, 260, 350, 50);
        label7.setForeground(Color.red);
        //valores del label8
        label8.setHorizontalAlignment(HEIGHT);
        label8.setFont(new Font("arial",Font.PLAIN,15));
        label8.setBounds(50, 300, 350, 50);
        label8.setForeground(Color.red);
        //valores del label9
        label9.setHorizontalAlignment(HEIGHT);
        label9.setFont(new Font("arial",Font.PLAIN,15));
        label9.setBounds(50, 340, 350, 50);
        label9.setForeground(Color.red);
        //valores del label10
        label10.setHorizontalAlignment(HEIGHT);
        label10.setFont(new Font("arial",Font.PLAIN,15));
        label10.setBounds(50, 380, 350, 50);
        label10.setForeground(Color.red);
        //valores del label11
        label11.setHorizontalAlignment(HEIGHT);
        label11.setFont(new Font("arial",Font.BOLD,15));
        label11.setBounds(750 , 140, 350, 50);
        label11.setForeground(Color.red);
        //valores del label12
        label12.setHorizontalAlignment(HEIGHT);
        label12.setFont(new Font("arial",Font.BOLD,15));
        label12.setBounds(750 , 187, 350, 50);
        label12.setForeground(Color.red);
        //poner imagenes
        JLabel labelimagen2 = new JLabel();
        ImageIcon imagen2 = new ImageIcon("usuario.png");
        labelimagen2.setBounds(900, 40, 100, 100);
        panel.add(labelimagen2);
        labelimagen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(labelimagen2.getWidth(), labelimagen2.getHeight(), Image.SCALE_SMOOTH)));
        JLabel labelimagen = new JLabel();
        ImageIcon imagen = new ImageIcon("jijija.jpg");
        labelimagen.setBounds(0, 0, 640, 720);
        panel.add(labelimagen);
        labelimagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(labelimagen.getWidth(), labelimagen.getHeight(), Image.SCALE_SMOOTH)));
        JLabel labelimagen1 = new JLabel();
        ImageIcon imagen1 = new ImageIcon("pipipi.jpg");
        labelimagen1.setBounds(640, 0, 640, 720);
        panel.add(labelimagen1);
        labelimagen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(labelimagen1.getWidth(), labelimagen1.getHeight(), Image.SCALE_SMOOTH)));     
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
            cajatxt3.setText("");
            cajatxt4.setText("");
            cajatxt5.setText("");
            cajatxt6.setText("");
            cajatxt7.setText("");
            cajatxt8.setText("");
            radiobtn.setSelected(false);
            radiobtn1.setSelected(false);
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
            String SQL="INSERT INTO estudiantes(estu_codigo,estu_cedula,estu_apellido,estu_nombre,estu_mail,estu_telefono,estu_direccion,estu_materia,estu_estado)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,cajatxt.getText());
            pst.setString(2, cajatxt1.getText());
            pst.setString(3, cajatxt2.getText());
            pst.setString(4, cajatxt3.getText());
            pst.setString(5, cajatxt4.getText());
            pst.setString(6, cajatxt5.getText());
            pst.setString(7, cajatxt6.getText());
            int a=combox.getSelectedIndex();
            pst.setString(8, (String) (combox.getItemAt(a))) ;
            pst.setString(9, radiobtn.getText());
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
            String SQL="update estudiantes set estu_codigo=?,estu_cedula=?,estu_apellido=?,estu_nombre=?,estu_mail=?,estu_telefono=?,estu_direccion=?,estu_materia=?,estu_estado=? where estu_codigo=?";
            int filaSeleccionada=tabla.getSelectedRow();
            String dao=(String)tabla.getValueAt(filaSeleccionada,0);
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1, cajatxt.getText());
            pst.setString(2, cajatxt1.getText());
            pst.setString(3, cajatxt2.getText());
            pst.setString(4, cajatxt3.getText());
            pst.setString(5, cajatxt4.getText());
            pst.setString(6, cajatxt5.getText());
            pst.setString(7, cajatxt6.getText());
            int seleccion=combox.getSelectedIndex();
            pst.setString(8, (String) combox.getItemAt(seleccion));
            pst.setString(9,radiobtn.getText());
            pst.setString(10, dao);
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
                String SQL= "delete from estudiantes where estu_codigo="+tabla.getValueAt(filaSeleccionada, 0);
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
        cajatxt.setBounds(135, 75, 450, 20);
        panel.add(cajatxt);
        cajatxt.setText("");
        //valores de cajatxt1
        cajatxt1.setBounds(135, 115, 450, 20);
        panel.add(cajatxt1);
        cajatxt1.setText("");
        //valores de cajatxt2
        cajatxt2.setBounds(135, 155, 450, 20);
        panel.add(cajatxt2);
        cajatxt2.setText("");
        //valores de cajatxt3
        cajatxt3.setBounds(135, 195, 450, 20);
        panel.add(cajatxt3);
        cajatxt3.setText("");
        //valores de cajatxt4
        cajatxt4.setBounds(135, 235, 450, 20);
        panel.add(cajatxt4);
        cajatxt4.setText("");
        //valores de cajatxt5
        cajatxt5.setBounds(135, 275, 450, 20);
        panel.add(cajatxt5);
        cajatxt5.setText("");
        //valores de cajatxt6
        cajatxt6.setBounds(135, 315, 450, 20);
        panel.add(cajatxt6);
        cajatxt6.setText(""); 
        //valores de cajatxt7
        cajatxt7.setBounds(860, 155, 300, 20);
        panel.add(cajatxt7);
        //valores de cajatxt8
        cajatxt8.setBounds(860, 202, 300, 20);
        panel.add(cajatxt8);
        
    }
    
    public void radioButton(){
        //primero declaramos los objetos para el radioButton

        //añadimos los valores que deseamos al radio button
        //valores del primer radiobtn
        panel.add(radiobtn);
        radiobtn.setText("Activo");
        radiobtn.setBounds(135, 395, 200, 20);
        radiobtn.setBackground(Color.BLACK);
        radiobtn.setForeground(Color.red);
        radiobtn.setFont(new Font("arial",Font.PLAIN,15));
        radiobtn.setFocusPainted(false);
        radiobtn.setBorderPainted(false);
        radiobtn.setContentAreaFilled(false);
        //valores del primer radiobtn1
        panel.add(radiobtn1);
        radiobtn1.setText("Inactivo");
        radiobtn1.setBounds(135, 415, 200, 20);
        radiobtn1.setBackground(Color.BLACK);
        radiobtn1.setForeground(Color.red);
        radiobtn1.setFont(new Font("arial",Font.PLAIN,15));
        radiobtn1.setFocusPainted(false);
        radiobtn1.setBorderPainted(false);
        radiobtn1.setContentAreaFilled(false);
    }
    
    public void Combobox(){
        //primero declaramos los objetos para el Combox
        
        //añadimos los valores que deseamos al combo box
        //valores del primer combox
        panel.add(combox);
        combox.setBounds(135, 355, 450, 20);
        combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asignaturas", "POO", "INGLES", "FISICA" }));
    }
    
    public void tabla(){
       //añadimos los valores a la tabla
       panel.add(tabla);
       tabla.setBounds(700, 0, 500, 300);
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
        barra.setBounds(700 , 355, 500, 300);
        panel.add(barra);
        String titulos[]={"Codigo","Cedula","Apellidos","Nombres","Mail","Telefono","Direccion","Materia","Estado"};
        String registro[]=new String [11];
        DefaultTableModel modelo=new DefaultTableModel(null,titulos);
        String SQL="select * from estudiantes";
        try{
            Statement st =(Statement) con.createStatement();
            ResultSet rs=st.executeQuery(SQL);
            while(rs.next()){
                registro[0]= rs.getString("estu_codigo");
                registro[1]= rs.getString("estu_cedula");
                registro[2]= rs.getString("estu_apellido");
                registro[3]= rs.getString("estu_nombre");
                registro[4]= rs.getString("estu_mail");
                registro[5]= rs.getString("estu_telefono");
                registro[6]= rs.getString("estu_direccion");
                registro[7]= rs.getString("estu_materia");
                registro[8]= rs.getString("estu_estado");
                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostar los datos"+ e);
        }
    }
}