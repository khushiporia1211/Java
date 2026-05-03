import java.awt.*;
import java.awt.event.*;
class ChangeLabel extends Frame implements TextListener,ActionListener{
    Label l1,l2;
    TextField   tf;
    public ChangeLabel(){
        super("Text Field Demo");
        l1 = new Label("No text is entered yet ");
        l2 = new Label("Enter key is not yet hit");
        tf = new TextField(20);
        tf.addTextListener(this);
        tf.addActionListener(this);
        tf.setEchoChar('*');

        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
    }
    public void textValueChanged(TextEvent te){
        l1.setText(tf.getText());
    }
    public void actionPerformed(ActionEvent ae){
        l2.setText(tf.getText());
    }
}
public class TextFieldDemo {
    public static void main(String[] args) {
        ChangeLabel cl = new ChangeLabel();
        cl.setSize(400,400);
        cl.setVisible(true);
    }


}
