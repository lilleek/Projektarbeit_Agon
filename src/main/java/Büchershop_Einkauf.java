import javax.swing.*;

public class Büchershop_Einkauf extends JFrame {
    private JButton ausgebenButton;
    private JTextField author;
    private JPanel kaufPanel;
    private JTextField preis;
    private JTextField seitenzahl;
    private JScrollPane ausgabenliste;
    private JComboBox genreauswahl;
    private JComboBox comboBox2;
    private JButton filterButton;
    private JButton berechneButton;
    private JLabel Icon;
    private JTextField textField1;

    public Büchershop_Einkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setContentPane(kaufPanel);
        setVisible(true);
    }

    public static void main(String[] args){
        new Büchershop_Einkauf();
    }
}
