class sup{
    public void display(){
        System.out.println("super class display");
    }
}
class sb extends sup{
    @Override
    public void display(){
        System.out.println("sub class display");
    }
}
public class polymorphism2_Overriding {
    public static void main(String[] args) {
       sup s = new sb();
       s.display();

    }
}
