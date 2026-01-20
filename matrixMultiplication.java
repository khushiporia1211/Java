public class matrixMultiplication {
    public static void main(String[] args) {
        int arr[][] = {{1,2},
                         {3,4}};
        int arr1[][] = {{5,6},
                        {7,8}};
        int arr2[][] = new int[2][2];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr2[i][j] =0;
                for(int k = 0; k<2; k++){
                    arr2[i][j] = arr2[i][j] + arr[i][k]*arr1[k][j];
                }
            }
        }
        for(int x[]:arr2){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
