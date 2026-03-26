import java.io.*;
import java.lang.Exception;

public class File_class {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Data.txt");
        //f.setReadOnly();
        f.setWritable(true);
        FileOutputStream fos = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\java\\Data.txt");//   System.out.println(f.isDirectory());
        f.lastModified();



//        String list[] = f.list();
//        for(String x : list){
//           System.out.println(x);
//       }
//
//        // instead of using String array we can use :
//        File list[] = f.listFiles();
//        for(File x : list){
//            System.out.print(x.getName()+" ");
//            System.out.println(x.getPath());
//            System.out.println(x.getParent());
//        }
    }
}
