import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.io.File;

class JTree_components extends JFrame implements TreeSelectionListener {
    JTree tree;
    JLabel label;
    JTree_components(){
        super("JTree Demo");

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\Users\\HP\\OneDrive\\Desktop\\java");
        File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java");

        for(File x : f.listFiles()){
            if(x.isDirectory()){
                DefaultMutableTreeNode temp = new DefaultMutableTreeNode(x.getName());
                for(File y:x.listFiles()){
                    temp.add(new DefaultMutableTreeNode(x.getName()));

                }
                root.add(temp);

            }else {
                root.add(new DefaultMutableTreeNode(x.getName()));
            }
        }
        tree = new JTree(root);
        label = new JLabel("No Files Selected");
        tree.addTreeSelectionListener(this);
        JScrollPane  sp = new JScrollPane(tree);
        add(sp, BorderLayout.CENTER);
        add(label,BorderLayout.SOUTH);
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
      label.setText(e.getPath().toString().substring(35));
    }
}
public class JTree_in_Swing {
    public static void main(String[] args) {
        JTree_components t = new JTree_components();
        t.setSize(500,500);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
