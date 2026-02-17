class Outer{
    int x = 10;
    class Inner{
        int y = 100;
        public void innerDisplay(){
            System.out.println("inner class display");
            System.out.println(x);
        }
    }
    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}
public class InnerClass_Nested {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();

    }
}
