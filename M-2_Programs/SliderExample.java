import javax.swing.*;

public class SliderExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JSlider s = new JSlider();
        s.setBounds(50, 50, 200, 50);

        f.add(s);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}