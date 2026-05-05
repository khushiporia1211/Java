import java.awt.*;
import java.awt.event.*;
class Textarea extends Frame implements ActionListener{
    TextArea ta;
    TextField tf;
    Label l;
    Button b;
    Textarea(){
        super("TextArea Demo");
        l = new Label("No Text Selected");
        ta = new TextArea(10,30);
        tf = new TextField(20);
        b = new Button("Click");

        setLayout(new FlowLayout());
        add(ta);
        add(l);
        add(tf);
        add(b);
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
//        l.setText(ta.getSelectedText());  //set the selected text of textarea as label
//        ta.append(tf.getText()); //append the text of textfield into textarea
        ta.insert(tf.getText(),ta.getCaretPosition()); //insert text where cursor is pointing in the textarea
    }
}
public class TextAreaDemo {
    public static void main(String[] args) {
        Textarea t = new Textarea();
        t.setSize(400,400);
        t.setVisible(true);
    }
}
