import java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c;
        try {
            c = a / b;
            System.out.println("Division is: "+c);


        } catch (ArithmeticException e) {
//            System.out.println("Denominator should not be zero, try again ");
              System.out.println(e);
        }
        System.out.println("Bye");
    }
}
