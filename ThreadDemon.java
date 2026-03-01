import java.lang.Exception;

class MyThread1 extends Thread{



    public void run(){
        int count = 1;

        while(true) {
            System.out.println(count+++" My Thread");
        }
    }
}
public class ThreadDemon {
    public static void main(String[] args) throws Exception{
        MyThread1 t = new MyThread1();
//        t.setDaemon(true);
        t.start();
//        try{
//            Thread.sleep(100);
//        }catch(Exception e){
//
//        }
//        Thread mainThread = Thread.currentThread();
//        mainThread.join(); //join will wait for other thread to finish
        int count = 1;

        while(true) {
            System.out.println(count+++" Main Thread");
            Thread.yield(); // it will allow MyThread to execute
        }
    }
}
