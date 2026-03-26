import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;

class Students{
    int rollno;
    String name;
    float avg;
    String dept;
}
public class fileHandlingProblem {
    public static void main(String[] args) throws Exception {
//        FileOutputStream fos = new FileOutputStream("Data.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//        Students s = new Students();
//        s.rollno = 10;
//        s.name = "John";
//        s.avg = 80.5f;
//        s.dept = "CSE";
//
//        dos.writeInt(s.rollno);
//        dos.writeUTF(s.name);
//        dos.writeFloat(s.avg);
//        dos.writeUTF(s.dept);
//
        // read the data using DataInputStream
        FileInputStream fis = new FileInputStream("Data.txt");
        DataInputStream dis = new DataInputStream(fis);
        Students s1 = new Students();
        s1.rollno = dis.readInt();
        s1.name = dis.readUTF();
        s1.avg = dis.readFloat();
        s1.dept = dis.readUTF();

        System.out.println("Rollno of a Student is: "+s1.rollno);
        System.out.println("Name of a Student is: "+s1.name);
        System.out.println("Average of a Student is: "+s1.avg);
        System.out.println("Department of a Student is: "+s1.dept);



        dis.close();
        fis.close();
    }
}
