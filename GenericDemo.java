class Data<T>{
    private T obj;
    public void set(T v){
        obj = v;
    }
    public T getData(){
        return obj;
    }
}
public class GenericDemo {
    public static void main(String[] args) {
//        Data<Integer> d = new Data<>();
//        d.set(10);
        Data<String> d1 = new Data<>();
        d1.set("hello guys!");
        System.out.println(d1.getData());
    }
}
