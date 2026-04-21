import javax.swing.*;
import java.awt.event.*;

class EventDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame("Event Example");
        JButton b = new JButton("Click Me");
        b.setBounds(100,100,120,40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}