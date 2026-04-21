import javax.swing.*;
import java.awt.*;

class BorderExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());

        f.add(new JButton("North"), BorderLayout.NORTH);
        f.add(new JButton("South"), BorderLayout.SOUTH);
        f.add(new JButton("Center"), BorderLayout.CENTER);

        f.setSize(300,200);
        f.setVisible(true);
    }
}