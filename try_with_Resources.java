import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.Exception;

public class try_with_Resources {
    public static void main(String[] args) throws Exception {

        try (FileOutputStream fos = new FileOutputStream("Test.txt")) {
                String str = "Learn Java Programming";
                byte b[] = str.getBytes();
                fos.write(b);

            }


    }
}
