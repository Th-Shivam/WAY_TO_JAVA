import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ActionEventDemo extends JFrame implements ActionListener {

    JButton btn;
    JLabel label;

    ActionEventDemo() {
        btn = new JButton("Click Me");
        label = new JLabel("Button not clicked");

        setLayout(new FlowLayout());

        add(btn);
        add(label);

        btn.addActionListener(this);

        setTitle("Action Event Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }
}