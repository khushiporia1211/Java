class MyObject{
    //when I have defined my own class it will automatically extending from object class
}
class MyObject2{
    public String toString(){
        return "My Object";
    }
    public int hashCode(){
        return 100;
    }
    public boolean equals(Object o){
        return this.hashCode()==o.hashCode();
    }
}
public class objectClass {
    public static void main(String[] args) {
        Object o  = new Object();
        //o.equals(value); true only if references og two object are same
      //  o.hashCode();//every object we create in java has a unique code
        System.out.println(o.toString()); // if we print any bject it will call tostring() method automatically
        Object o1 = new Object();
        System.out.println(o.equals(o1)); // it will only give true if both the references holding the same object
        Object o2 = o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());


        MyObject mo = new MyObject();
        mo.hashCode();

        // so we can say every class directly or indirectly inheriting from Object class


        MyObject2 m = new MyObject2();
        System.out.println( m.toString()); // we can override the method of object class also in user-defined class
        MyObject2 m1 = new MyObject2();
        System.out.println(m.equals(m1));
         }
         // we can not override the methods like wait(), notify() because these are final methods
 }
