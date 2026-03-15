import java.io.FileInputStream;
import java.io.FileReader;
import java.lang.Exception;
public class file_Reader {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("Test.txt")) {
            int x;

           while((x=fr.read())!=-1){
               System.out.print((char)x);
           }


        }
    }
}
