import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MiniWordPad extends JFrame {

    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JFileChooser fileChooser;
    private File currentFile = null;

    public MiniWordPad() {
        setTitle("Mini WordPad - Amrit Raj Singh - 24BCE10499");
        setSize(900, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setMargin(new Insets(8, 10, 8, 10));

        scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Text Files (*.txt)", "txt"));

        setJMenuBar(createMenuBar());
        add(createToolBar(), BorderLayout.NORTH);

        setVisible(true);
    }

    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        JMenuItem newItem = new JMenuItem("New", KeyEvent.VK_N);
        JMenuItem openItem = new JMenuItem("Open", KeyEvent.VK_O);
        JMenuItem saveItem = new JMenuItem("Save", KeyEvent.VK_S);
        JMenuItem exitItem = new JMenuItem("Exit");

        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        openItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        newItem.addActionListener(e -> newFile());
        openItem.addActionListener(e -> openFile());
        saveItem.addActionListener(e -> saveFile());
        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        JMenu editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E);

        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");

        cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));

        cutItem.addActionListener(e -> textArea.cut());
        copyItem.addActionListener(e -> textArea.copy());
        pasteItem.addActionListener(e -> textArea.paste());

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic(KeyEvent.VK_T);

        JMenuItem fontSizeItem = new JMenuItem("Change Font Size");
        JMenuItem textColorItem = new JMenuItem("Change Text Color");

        fontSizeItem.addActionListener(e -> changeFontSize());
        textColorItem.addActionListener(e -> changeTextColor());

        formatMenu.add(fontSizeItem);
        formatMenu.add(textColorItem);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem wordCountItem = new JMenuItem("Word Count");
        wordCountItem.addActionListener(e -> showWordCount());
        toolsMenu.add(wordCountItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(toolsMenu);

        return menuBar;
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setBorder(BorderFactory.createEmptyBorder(4, 6, 4, 6));

        JButton newBtn = makeButton("New");
        JButton openBtn = makeButton("Open");
        JButton saveBtn = makeButton("Save");
        JButton cutBtn = makeButton("Cut");
        JButton copyBtn = makeButton("Copy");
        JButton pasteBtn = makeButton("Paste");
        JButton fontSizeBtn = makeButton("Font Size");
        JButton colorBtn = makeButton("Text Color");
        JButton wordCountBtn = makeButton("Word Count");

        newBtn.addActionListener(e -> newFile());
        openBtn.addActionListener(e -> openFile());
        saveBtn.addActionListener(e -> saveFile());
        cutBtn.addActionListener(e -> textArea.cut());
        copyBtn.addActionListener(e -> textArea.copy());
        pasteBtn.addActionListener(e -> textArea.paste());
        fontSizeBtn.addActionListener(e -> changeFontSize());
        colorBtn.addActionListener(e -> changeTextColor());
        wordCountBtn.addActionListener(e -> showWordCount());

        toolBar.add(newBtn);
        toolBar.add(openBtn);
        toolBar.add(saveBtn);
        toolBar.addSeparator();
        toolBar.add(cutBtn);
        toolBar.add(copyBtn);
        toolBar.add(pasteBtn);
        toolBar.addSeparator();
        toolBar.add(fontSizeBtn);
        toolBar.add(colorBtn);
        toolBar.addSeparator();
        toolBar.add(wordCountBtn);

        return toolBar;
    }

    private JButton makeButton(String text) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        return btn;
    }

    private void newFile() {
        if (!textArea.getText().isEmpty()) {
            int choice = JOptionPane.showConfirmDialog(this,
                "Unsaved changes will be lost. Continue?", "New File",
                JOptionPane.YES_NO_OPTION);
            if (choice != JOptionPane.YES_OPTION) return;
        }
        textArea.setText("");
        currentFile = null;
        setTitle("Mini WordPad - New File");
    }

    private void openFile() {
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            currentFile = fileChooser.getSelectedFile();
            try (BufferedReader reader = new BufferedReader(new FileReader(currentFile))) {
                textArea.read(reader, null);
                setTitle("Mini WordPad - " + currentFile.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error opening file:\n" + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void saveFile() {
        if (currentFile == null) {
            int result = fileChooser.showSaveDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                currentFile = fileChooser.getSelectedFile();
                if (!currentFile.getName().endsWith(".txt")) {
                    currentFile = new File(currentFile.getAbsolutePath() + ".txt");
                }
            } else {
                return;
            }
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentFile))) {
            textArea.write(writer);
            setTitle("Mini WordPad - " + currentFile.getName());
            JOptionPane.showMessageDialog(this, "File saved successfully!", "Saved",
                JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file:\n" + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void changeFontSize() {
        String input = JOptionPane.showInputDialog(this,
            "Enter font size (8 - 72):",
            textArea.getFont().getSize());
        if (input != null) {
            try {
                int size = Integer.parseInt(input.trim());
                if (size < 8 || size > 72) {
                    throw new NumberFormatException();
                }
                textArea.setFont(new Font(textArea.getFont().getName(), Font.PLAIN, size));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number between 8 and 72.",
                    "Invalid Input", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    private void changeTextColor() {
        Color chosen = JColorChooser.showDialog(this, "Choose Text Color", textArea.getForeground());
        if (chosen != null) {
            textArea.setForeground(chosen);
        }
    }

    private void showWordCount() {
        String text = textArea.getText().trim();
        int charCount = textArea.getText().length();
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
        int lineCount = textArea.getLineCount();

        String msg = String.format(
            "Document Statistics\n\n" +
            "Words: %d\n" +
            "Characters: %d\n" +
            "Lines: %d",
            wordCount, charCount, lineCount
        );
        JOptionPane.showMessageDialog(this, msg, "Word Count", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}

        SwingUtilities.invokeLater(() -> new MiniWordPad());
    }
}