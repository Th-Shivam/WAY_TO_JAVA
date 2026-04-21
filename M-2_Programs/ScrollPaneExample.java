import java.awt.*;

public class ScrollPaneExample {
    public static void main(String[] args) {
        Frame f = new Frame();

        ScrollPane sp = new ScrollPane();
        TextArea ta = new TextArea("Long text...\nLine2\nLine3\nLine4");

        sp.add(ta);
        sp.setBounds(150, 150, 200, 100);

        f.add(sp);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}