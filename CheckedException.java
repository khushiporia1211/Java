import java.lang.Exception;
import java.io.*;
public class CheckedException {
    static void fun1(){
       // FileInputStream fi = new FileInputStream("My.txt")//give exception which compiler know already
    }
    static void fun2(){
        fun1();
    }
    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();
    }
}
