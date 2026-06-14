import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class List_ComboBox_Spinner_Demo extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {
        JComboBox cb;
        JList l;
        JSpinner sp1,sp2;
        JTextField tf;
        int count =0;

        List_ComboBox_Spinner_Demo(){
            super("Spinner Demo");

            String countries[] = {"India","US","UK","Canada","Australia"};
            String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
           String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            cb = new JComboBox(countries);
            l = new JList(months);
            JScrollPane jsp = new JScrollPane(l);

           tf = new JTextField(15);

           sp1 = new JSpinner(new SpinnerNumberModel(1,1,31,1));
           sp2 = new JSpinner(new SpinnerListModel(days));

           setLayout(new FlowLayout());
           add(cb);
           add(sp1);
           add(sp2);
           add(jsp);
           add(tf);
           cb.addActionListener(this);
           l.addListSelectionListener(this);
           sp1.addChangeListener(this);
           sp2.addChangeListener(this);


        }


    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText((String)cb.getSelectedItem());
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText((String) l.getSelectedValue());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1){
            tf.setText(sp1.getValue()+"");
        }else {
            tf.setText((String) sp2.getValue());
        }

    }
}
public class List_ComboBox_Spinner_in_Swing {
    public static void main(String[] args) {
        List_ComboBox_Spinner_Demo ls = new List_ComboBox_Spinner_Demo();
        ls.setSize(500,500);
        ls.setVisible(true);
        ls.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
