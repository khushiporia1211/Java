class Super1 {
    public void display() {
        System.out.println("Hello");
    }
}
class Sub2 extends Super1 {
    public void display() {
        System.out.println("Hello Welcome");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args) {
        Super1 su = new Sub2();
        su.display();




    }

}
