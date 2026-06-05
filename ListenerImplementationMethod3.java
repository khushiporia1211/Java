import java.awt.*;
import java.awt.event.*;
class Method3 extends Frame {
    TextField tf ;
    Button b;
    int count = 0;
    Method3(){
        super("Listner implementation using Annonymous class");
        tf = new TextField("0",20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                tf.setText(String.valueOf(count));
            }
        });
    }
}
public class ListenerImplementationMethod3 {
    public static void main(String[] args) {
        Method3 m = new Method3();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
