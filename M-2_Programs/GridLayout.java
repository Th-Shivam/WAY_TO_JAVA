import javax.swing.*;
import java.awt.*;

class GridExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(new GridLayout(2,2));

        f.add(new JButton("1"));
        f.add(new JButton("2"));
        f.add(new JButton("3"));
        f.add(new JButton("4"));

        f.setSize(300,200);
        f.setVisible(true);
    }
}