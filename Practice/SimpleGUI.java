import javax.swing.*;
import java.awt.*;

class SimpleGUI extends JFrame {

    JLabel label;
    JTextField textField;
    JButton button1, button2;

    SimpleGUI() {
        // Create components
        label = new JLabel("Enter your name:");
        textField = new JTextField(15);
        button1 = new JButton("Submit");
        button2 = new JButton("Clear");

        // Set layout
        setLayout(new FlowLayout());

        // Add components
        add(label);
        add(textField);
        add(button1);
        add(button2);

        // Frame settings
        setTitle("Simple GUI");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleGUI();
    }
}