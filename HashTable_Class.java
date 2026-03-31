import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable_Class{
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");
        ht.put(5,"E");

        String s = (String)ht.get(3);
        System.out.println(s);

        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Enumeration en = ht.keys();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
        //using this as a genric class
        Hashtable<Integer, String> h = new Hashtable<>();
        h.compute(2,(Integer,String)->"Z");
        System.out.println(h);

    }
}

