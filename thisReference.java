class Rectangle1{
    int length;
    int breadth;
    Rectangle1(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void display(){
        System.out.println("Length : "+this.length);
        System.out.println("Breadth : "+this.breadth);
    }
}
public class thisReference {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(112,234);
        r.display();


    }
}
