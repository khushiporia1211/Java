import java.lang.reflect.Field;

class Me{
    private int a;
    protected int b;
    public int c;
    int d;
    public Me(){}
    public Me(int x, int y){}
    public void display(String s1,String s2){}
    public int show(int x,int y){ return 0;}


}
public class Reflection_ {
    public static void main(String[] args) {
       Class c = Me.class;
        System.out.println(c.getName());
        Field f[] = c.getDeclaredFields();
        for(Field fie:f){
            System.out.println(fie);
        }
    }
}
