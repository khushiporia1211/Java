import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.text.*;
import java.util.Date;
import java.util.Locale;

class TextField_Demo extends JFrame{

    TextField_Demo(){
        JTextField tf1 = new JTextField(15);

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        JFormattedTextField tf2 = new JFormattedTextField(df);
        tf2.setColumns(15);
        tf2.setValue(0);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter nft = new NumberFormatter(nf);
        nft.setAllowsInvalid(false);
        nft.setMaximum(10000);


        JFormattedTextField tf3 = new JFormattedTextField(nft);
        tf3.setColumns(15);
        tf3.setValue(0);

        JTextArea ta = new JTextArea(30,30);

        setLayout(new FlowLayout());
        add(tf1);
        add(tf2);
        add(tf3);
    }
}
public class TextField_in_Swing {
    public static void main(String[] args){
        TextField_Demo tfd = new TextField_Demo();
        tfd.setSize(500,500);
        tfd.setVisible(true);
        tfd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
