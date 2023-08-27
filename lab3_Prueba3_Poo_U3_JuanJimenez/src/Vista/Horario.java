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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class Horario extends JFrame {
    //realizamos la conexione con el SQL
    JTextField cajatxt1 = new JTextField();
    JTextField cajatxt = new JTextField();
    JTextField cajatxt2 = new JTextField();
    JComboBox combox = new JComboBox();
    String[] columnNames = {"codigo", "hora", "profesor", "disponibilidad"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);
    JTable tabla = new JTable(model);
    JScrollPane frame = new JScrollPane(tabla);
    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase database = mongoClient.getDatabase("prueba3_u3");
    MongoCollection<Document> collection = database.getCollection("horario");
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
            combox.setSelectedItem(null);
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
        String hora = cajatxt1.getText();
        String profesor = cajatxt2.getText();
        String disponibilidad = (String) combox.getSelectedItem();
        model.addRow(new Object[]{codigo, hora, profesor, disponibilidad});
        // Conectar y guardar en MongoDB
        try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoDatabase database = mongoClient.getDatabase("prueba3_u3");
            MongoCollection<Document> collection = database.getCollection("horario");
            Document registro = new Document("codigo", codigo)
                    .append("hora",hora)
                    .append("profesor", profesor)
                    .append("disponibilidad", disponibilidad);

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
            String equipos = (String) cajatxt1.getText();
            String tamaño = (String) cajatxt2.getText();
            String ubicacion = (String) combox.getSelectedItem();

            // Actualizar los valores en el modelo de tabla
            tabla.setValueAt(codigo, selectedRow, 0);
            tabla.setValueAt(equipos, selectedRow, 1);
            tabla.setValueAt(tamaño, selectedRow, 2);
            tabla.setValueAt(ubicacion, selectedRow,3);
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
        frame.setVisible(true);
        frame.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //horizontal
        frame.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        frame.setBounds(700 , 100, 500, 500);
        panel.add(frame);
    }
}
