import javax.swing.*;

public class Büchershop_Einkauf extends JFrame {
    private JButton speichernButton;
    private JButton ausgebenButton;
    private JTextField author;
    private JPanel kaufPanel;
    private JTextField titel;
    private JTextField preis;
    private JTextField genre;
    private JTextField seitenzahl;
    private JScrollPane ausgabenliste;

    public Büchershop_Einkauf() {
        setTitle("Bücher Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setContentPane(kaufPanel);
        setVisible(true);
    }

    public static void main(String[] args){
        new Büchershop_Einkauf();
    }
}
