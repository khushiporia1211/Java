import java.io.*;
import java.lang.Exception;

class ThreadSync{
   void display(){
        Thread T = Thread.currentThread();

        for(int i = 0; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(T.getName()+" "+i);
            }
            catch (Exception e){

            }
        }
        synchronized (this){
            for(int i = 0; i<=5; i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(T.getName()+" "+i);
                }
                catch (Exception e){

                }
            }
        }
    }
}
class T extends Thread{
    ThreadSync t;
    T(ThreadSync t){
        this.t = t;
    }
    public void run(){
        t.display();
    }
}
public class synchronizedThread {
    public static void main(String[] args) {
        ThreadSync Ts = new ThreadSync();
        T t1 = new T(Ts);
        T t2 = new T(Ts);
        T t3 = new T(Ts);
        t1.start();
        t2.start();
        t3.start();
    }
}
