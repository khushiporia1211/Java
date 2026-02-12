abstract class Shape{
    abstract void Parameter();
    abstract void area();
}
class circle extends Shape{
    double radius;
    public void Parameter(){

        System.out.println(2*Math.PI*radius);
    }
    public void area(){

        System.out.println(Math.PI*radius*radius);
    }
}
class rectangle extends Shape{
    double length;
    double breadth;
    public void Parameter(){
        System.out.println(2*(length+breadth));
    }
    public void area(){
        System.out.println(length*breadth);
    }
}
public class abstractPractice {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.area();
        circle c = new circle();
        c.Parameter();
    }
}
