abstract class My{
    abstract public void show();
}
class Outer2{
    public void display(){
        new My(){public void show(){System.out.println("Hello"); }}.show();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
    Outer2 o = new Outer2();
    o.display();
    }
}
