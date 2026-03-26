import java.io.*;
import java.lang.Exception;

class Customers implements Serializable{
    String custID;
    String name;
    String phno;
    static int count = 1;
    Customers(){}
    Customers(String n, String p){
        custID = "C"+count;
        count++;
        name = n;
        phno = p;
    }
    public String toString(){
        return "Customer ID: "+custID+"\nName: "+name+"\nPhno: "+phno+"\n";
    }
}
public class serialization_problem {
    public static void main(String[] args) throws Exception {
//        Customers list[] = {new Customers("Smith","7428465846"),new Customers("john","8467583673"),new Customers("carry","4456746456")};
//
//        FileOutputStream fos = new FileOutputStream("customer.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeInt(list.length);
//        for(Customers c: list){
//            oos.writeObject(c);
//        }
//        oos.close();
//        fos.close();


        //-----------reading data from customer.txt---------
        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis = new FileInputStream("customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length = ois.readInt();
        Customers list[] = new Customers[length];
        for(int i =0; i<length; i++){
            list[i] = (Customers) ois.readObject();
        }
        System.out.println("Enter Name of Customer: ");
        String name = sc.nextLine();
        for(int i =0; i<length; i++){
            if(name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
            ois.close();
            fis.close();
        }
    }
}
