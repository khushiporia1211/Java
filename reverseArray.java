public class reverseArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 12;
        arr[1] = 15;
        arr[2] = 18;
        arr[3] = 11;
        arr[4] = 10;
        for(int i = arr.length-1 ; i>=0; i--){
            System.out.println(arr[i]+" ");
        }


    }
}
