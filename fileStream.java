import java.io.*;
import java.io.FileOutputStream;

public class fileStream {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("Test.txt");
            String str = "Learn Java Programming";
            byte b[] = str.getBytes();
            fos.write(b,6,str.length()-6);
           // fos.write(str.getBytes());
            fos.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e);

        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
