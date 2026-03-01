import java.lang.Exception;

class ThreadTest extends Thread{
    public ThreadTest(String name){
        super(name);
//        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int count = 1;

        while(true){
            System.out.println(count++);
           try{
               Thread.sleep(1000); //print one time and sleep for 10 ms
           }
           catch (InterruptedException e){
               System.out.println(e);
           }
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) throws Exception {
        ThreadTest t = new ThreadTest("My Thread");
//        System.out.println("ID: "+t.getId());
//        System.out.println("Name: "+t.getName());
//        System.out.println("Priority: "+t.getPriority());
//        t.start();
//        System.out.println("State"+t.getState());
//        System.out.println("Alive: "+t.isAlive());
        t.start();
        t.interrupt();

    }
}
