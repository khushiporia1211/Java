public class StringPassByObject {
    public static void main(String[] args) {
        String str = new String("Java");
        update(str);
        System.out.println(str);
    }

    public static void update(String str){
        String x = str.replace('J','L');
        System.out.println(x);
        System.out.println(str);

    }
}
