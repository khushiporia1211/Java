import java.util.*;

class Comp implements Comparator<Integer>{
    public int compare(Integer i1,Integer i2){
        if(i1<i2){
            return 1;
        }
        if(i1>i2){
            return -1;
        }
        return 0;
    }
}
public class Comparator_interface {
    public static void main(String[] args) {
        Integer a[] = {2,4,6,8,1,3,5,7};
        Arrays.sort(a,new Comp());
        for(Integer x:a){
            System.out.println(x);
        }
    }
}
