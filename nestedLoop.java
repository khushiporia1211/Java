public class nestedLoop {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++){
//                System.out.print(i+" ");
//                System.out.print("["+i+" "+j+"]");
//                System.out.print(i+j+" ");
                System.out.printf("%0(2d  ",count++);
            }
            System.out.println();
        }

    }
}
