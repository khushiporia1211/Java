public class callByValue {
    public static void main(String[] args) {
        int a = 5;
        Show(a);
        System.out.println(a);

    }
    public static void Show(int x){
        x =x*2;
        System.out.println(x);
    }
}
