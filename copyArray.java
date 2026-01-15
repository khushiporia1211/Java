public class copyArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int arr1[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            arr1[i] = arr[i];

        }
        for(int x : arr1){
            System.out.print(x+" ");
        }
    }
}
