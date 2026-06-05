import java.awt.*;
import java.awt.event.*;
class Method1 extends Frame implements ActionListener {
    TextField tf;
    Button b;
    int count = 0;
    Method1(){
        super("Event Demo");
        tf = new TextField("0");
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));

    }
}
public class ListenerImplementationMethod1 {
    public static void main(String[] args) {
        Method1 m = new Method1();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
