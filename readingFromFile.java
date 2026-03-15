import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;

public class readingFromFile {
    public static void main(String[] args) throws Exception {
        try (FileInputStream fis = new FileInputStream("Test.txt")) {
            int x;
//           fis.read(b);
//           String str = new String(b);
//            System.out.println(str);
            do{
                x = fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);


        }
    }
}
