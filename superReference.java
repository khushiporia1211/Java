class Rectangle2{
    int length;
    int breadth;
    int x = 10;
    Rectangle2(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
class Cuboid extends Rectangle2{

    int heigth;
    int x = 20;
    Cuboid(int l,int b,int h){
        super(l,b);
        heigth  = h;

    }
    void display(){
        System.out.println(super.x);
        System.out.println(x);
    }
}
public class superReference {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(10,20,30);
        c.display();


    }
}
