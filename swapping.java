public class swapping {
    public static void main(String[] args){
        int a = 5;
        int b = 3;
        a = (a^b);
        b= (a^b);
        a= (a^b);
        System.out.println(a+" "+b);
        //example 2
        int c = 6;
        int d = 7;
        c = (c^d);
        d =( c^d);
        c = (c^d);
        System.out.println(c+" "+d);
    }
}
