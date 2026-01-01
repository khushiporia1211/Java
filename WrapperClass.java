public class WrapperClass {
    public static void main(String[] args){
        Integer i = Integer.valueOf("23",16);
        System.out.println(i);
        int d = i;
        System.out.println(i.equals(d));
        System.out.println(Integer.decode("0xA7"));

    }
}
