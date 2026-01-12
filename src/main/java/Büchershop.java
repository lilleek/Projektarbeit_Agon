import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Büchershop extends JFrame {
    private JPanel mainPanel;
    private JPanel Willkommen;
    private JPanel Wilkommen;
    private JButton KaufenButton;
    private JButton verkaufenButton;
    private JTextField Namensfeld;

    public Büchershop() {
        setTitle("Willkommen im Büchershop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 200);
        setContentPane(mainPanel);
        setVisible(true);

        KaufenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Büchershop_Einkauf();
            }
        });


        verkaufenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Büchershop_Verkauf();
            }
        });
    }


    static void main() {
        new Büchershop();
    }
}
