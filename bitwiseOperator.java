public class bitwiseOperator {
    public static void main(String[] args){
        byte a = 0b1010;
        byte b = 0b10; // n x 2^k=left shift
        int c = 10;
        int d = 2;
        System.out.println(Integer.toBinaryString(a&b));
//        System.out.println(a|b); //OR
        System.out.println(c^d); //XOR bitwise operator
        System.out.println(Integer.toBinaryString(b));
        System.out.println(c<<d);//left shift
        System.out.println(c>>d); //right shift=n/2^k

    }

}
