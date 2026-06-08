import javax.swing.*;
import java.awt.*;

class Swing_Components extends JFrame{
    JLabel l;
    JButton b;
    int count = 0;
    Swing_Components(){
        super("Swing Demo");
        l = new JLabel("Clicked "+count+" Times");
        b = new JButton("Click");
        add(l);
        add(b);

        setLayout(new FlowLayout());
    }
}
public class SwingComponents {
    public static void main(String[] args) {
        Swing_Components s= new Swing_Components();
        s.setSize(500,500);
        s.setVisible(true);
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
