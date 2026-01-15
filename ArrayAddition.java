public class ArrayAddition {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                      {4,5,6},
                      {7,8,9}};
        int arr1[][] = {{4,5,6},
                        {7,8,9},
                      {10,11,12}};
        int arr2[][] = new int[3][3];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }
        }
        for(int x[] : arr2){
            for(int y : x){
                System.out.printf("%02d ",y);
            }
            System.out.println();
        }
    }
}
