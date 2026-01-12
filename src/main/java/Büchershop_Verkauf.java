import javax.swing.*;

public class Büchershop_Verkauf extends JFrame{
    private JPanel kaufPanel;
    private JButton speichernButton;
    private JScrollPane ausgabenliste;
    private JTextField author;
    private JButton ausgebenButton;
    private JTextField titel;
    private JTextField preis;
    private JTextField seitenzahl;
    private JComboBox genreauswahl;
    private JComboBox comboBox2;
    private JButton filterButton;
    private JButton berechneButton;

    public Büchershop_Verkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setContentPane(kaufPanel);
        setVisible(true);
    }
}
