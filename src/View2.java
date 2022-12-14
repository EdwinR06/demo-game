import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View2 extends JPanel {

    JButton button1;
    JTextArea textArea;
    JTextField inputText;
    public View2(JFrame jf) {
        this.setLayout(new GridLayout(3,1));
        makeJTextField();
        makeButton(jf);
        makeTextArea();
    }

    private void makeJTextField(){
        inputText = new JTextField();
        this.add(inputText);
    }
    private void makeButton(JFrame jf){
        button1 = new JButton();
        button1.setText("PRESS HERE");
        button1.setBackground(new Color(235, 235, 52));
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(textArea.getText() + inputText.getText());
                button1.setBackground(new Color((float) Math.random(), (float) Math.random(), (float) Math.random()));
                jf.setContentPane(new View3());
            }
        });
        this.add(button1);
    }
    private void makeTextArea(){
        textArea = new JTextArea(5, 40);
        String text = "";
        textArea.setText(text);
        textArea.setFont(new Font("Arial", Font.BOLD, 18));
        // Wrap the lines of the JTextArea if it does not fit in the
        // current allocated with of the JTextArea.
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        this.add(scrollPane, BorderLayout.CENTER);
    }
}
