interface Test1{
    void meth1();
    void meth2();
}
class Test2 implements Test1{
    public void meth1(){
        System.out.println("meth1");
    }
    public void meth2(){
        System.out.println("meth2");

    }
}
public class Interface_1 {
    Test2 t = new Test2();
    


}
