import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Büchershop_Einkauf extends JFrame {
    private JButton ausgebenButton;
    private JTextField author;
    private JPanel kaufPanel;
    private JTextField preis;
    private JTextField seitenzahl;
    private JList<Buch> ausgabenliste;
    private JComboBox genreauswahl;
    private JButton filterButton;
    private JButton kaufenButton;
    private JLabel Icon;
    private JTextField textField1;

    DefaultListModel<Buch> Variante = new DefaultListModel<>();

    public Büchershop_Einkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
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
        genreauswahl.addItem("Kinderbuch");

        initObjekte();

    }


    public static void main(String[] args) {
        new Büchershop_Einkauf();
    }

    private void initObjekte() {
        Buch Vorlage1 = new Buch("Der kleine Drache Kokosnuss", "Kinderbuch", "Ingo Siegner", 43, 336);
        Buch Vorlage2 = new Buch("Fight CLub", "Thriller", "Chuck Palahniuk", 13, 432);
        Buch Vorlage3 = new Buch("Der Prozess", "Fachbuch", "Franz Kafka", 21, 376);

        ausgabenliste.add(Vorlage1);
        ausgabenliste.add(Vorlage2);
        ausgabenliste.add(Vorlage3);

        Aktualisieren(ausgabenliste);
    }


    private void Aktualisieren(ArrayList<Buch> daten) {
        Variante.clear();
        for (Buch Vorlage : daten) {

            Variante.addElement(Vorlage);
        }
    }
}