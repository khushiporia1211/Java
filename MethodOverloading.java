public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2.67,3.98));
        System.out.println(sum(2,3,4));

    }
    public static double sum(double a , double b){
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
}
