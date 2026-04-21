import javax.swing.*;
import java.awt.*;

class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {
        setLayout(new GridLayout(2, 3)); // 2 rows, 3 columns

        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        add(new JButton("5"));
        add(new JButton("6"));

        setTitle("GridLayout Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}