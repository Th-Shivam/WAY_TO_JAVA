import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("GridLayout Demo");
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2, 2));

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}