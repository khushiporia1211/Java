import java.io.*;
import java.io.Serializable;
import java.lang.Exception;

class Stud implements Serializable {
    private int rollno;
   private String name;
   private float avg;
   private String dept;
   public static int Data = 10;
   public transient int t;
   public Stud(){}
    public Stud(int r, String n, float a, String d){
       rollno = r;
       name = n;
       avg = a;
       dept = d;
       Data = 500;
       t = 500;
    }
    public String toString(){
       return "\nStudent Details\n"+
               "\nRollno "+rollno+
               "\nAverage "+avg+
               "\nDept "+dept+
               "\nData "+Data+
               "\nTransient "+t+"\n";
    }
}
public class Serialization {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fos = new FileOutputStream("Data.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        Stud s = new Stud(10,"john",89.9f,"CSE");
//        oos.writeObject(s);
//        fos.close();
//        oos.close();

        // reading the data from data.txt using objectinputstream
        FileInputStream fis = new FileInputStream("Data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Stud s  =(Stud) ois.readObject();
        System.out.println(s);

        fis.close();
        ois.close();
    }
}
