import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class KeyEvent_Demo extends Frame implements KeyListener {
    Label l1,l2,l3,l4;
    public KeyEvent_Demo(){
        super("Key Event Demo");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");

        setLayout(null);

        l1.setBounds(30,30,100,20);
        l2.setBounds(30,60,100,20);
        l3.setBounds(30,90,100,20);
        l4.setBounds(30,120,200,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        addKeyListener(this);
    }




    public void keyPressed(KeyEvent e) {
        l1.setText("Key pressed");
        l2.setText("");
    }


    public void keyReleased(KeyEvent e) {
        l2.setText("Key Released");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }


    public void keyTyped(KeyEvent e) {
        l3.setText("key typed");
        l4.setText(new Date(e.getWhen())+"");
    }
}
public class keyEventsDemo {
    public static void main(String[] args) {
        KeyEvent_Demo ke = new KeyEvent_Demo();
        ke.setSize(500,500);
        ke.setVisible(true);
    }
}
