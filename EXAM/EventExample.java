import java.awt.*;
import java.awt.event.*;

public class EventExample {

    Frame f;
    Button b;
    TextField tf;

    EventExample() {

        f = new Frame("Event Handling");

        tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        b = new Button("Click Me");
        b.setBounds(50, 100, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Button Clicked!");
            }   
        });  // Register

        f.add(tf);
        f.add(b);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    // public void actionPerformed(ActionEvent e) {
    //     tf.setText("Button Clicked!");
    // }

    public static void main(String[] args) {
        new EventExample();
    }
}