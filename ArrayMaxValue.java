import java.util.Scanner;
public class ArrayMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int arr[] = new int[5];
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            arr[i] =  sc.nextInt();
        }
        for(int x :arr){
            if(x>max){
                max = x;
            }
        }
        System.out.println(max);

    }
}
