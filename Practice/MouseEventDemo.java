import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventDemo extends JFrame implements MouseListener {

    JLabel label;

    MouseEventDemo() {
        label = new JLabel("Click anywhere");

        setLayout(new FlowLayout());
        add(label);

        addMouseListener(this);

        setTitle("Mouse Event Demo");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventDemo();
    }
}