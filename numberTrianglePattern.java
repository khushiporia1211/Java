public class numberTrianglePattern {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print(j+" ");
//               System.out.print(i+" ");
//                System.out.print("* ");
//           }
//            for(int j = 1; j<=5+1-i; j++){
//                System.out.print(j+" ");
//            }
            for(int j = 1; j<=5; j++){
                if(j>=i){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
