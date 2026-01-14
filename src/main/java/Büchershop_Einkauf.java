import javax.swing.*;

public class Büchershop_Einkauf extends JFrame {
    private JButton ausgebenButton;
    private JTextField author;
    private JPanel kaufPanel;
    private JTextField preis;
    private JTextField seitenzahl;
    private JList <Buch> ausgabenliste;
    private JComboBox genreauswahl;
    private JComboBox comboBox2;
    private JButton filterButton;
    private JButton berechneButton;
    private JLabel Icon;
    private JTextField textField1;

    DefaultListModel<Buch> Variante = new DefaultListModel<>();

    public Büchershop_Einkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setContentPane(kaufPanel);
        setVisible(true);

        ausgabenliste.setModel(Variante);

        genreauswahl.addItem("Fantasy");
        genreauswahl.addItem("Thriller");
        genreauswahl.addItem("Liebesroman");
        genreauswahl.addItem("Roman");
        genreauswahl.addItem("Biografie");
        genreauswahl.addItem("Ratgeber");
        genreauswahl.addItem("Fachbücher");
    }

    public static void main(String[] args){
        new Büchershop_Einkauf();
    }
}
