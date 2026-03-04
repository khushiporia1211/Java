import java.lang.Exception;

class WhiteBoard {
    String txt;
    int noOfStudent = 0;
    int count = 0;

    public void attendance() {
        noOfStudent++;
    }

    synchronized public void write(String msg) {
        System.out.println(" Teacher is writing " + msg);
        while (count != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
            txt = msg;
            count = noOfStudent;
            notifyAll();
        }
    }

    synchronized public String read() {
        while (count == 0)
            try {
                wait();
            } catch (Exception e) {
            }

        String t = txt;
        count--;
        if (count == 0) {
            notify();
        }
        return t;

    }
}
class Teacher extends Thread{

    WhiteBoard w;
    String notes[] = {"Java is programming language","It is OOPs","It is platform independent","It support Thread","end"};
    public Teacher(WhiteBoard wb){
        w = wb;
    }
    public void run(){
        for(int i = 0; i< notes.length; i++){
            w.write(notes[i]);
        }
    }

}
class Student extends Thread{
    String name;
    WhiteBoard w;
    public Student(String n,WhiteBoard wb){
        name = n;
        w = wb;
    }
    public void run(){
        String txt;
        w.attendance();
        do{
            txt = w.read();
            System.out.println(name+" Reading "+txt);
            System.out.flush();
        }while(!txt.equals("end"));
    }
}

public class MultithreadingProblem2 {
    public static void main(String[] args) {
        WhiteBoard w =new WhiteBoard();
        Teacher t = new Teacher(w);
        Student s1 = new Student("1. Khushi",w);
        Student s2 = new Student("2. preeti",w);
        Student s3 = new Student("3. Kajal",w);
        Student s4 = new Student("4. Neha",w);

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
