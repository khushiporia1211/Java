class OldClass{
    public void display(){
        System.out.println("hello");
    }
    @Deprecated
    public void show(){
        System.out.println("hi");
    }
}
public class DeprecatedAnnotation {
//    @SuppressWarnings("deprecation") // don't show warning in of deprecation and suppress the warning
//    @SuppressWarnings("checked") // check the warning
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        OldClass oc = new OldClass();

        oc.show(); // using deprecated method here

    }
}
