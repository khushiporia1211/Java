public class GCDByMethods {
    public static void main(String[] args) {
        System.out.println(GCD(15,3));
    }
    public static int GCD(int a, int b){
        while(a!=b){
            if(a>b){
                a = a-b;

            }
            else{
                b = b-a;

            }
        }
        return b;
    }
}
