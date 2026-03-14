@FunctionalInterface
interface MyLambda{
    public void display();
}
class Mona implements MyLambda{
    public void display(){
        System.out.println("Hello world");
    }
}
public class lambdaExpression {
    public static void main(String[] args) {


        MyLambda m = () ->{
            System.out.println("hello world");
        };
        m.display();
    }


}
