class Circle{
    public double radius;
    public Circle(){
        radius = 0.0;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    public double circumference(){
        return perimeter();
    }
}
// -----------Inherited class----------
class Cylinder extends  Circle{
    public double height;
    public Cylinder(){
        height = 0.0;
    }
    public double volume(){
        return area()*height;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 5;
        c.height = 20;
        System.out.println("Area = "+c.area());
        System.out.println("Circumference = "+c.circumference());
        System.out.println("Volume = "+c.volume());

    }
}
