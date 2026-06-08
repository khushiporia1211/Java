package Projects;
import java.awt.*;
import java.awt.event.*;
class Bouncing_Boll extends Frame implements Runnable{
    int x, y,tx,ty;
    Bouncing_Boll(){
        x = 100;
        y = 100;
        tx = ty = 1;

        Thread t = new Thread(this);
        t.start();


    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,50,50);

    }


    @Override
    public void run() {
      while(true) {
          x += tx;
          y += ty;

          if (x < 0 || x >450) {
              tx = tx * (-1);
          }
          if (y < 0 || y > 400) {
              ty = ty * (-1);
          }
          repaint();
          try{Thread.sleep(5);}catch (Exception e){}
      }
    }
}
public class Animation_Bouncing_Boll {
    public static void main(String[] args) {
        Bouncing_Boll b = new Bouncing_Boll();
        b.setSize(500,450);
        b.setVisible(true);
    }
}
