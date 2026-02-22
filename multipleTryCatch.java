public class multipleTryCatch {
    public static void main(String[] args) {
        int A[] = {30,20,10,40,0};
        try{
            int c = A[0]/A[2];
            System.out.println("Division is "+c);
            System.out.println(A[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be 0");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        System.out.println("Bye");
    }
}
