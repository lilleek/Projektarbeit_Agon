import javax.swing.*;

public class Büchershop_Verkauf extends JFrame{
    private JPanel kaufPanel;
    private JScrollPane ausgabenliste;
    private JComboBox comboBox2;
    private JLabel Icon;
    private JTextField seitenzahl;
    private JComboBox genreauswahl;
    private JTextField preis;
    private JTextField textField1;
    private JTextField author;
    private JButton filterButton;
    private JButton preisButton;
    private JButton hinzufügenButton;

    public Büchershop_Verkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setContentPane(kaufPanel);
        setVisible(true);
    }
}
