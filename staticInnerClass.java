class out{
    int x = 10;
    static int y  = 20;
    static class My{
        public void show(){
            System.out.println(y);
        }
    }
}
public class staticInnerClass {
    public static void main(String[] args) {
        out.My m = new out.My();
        m.show();
    }
}
