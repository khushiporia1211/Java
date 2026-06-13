import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class Split_Demo extends JFrame implements ListSelectionListener {
    JSplitPane sp;
    JList list;
    JLabel lbl;
    Split_Demo(){
        super("Split Demo");
        String cols[] = {"RED","GREEN","BLUE","YELLOW","MAGENTA","ORANGE","BLACK"};
        list = new JList(cols);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);
        JScrollPane p1 = new JScrollPane(list);

        lbl = new JLabel(" ");
        lbl.setOpaque(true);
        lbl.setBackground(Color.red);
        JScrollPane p2 =new JScrollPane( lbl);

//       -----------------JSplitPane--------------------
//        sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
//        sp.setDividerLocation(200);

        //--------------TabbedPane-----------------
        JTabbedPane jtb = new JTabbedPane();
        jtb.addTab("Colors",p1);
        jtb.addTab("Label",p2);
        add(jtb);

    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
       String str =(String) list.getSelectedValue();
       switch (str){
           case "RED": lbl.setBackground(Color.red);
           break;
           case "GREEN": lbl.setBackground(Color.green);
               break;
           case "BLUE": lbl.setBackground(Color.BLUE);
               break;
           case "YELLOW": lbl.setBackground(Color.yellow);
               break;
           case "MAGENTA": lbl.setBackground(Color.magenta);
               break;
           case "ORANGE": lbl.setBackground(Color.orange);
               break;
           case "BLACK": lbl.setBackground(Color.black);
               break;


       }
    }
}
public class Split_in_Swing {
    public static void main(String[] args) {
        Split_Demo sd = new Split_Demo();
        sd.setSize(500,500);
        sd.setVisible(true);
        sd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
