public class sumOfNaturalNUmByMethods {
    public static void main(String[] args) {
        System.out.println(Sum(5));

    }
    public static int Sum(int n){
        int sum = 0;
        for(int i = 0; i<=n; i++){
            sum = sum +i;
        }
        return sum;
    }

}
