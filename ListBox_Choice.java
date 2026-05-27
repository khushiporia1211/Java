import java.awt.*;
import java.awt.event.*;
class ChoiceFrame extends Frame implements ItemListener,ActionListener{
    List l;
    Choice c;
    TextArea ta;

    ChoiceFrame(){
        super("ListBox Demo");
        l = new List(4,true);
        c = new Choice();
        ta = new TextArea(20,30);

        l.add("Monday");
        l.add("Tuesday");
        l.add("Wednesday");
        l.add("Thursday");
        l.add("Friday");
        l.add("Saturday");
        l.add("Sunday");

        c.add("January");
        c.add("February");
        c.add("March");
        c.add("April");

        setLayout(new FlowLayout());
        add(l);
        add(c);
        add(ta);

        l.addItemListener(this);
        c.addItemListener(this);
        l.addActionListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if(ie.getSource()==l){
            ta.setText(l.getSelectedItem());
        }else{
            ta.setText(c.getSelectedItem());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String list[] = l.getSelectedItems();

        String txt = "";
        for(String x : list){
            txt += x+"\n";
        }
        ta.setText(txt);

    }
}

public class ListBox_Choice {
    public static void main(String[] args) {
        ChoiceFrame cf = new ChoiceFrame();
        cf.setSize(400,400);
        cf.setVisible(true);
    }
}
