import java.awt.*;
import java.awt.event.*;
class MenuBarDemo extends Frame {
    Menu file,sub;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem auto;

    TextField tf;
    MenuBarDemo(){
        super("MenuBar Demo");
        open = new MenuItem("open");
        save = new MenuItem("save");
        close = new MenuItem("close");
        closeAll = new MenuItem("closeAll");

        auto = new CheckboxMenuItem("Auto save");

        file = new Menu("File");
        sub = new Menu("Close");

        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);
        sub.add(close);
        sub.add(closeAll);

        MenuBar mb = new MenuBar();
        mb.add(file);
        setMenuBar(mb);

        tf = new TextField(20);
        setLayout(new FlowLayout());
        add(tf);

        open.addActionListener((ActionEvent ae)->tf.setText("open"));
        save.addActionListener((ActionEvent ae)->tf.setText("save"));
        close.addActionListener((ActionEvent ae)->tf.setText("close"));
        closeAll.addActionListener((ActionEvent ae)->tf.setText("closeAll"));

        auto.addItemListener((ItemEvent ie )->{
            if(auto.getState()){
                tf.setText("Auto On");
            }else{
                tf.setText("Auto Off");
            }
        });
    }
}
public class MenuDemo {
    public static void main(String[] args) {
        MenuBarDemo mb = new MenuBarDemo();
        mb.setSize(500,500);
        mb.setVisible(true);
    }
}
