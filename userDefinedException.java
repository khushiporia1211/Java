import java.lang.Exception;
import java.io.*;
class LowBalanceException extends Exception {
    public String toString(){
        return "Balance should be less than 5000";
    }
}
public class userDefinedException {
    static void fun1(){
        try{
            throw new LowBalanceException();
        }
        catch(LowBalanceException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        fun1();
    }
}
