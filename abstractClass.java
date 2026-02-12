
abstract class Parent1{
    Parent1(){
        System.out.println("Parent class");
    }
    void meth1(){
        System.out.println("meth 1");
    }
    abstract void meth2();

}
class child extends Parent1{
    void meth2(){
        System.out.println("child meth2");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        child c = new child();
        c.meth2();
        c.meth1();
    }
}
