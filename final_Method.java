class fSuper{
    final void meth1(){
        System.out.println("Hello");
    }
}
class fSub extends fSuper{
    // can not override final methods in inherited class
    void meth2(){
        System.out.println("Bye");
    }
}
public class final_Method {
    public static void main(String[] args) {
        fSub f = new fSub();
        f.meth1();
        f.meth2();

    }
}
