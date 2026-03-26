import java.io.*;
import java.lang.Exception;

public class Random_Access_file {
    public static void main(String[] args) throws Exception {
        RandomAccessFile rf = new RandomAccessFile("Data.txt","rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());


      rf.write('d');

        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());
        rf.seek(3);
        System.out.println((char)rf.read());
        System.out.println(rf.getFilePointer()); // return position of a pointer
        rf.seek(rf.getFilePointer()+2);
        System.out.println((char)rf.read());




    }
}
