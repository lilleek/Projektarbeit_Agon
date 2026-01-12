import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Büchershop extends JFrame {
    private JPanel mainPanel;
    private JPasswordField passwordField1;
    private JPanel Willkommen;
    private JPanel Wilkommen;
    private JButton klickButton;

    public Büchershop() {
        setTitle("Willkommen im Büchershop");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 200);
        setContentPane(mainPanel);
        setVisible(true);

        klickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Büchershop_Einkauf();
            }
        });
    }


    static void main() {
        new Büchershop();
    }
}
