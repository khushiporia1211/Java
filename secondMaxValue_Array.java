import java.util.Scanner;
public class secondMaxValue_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int max1 = arr[0];
        int max2 = arr[0];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max1){
                max2 = max1;
                max1 = arr[i];

            }else if(arr[i]>max2){
                max2 = arr[i];
            }

        }
        System.out.println(max2);
    }
}
