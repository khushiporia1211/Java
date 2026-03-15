import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;
public class copyDataOfFileToAnotherFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("Test.txt");
        FileOutputStream fos = new FileOutputStream("test2.txt");
           int x ;
           while((x = fis.read())!=-1){
               if(x>=65 && x<=90)fos.write(x+32);
               else fos.write(x);

        }
           fis.close();
           fos.close();
    }
}
