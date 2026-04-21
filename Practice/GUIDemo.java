import javax.swing.* ;
import java.awt.event.*;

public class GUIDemo {
    public static void main(String[] args) {

        JFrame f = new JFrame() ;
        f.setSize(400,300) ;
        JButton B1 = new JButton("B1") ;
        JButton B2 = new JButton("B2") ;
        JTextField tf = new JTextField() ;
        tf.setBounds(100,200,150,30);

        JLabel label = new JLabel("Enter Name ") ;
        label.setBounds(250,50,150,30);
        B1.setBounds(100,50,75,50);
        B2.setBounds(100,110,75,50);

        B2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        f.add(label) ;
        f.add(B1);
        f.add(B2) ;
        f.add(tf) ;
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
