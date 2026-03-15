import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.lang.Exception;
public class Sequence_input_stream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 =new FileInputStream("Test.txt");
        FileInputStream fis2 =new FileInputStream("test2.txt");
        FileOutputStream fos =new FileOutputStream("copiedData.txt");


        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int x;
        while((x=sis.read())!=-1){
            fos.write(x);
        }
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
    }
}
