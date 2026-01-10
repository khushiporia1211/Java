import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int arr[] = new int[5];
            int sum = 0;

            System.out.println("Enter elements");
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int a : arr){
                sum = sum + a;

                System.out.print(a+" ");
            }
        System.out.println("\nsum of an array is: "+sum);

        }
}


