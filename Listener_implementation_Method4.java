import java.awt.*;
import java.awt.event.*;
class Method4 extends Frame{
    TextField tf;
    Button b;
    int count = 0;
    Method4(){
        super("Listener implementation using lambda expression");
        tf = new TextField("0",20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(tf);
        add(b);
       b.addActionListener((ActionEvent ae) ->{
           count++;
           tf.setText(String.valueOf(count));
         }
       );
    }
}
public class Listener_implementation_Method4 {
    public static void main(String[] args) {
        Method4 m = new Method4();
        m.setSize(500,500);
        m.setVisible(true);
    }
}
