import java.awt.*;
import java.awt.event.*;
class Method2 extends Frame{
    TextField tf ;
    Button b;
    int count = 0;
    Method2(){
        super("Event class Demo");
        tf = new TextField("0",20);
        b =new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
        b.addActionListener(new MyListner());
    }
    class MyListner implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            count++;
            tf.setText(String.valueOf(count));
        }
    }
}
public class ListenerImplementationMethod2 {
    public static void main(String[] args) {
        Method2 m = new Method2();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
