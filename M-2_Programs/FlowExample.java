import javax.swing.*;
import java.awt.*;

class FlowExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new FlowLayout());

        f.add(new JButton("One"));
        f.add(new JButton("Two"));
        f.add(new JButton("Three"));

        f.setSize(300,200);
        f.setVisible(true);
    }
}