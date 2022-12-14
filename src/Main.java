import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("Demo Game");
        jf.setBounds(100, 100, 400, 300);
        jf.setContentPane(new View2(jf));
        jf.setVisible(true);
    }
}
