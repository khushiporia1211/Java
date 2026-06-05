import java.awt.*;
import java.awt.event.*;
class AdapterDemo extends Frame {
    AdapterDemo(){
        super("Adapter Demo");
        addWindowListener(new MyWindowAdapter());
    }
    class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){
            System.exit(0);

        }
    }
}
public class WindowAdapterDemo {
    public static void main(String[] args) {
        AdapterDemo ad = new AdapterDemo();
        ad.setSize(500,500);
        ad.setVisible(true);
    }
}
