public class Exception {
    public static void main(String[] args) {
        int a = 10 , b = 0, c;
        c = a/b;
        System.out.println(c);

        System.out.println("Bye"); // if there is error in the upper statements
                                    // then the independent statement will also not execute after the error,
                                    // So to avoid it we use Exception Handling in our program

    }
}
