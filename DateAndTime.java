import java.util.*;
 public class DateAndTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()+" ms");
//        System.out.println(System.currentTimeMillis()/1000+" sec");
//        System.out.println(System.currentTimeMillis()/1000/60+" min");
//        System.out.println(System.currentTimeMillis()/1000/60/60/24+" days");
//        System.out.println(System.currentTimeMillis()/1000/60/60/24/365+" years");
          Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime()); // time in milliseconds
        System.out.println(d.getDay());
        System.out.println(d.getMonth());

    }
}
