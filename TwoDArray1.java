import java.util.Scanner;
public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
//        for(int i = 0 ; i<arr.length; i++){
//            for(int j = 0; j<arr[i].length; j++){
//                arr[i][j] = (int)(Math.random()*10);
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();

            }
//            System.out.println();
        }
        //  for each method
        for(int x[]: arr){
            for(int y : x)
            {
                System.out.print(y+" ");
            }
            System.out.println();

        }
    }
}
