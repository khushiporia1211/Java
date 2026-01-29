public class functionCalling {
    public static void main(String[] args) {
        fun3();

    }
    public static void fun1(){
        System.out.println("fun1");
    }
    public static void fun2(){
        System.out.println("fun2");
        fun1();

    }
    public static void fun3(){
        System.out.println("fun3");
        fun2();

    }
}
