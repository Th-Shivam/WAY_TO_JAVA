import javax.swing.*;
import java.awt.event.*;

public class EventDemo2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Event Demo");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JButton button = new JButton("Click Me");
        button.setBounds(120, 100, 150, 40);

        // ActionEvent
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked - ActionEvent");
            }
        });

        // MouseEvent
        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked - MouseEvent");
            }
        });

        frame.add(button);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}