import java.lang.Exception;

class ATM{
    synchronized public void checkBalance(String name) {
        System.out.print(name + " Checking ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.print(" Balance\n");
    }

    synchronized public void withdraw(String name , double amount) {
        System.out.print(name + " Withdrawing ");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.print(amount+"\n");
    }
}
class Customer1 extends Thread{
    String name;
    double  amount;
    ATM atm;
    Customer1(String n,ATM a,double amt){
        name = n;
        atm = a;
        amount = amt;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run(){
        useATM();
    }
}

public class MultithreadingProblem {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer1 c1 = new Customer1(" Khushi ",atm,1000);
        Customer1 c2 = new Customer1(" preeti ",atm,2000);
        c1.start();
        c2.start();
    }
}
