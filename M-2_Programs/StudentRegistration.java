import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {
    // Components
    JLabel title, nameLabel, mobileLabel, genderLabel, courseLabel;
    JTextField nameField, mobileField;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JComboBox<String> courseBox;
    JButton submit, reset;
    JTextArea displayArea;

    public StudentRegistration() {
        // Frame Setup
        setTitle("Student Registration Form");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(240, 240, 240));

        // Title
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setBounds(150, 20, 200, 30);
        add(title);

        // Name
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 80, 100, 20);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 80, 200, 25);
        add(nameField);

        // Mobile
        mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(50, 120, 100, 20);
        add(mobileLabel);

        mobileField = new JTextField();
        mobileField.setBounds(150, 120, 200, 25);
        add(mobileField);

        // Gender
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 160, 100, 20);
        add(genderLabel);

        male = new JRadioButton("Male");
        male.setBounds(150, 160, 70, 20);
        female = new JRadioButton("Female");
        female.setBounds(230, 160, 80, 20);
        
        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        add(male);
        add(female);

        // Course
        courseLabel = new JLabel("Course:");
        courseLabel.setBounds(50, 200, 100, 20);
        add(courseLabel);

        String[] courses = {"Java", "Python", "C++", "Data Science"};
        courseBox = new JComboBox<>(courses);
        courseBox.setBounds(150, 200, 200, 25);
        add(courseBox);

        // Buttons
        submit = new JButton("Submit");
        submit.setBounds(100, 260, 100, 30);
        submit.addActionListener(this);
        add(submit);

        reset = new JButton("Reset");
        reset.setBounds(220, 260, 100, 30);
        reset.addActionListener(this);
        add(reset);

        // Display Area
        displayArea = new JTextArea();
        displayArea.setBounds(50, 310, 380, 120);
        displayArea.setEditable(false);
        add(displayArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String name = nameField.getText();
            String mobile = mobileField.getText();
            String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");
            String course = (String) courseBox.getSelectedItem();

            if (name.isEmpty() || mobile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill all fields!");
            } else {
                displayArea.setText("Registration Successful!\n" + 
                                    "----------------------------\n" +
                                    "Name: " + name + "\n" +
                                    "Mobile: " + mobile + "\n" +
                                    "Gender: " + gender + "\n" +
                                    "Course: " + course);
            }
        } else if (e.getSource() == reset) {
            nameField.setText("");
            mobileField.setText("");
            genderGroup.clearSelection();
            courseBox.setSelectedIndex(0);
            displayArea.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}