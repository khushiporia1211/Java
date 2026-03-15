@FunctionalInterface
interface lambda{
    public void display(String s,int age);
}
public class lambdaParameter {
    public static void main(String[] args) {
        lambda m = (s,a)->{
            System.out.println("name is "+s+" and age is "+a);
        };
        m.display("Khushi",20);
    }
}
