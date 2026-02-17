final class Final{
    int a = 10;
   void meth1(){
        System.out.println("meth1");
    }
}
//[class fSub2 extends Final{
//
//    } ] we can not inherit final class
//}
public class final_class {
    public static void main(String[] args) {
        Final f = new Final();
        f.meth1();

    }

}
