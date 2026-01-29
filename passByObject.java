public class passByObject {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        update(arr);

    }
    public static void update(int arr[]){
        arr[0] = 3;
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
