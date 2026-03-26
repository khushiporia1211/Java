class MyArray1<T>{
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
public class Genric_Method {
//    static<T> void show(T[] list){
//        for(T x : list){
//            System.out.println(x);
//        }
    //----------using Bound here-----------
static<T extends Number> void show(T[] list){
    for(T x : list){
        System.out.println(x);
    }
    }
    public static void main(String[] args) {
    //    show(new String[] {"Hi","GO","Bye"}); this is not extends from Integer
        show(new Integer[]{10,20,30,40});
    }

}
