
package Vista;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class Estudiantes extends JFrame {
    //realizamos la conexione con el SQL
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
    String[] columnNames = {"codigo", "cedula","apellido","nombre","mail","telefono","direccion","materia","estado"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    JTable tabla = new JTable(model);
    JScrollPane frame = new JScrollPane(tabla);
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = mongoClient.getDatabase("prueba3_u3");
    MongoCollection<Document> collection = database.getCollection("estuadiantes");
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
        //poner imagenes
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
        JButton boton6 = new JButton("Mostrar datos");
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
            cajatxt4.setText("");
            cajatxt5.setText("");
            cajatxt6.setText("");
            cajatxt7.setText("");
            cajatxt8.setText("");
            combox.setSelectedItem(null);
            radiobtn.setSelected(false);
            radiobtn1.setSelected(false);
            }
        });
        //valores de boton2 para guardar
        ImageIcon imagen3 = new ImageIcon("botongua.jpg");
        boton2.setBounds(150, 500, 100, 50);
        panel.add(boton2);
        boton2.setEnabled(true);
        boton2.setMnemonic('s');
        boton2.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.addActionListener(new ActionListener() {
                @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = cajatxt.getText();
        String cedula = cajatxt1.getText();
        String apellido = cajatxt2.getText();
        String nombre = cajatxt3.getText();
        String mail = cajatxt4.getText();
        String telefono = cajatxt5.getText();
        String direccion = cajatxt6.getText();
        String materia = (String) combox.getSelectedItem();
        String estado = radiobtn.getText();
        model.addRow(new Object[]{codigo, cedula,apellido,nombre,mail,telefono,direccion,materia,estado});
        // Conectar y guardar en MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("prueba3_u3");
            MongoCollection<Document> collection = database.getCollection("estudiantes");
            Document registro = new Document("codigo", codigo)
                    .append("cedula", cedula)
                    .append("apellido", apellido)
                    .append("nombre", nombre)
                    .append("mail", mail)
                    .append("telefono", telefono)
                    .append("direccion", direccion)
                    .append("materia", materia)
                    .append("estado", estado);

            collection.insertOne(registro);

        }}
});
        //valores de boton3 para editar
        ImageIcon imagen5 = new ImageIcon("botonedi.jpg");
        boton3.setBounds(260, 500, 100, 50);
        panel.add(boton3);
        boton3.setEnabled(true);
        boton3.setMnemonic('d');
        boton3.setIcon(new ImageIcon(imagen5.getImage().getScaledInstance(boton3.getWidth(), boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent evt) {
        int selectedRow = tabla.getSelectedRow();

        if (selectedRow != -1) {
            // Obtener los valores de los campos de edición
            String codigo = (String) cajatxt.getText();
            String cedula = (String) cajatxt1.getText();
            String apellido = (String) cajatxt2.getText();
            String nombre = (String) cajatxt3.getText();
            String mail = (String) cajatxt4.getText();
            String telefono = (String) cajatxt5.getText();
            String direccion = (String) cajatxt6.getText();
            String materia = (String) combox.getSelectedItem();
            String estado = radiobtn.getText();
            // Actualizar los valores en el modelo de tabla
            tabla.setValueAt(codigo, selectedRow, 0);
            tabla.setValueAt(cedula, selectedRow, 1);
            tabla.setValueAt(apellido, selectedRow, 2);
            tabla.setValueAt(nombre, selectedRow,3);
            tabla.setValueAt(mail, selectedRow,4);
            tabla.setValueAt(telefono, selectedRow,5);
            tabla.setValueAt(direccion, selectedRow,6);
            tabla.setValueAt(materia, selectedRow,7);
            tabla.setValueAt(estado, selectedRow,8);
        }
    }
});

        //valores de boton4 para eliminar
        ImageIcon imagen6 = new ImageIcon("botonborrar.jpg");
        boton4.setBounds(370, 500, 100, 50);
        panel.add(boton4);
        boton4.setEnabled(true);
        boton4.setMnemonic('f');
        boton4.setIcon(new ImageIcon(imagen6.getImage().getScaledInstance(boton4.getWidth(), boton4.getHeight(), Image.SCALE_SMOOTH)));
         boton4.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = tabla.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
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
                dispose();
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
        frame.setVisible(true);
        frame.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //horizontal
        frame.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.setBounds(700 , 100, 500, 500);
        panel.add(frame);
    }
}