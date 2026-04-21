import java.awt.*;
import java.awt.event.*;

public class CardLayoutExample {

    public static void main(String[] args) {

        Frame f = new Frame("CardLayout Example");

        // Create CardLayout
        CardLayout cl = new CardLayout();

        // Panel for cards
        Panel p = new Panel();
        p.setLayout(cl);

        // Add cards
        p.add(new Button("Card 1"), "c1");
        p.add(new Button("Card 2"), "c2");
        p.add(new Button("Card 3"), "c3");

        // Buttons to switch cards
        Button next = new Button("Next");
        Button prev = new Button("Previous");

        // Panel for control buttons
        Panel control = new Panel();
        control.add(prev);
        control.add(next);

        // Action for next
        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.next(p);
            }
        });

        // Action for previous
        prev.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.previous(p);
            }
        });

        // Add panels to frame
        f.add(p, BorderLayout.CENTER);
        f.add(control, BorderLayout.SOUTH);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}