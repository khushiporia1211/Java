public class Arrays1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[0]);


        // method 1

//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//
//
//        }
//

        System.out.println("\n"+arr.length);
        // method 2
        for (int x:arr){

            System.out.print(x+" ");
        }

    }
}
