import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

class BorderInSwing extends JFrame{
    JLabel l;
    JTextField tf;
    JButton b;
    JPanel p;
    BorderInSwing(){
        l = new JLabel("Name");
        tf = new JTextField(20);
        b = new JButton("OK");
        p = new JPanel();
        p.add(l);
        p.add(tf);
        p.add(b);

        Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),"Login", TitledBorder.CENTER,TitledBorder.LEFT);
       p.setBorder(br);
        setLayout(new FlowLayout());
        add(p);
    }
}
public class Border_in_Swing {
    public static void main(String[] args) {
        BorderInSwing bs = new BorderInSwing();
        bs.setSize(500,500);
        bs.setVisible(true);
        bs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
