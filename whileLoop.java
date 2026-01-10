import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
            int table = i*num;
            System.out.println(num+" X "+i+" = "+table);
           i++;
        }

    }
}
