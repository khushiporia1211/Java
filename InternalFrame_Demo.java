import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyInternalFrame extends JInternalFrame{
    static int count = 0;
    JTextArea ta ;
    JScrollPane sp;
    MyInternalFrame(){
        super("Document"+(++count),true,true,true,true);

        ta = new JTextArea();
        sp = new JScrollPane(ta);
        add(sp);

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem m1 = new JMenuItem("Save");

        file.add(m1);
        mb.add(file);
        setJMenuBar(mb);

        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}
class Internal_Frame extends JFrame implements ActionListener {
    JDesktopPane jp;
    Internal_Frame(){
        super("Internal Frame Demo");
        jp = new JDesktopPane();
        setContentPane(jp);

        JMenuBar mb = new JMenuBar();
        JMenu d = new JMenu("Document");
        JMenuItem m1 = new JMenuItem("New");

        d.add(m1);
        mb.add(d);
        setJMenuBar(mb);

        m1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame mi = new MyInternalFrame();
        jp.add(mi);
    }
}
public class InternalFrame_Demo {
    public static void main(String[] args) {
        Internal_Frame i = new Internal_Frame();
        i.setSize(500,500);
        i.setVisible(true);
        i.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
