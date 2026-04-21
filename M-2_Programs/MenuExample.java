import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");

        JMenuItem open = new JMenuItem("Open");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(open);
        file.add(exit);
        mb.add(file);

        f.setJMenuBar(mb);

        f.setSize(300,300);
        f.setVisible(true);
    }
}