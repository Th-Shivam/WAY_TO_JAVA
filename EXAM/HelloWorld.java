import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello");
        JButton button = new JButton("Click Me");

        frame.add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}