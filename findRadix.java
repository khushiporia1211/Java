import java.util.Scanner;
public class findRadix {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit: ");
     String str = sc.nextLine();
     if(str.matches("[01]+"))
     {
         System.out.println("Radix is 2");
     }
     else if(str.matches("[0-7]+"))
     {
         System.out.println("Radix is 8");
     }
     else if(str.matches("[0-9 a-f A-F]+"))
     {
         System.out.println("Radix is 16");
     }
     else if(str.matches("[0-9]+"))
     {
         System.out.println("radix is 10");
     }
     else
     {
         System.out.println("invalid value");
     }
    }
}
