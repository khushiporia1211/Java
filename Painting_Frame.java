import java.awt.*;
import java.awt.event.*;
class PaintingFrame extends Frame{
    int x=0,y=0;

    PaintingFrame(){
        super("Painting");
//        addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent me){
//                x = me.getX();
//                y = me.getY();
//                repaint();
//            }
//        });
        addMouseMotionListener(new MouseAdapter(){
            public void mouseMoved(MouseEvent me){
                x = me.getX();
                y = me.getY();
                repaint();
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.DARK_GRAY);
//        g.fillOval(x,y,50,50);
        g.setFont(new Font("Times New Roman",Font.BOLD,30));
        g.drawString("Hello",x,y);
    }
}
public class Painting_Frame {
    public static void main(String[] args) {
        PaintingFrame pf = new PaintingFrame();
        pf.setSize(500,500);
        pf.setVisible(true);
    }
}
