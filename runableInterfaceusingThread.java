class MyRunnable implements Runnable{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class runableInterfaceusingThread {
    public static void main(String[] args) {
        MyRunnable t = new MyRunnable();
        Thread th = new Thread(t);

        th.start();
        int i = 1;
        while(true){
            System.out.println(i+" World");
            i++;
        }

    }
}
