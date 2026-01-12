import javax.swing.*;

public class Büchershop extends JFrame {
    private JPanel mainPanel;
    private JPasswordField passwordField1;
    private JPanel Willkommen;
    private JPanel Wilkommen;

    public Büchershop() {
        setTitle("Willkommen im Büchershop");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 200);
        setContentPane(mainPanel);
        setVisible(true);

    }

    static void main() {
        new Büchershop();
    }
}
