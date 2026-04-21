import javax.swing.*;

public class SimpleGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple GUI");
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Label
        JLabel label = new JLabel("Enter Name:");
        label.setBounds(50, 50, 100, 30);

        // Text Field
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 150, 30);

        // Button 1
        JButton button1 = new JButton("Submit");
        button1.setBounds(50, 120, 100, 30);

        // Button 2
        JButton button2 = new JButton("Clear");
        button2.setBounds(200, 120, 100, 30);

        // Add components
        frame.add(label);
        frame.add(textField);
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}