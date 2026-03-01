import java.io.*;
import java.util.Scanner;
import java.lang.Exception;
public class tryWithResources {

    static void divide() throws Exception{
        try(FileInputStream fi = new FileInputStream("\\Users\\HP\\OneDrive\\Desktop\\java\\file.txt");  Scanner sc = new Scanner(fi)){
            int a  = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a/c);
        }

    }
    public static void main(String[] args) throws Exception {
    try{
        divide();
    }
    catch (Exception e){
        System.out.println(e);
    }

    }
}
