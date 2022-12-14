import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View3 extends JPanel {

    JButton button1;
    public View3() {
        this.setLayout(new GridLayout(3,1));
        makeButton();
    }

    private void makeButton(){
        button1 = new JButton();
        button1.setText("PRESS HERE");
        button1.setBackground(new Color(235, 235, 52));
        button1.setOpaque(true);
        button1.setBorderPainted(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setBackground(new Color(35, (int) Math.random()*255, (int) Math.random()));
            }
        });
        this.add(button1);
    }

}
