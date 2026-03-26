class MyArray2<T>{
    T A[] = (T[]) new Object[10];
    int length = 1;
    public void set(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i = 0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}
public class WildCard {
//    static void fun(MyArray2<? extends Number> obj){
//        obj.display();
//    }
static void fun(MyArray2<? super Number> obj){
    obj.display();
}
    public static void main(String[] args) {
        MyArray2<String> ma1 = new MyArray2<>();
        ma1.set("hi");
        ma1.set("bye");
        MyArray2<Number> ma2 = new MyArray2<>();
        ma2.set(10.6);
        ma2.set(20.7);
       // fun(ma1);
        fun(ma2);
    }
}
