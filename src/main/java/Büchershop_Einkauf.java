import javax.swing.*;
import java.awt.event.ActionEvent;

public class Büchershop_Einkauf extends JFrame {
    private JButton clearButton;
    private JPanel kaufPanel;
    private JList<Buch> ausgabenliste;
    private JButton filterButton;
    private JButton kaufenButton;
    private JLabel Icon;
    protected JTextField titel_ausgabe;
    protected JTextField autor_ausgabe;
    protected JTextField seitenanzahl_ausgabe;
    protected JTextField preis_ausgabe;
    protected JComboBox genre_ausgabe;
    protected JComboBox filtern;

    DefaultListModel<Buch> Variante = new DefaultListModel<>();

    public Büchershop_Einkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 500);
        setContentPane(kaufPanel);
        setVisible(true);

        ausgabenliste.setModel(Variante);

        genre_ausgabe.addItem("Fantasy");
        genre_ausgabe.addItem("Thriller");
        genre_ausgabe.addItem("Liebesroman");
        genre_ausgabe.addItem("Roman");
        genre_ausgabe.addItem("Biografie");
        genre_ausgabe.addItem("Ratgeber");
        genre_ausgabe.addItem("Fachbücher");
        genre_ausgabe.addItem("Kinderbuch");

        filtern.addItem("Fantasy");
        filtern.addItem("Thriller");
        filtern.addItem("Liebesroman");
        filtern.addItem("Roman");
        filtern.addItem("Biografie");
        filtern.addItem("Ratgeber");
        filtern.addItem("Fachbücher");
        filtern.addItem("Kinderbuch");

        kaufenButton.addActionListener(this::kaufenButton);
        clearButton.addActionListener(this::clearButton);
        filterButton.addActionListener(this::filterButton);

        initObjekte();

    }


    public static void main(String[] args) {
        new Büchershop_Einkauf();
    }
    private void initObjekte() {
        Buch Vorlage1 = new Buch("Der kleine Drache Kokosnuss", "Kinderbuch", "Ingo Siegner", 43, 336);
        Buch Vorlage2 = new Buch("Fight CLub", "Thriller", "Chuck Palahniuk", 13, 432);
        Buch Vorlage3 = new Buch("Der Prozess", "Fachbuch", "Franz Kafka", 21, 376);

        Variante.addElement(Vorlage1);
        Variante.addElement(Vorlage2);
        Variante.addElement(Vorlage3);



    }
    private void filterButton(ActionEvent e) {

        String filter = (String) filtern.getSelectedItem();
        DefaultListModel<Buch> gefiltert = new DefaultListModel<>();

        ListModel<Buch> model = ausgabenliste.getModel();

        for (int i = 0; i < model.getSize(); i++) {
            Buch b = model.getElementAt(i);

            if (b.getGenre().equalsIgnoreCase(filter)) {
                gefiltert.addElement(b);
            }
        }

        ausgabenliste.setModel(gefiltert);
    }


    void clearButton(ActionEvent e){
        textloeschen(); }
    private void textloeschen() {
        Variante.clear();
    }

    //Speichern + try/catch Excaption Handling
    private void kaufenButton(ActionEvent e) {
        try {
            int Seitenanzahl = Integer.parseInt(seitenanzahl_ausgabe.getText());
            double Preis = Double.parseDouble(preis_ausgabe.getText());
            String Titel = titel_ausgabe.getText().trim();
            String Autor = autor_ausgabe.getText().trim();
            String Genre = (String) genre_ausgabe.getSelectedItem();

            //prüft ob alle Felder ausgefüllt und nicht auf "Auswahl" sonst fehlermeldung
            if (Titel.isEmpty() || Autor.isEmpty() || Preis == 0
                    || Genre == null || Genre.equals("Auswahl")) {
                JOptionPane.showMessageDialog(this,
                        "'Sein oder nicht Sein', aber wo ist dein Genre?",
                        "Huh", JOptionPane.WARNING_MESSAGE);
                return;
            }

//erzeugt neues Buch und fügt es in die Datenliste ein
            Buch Gekauft = new Buch(Titel, Genre, Autor, (int) Preis, Seitenanzahl);
            Variante.addElement(Gekauft);


            // Felder leeren
            titel_ausgabe.setText("");
            autor_ausgabe.setText("");
            seitenanzahl_ausgabe.setText("");
            preis_ausgabe.setText("");
            genre_ausgabe.setSelectedIndex(0);


        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Bitte gib für Preis (z. B. 12.99) und Seiten (z. B. 336) gültige Zahlen ein.",
                    "Formatfehler", JOptionPane.ERROR_MESSAGE);
        }

        }
    }