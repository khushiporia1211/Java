import java.util.*;
public class Comparator_Demo {
    public static void main(String[] args) {
        int a[] = {2,4,6,8,1,3,5,7};
        int b[] = {2,4,6,8,1,3,5,7};
        System.out.println(Arrays.compare(a,b));

        int c[] = Arrays.copyOf(a,8);
        for(int x:c){
            System.out.println(x);
        }
//        Arrays.fill(c,10);
//        for(int y:c){
//            System.out.println(y);
//        }
        Arrays.sort(c);
        for(int x:c){
            System.out.println(x);
        }
        System.out.println(Arrays.binarySearch(c,2));
    }
}
