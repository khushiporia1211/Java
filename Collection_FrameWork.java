import java.util.*;
public class Collection_FrameWork {
    public static void main(String[] args) {

       ArrayList<Integer> al1 = new ArrayList<>(20);
       ArrayList<Integer> al2 = new ArrayList<>(List.of(10,20,30,40,50));
       al1.add(10);
       al1.add(0,98);
//       al1.addAll(al2);
        al1.addAll(1,al2);
        System.out.println(al1);
        System.out.println(al1.get(3));
        System.out.println(al1.contains(98));
        System.out.println(al1.lastIndexOf(10));
        al1.set(6,100);

        //----------Iteration-------------
        for(Iterator<Integer> it = al1.iterator();
        it.hasNext();){
            java.lang.Integer x = it.next();
            System.out.println(x);
        }
        //------using while loop
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        al1.forEach(x-> System.out.println(x));
    }
}
