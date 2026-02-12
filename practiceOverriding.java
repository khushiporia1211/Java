class Car{
    public void start(){
        System.out.println("car started");
    }
    public void accelerate(){
        System.out.println("car is accelerated");
    }
    public void changeGear(){
        System.out.println("Car gear is changed");
    }
}
class LuxuryCar extends Car{
    @Override
    public void changeGear(){
        System.out.println("Automatic Gear");
    }
    public void openRoof(){
        System.out.println("Sun Roof Opened");
    }
}
public class practiceOverriding {
    public static void main(String[] args) {
//        LuxuryCar c = new LuxuryCar();
//        c.start();
//        c.accelerate();
//        c.changeGear();
//        c.openRoof();
        Car c = new LuxuryCar();
        c.start();
        c.changeGear();
    }
}
