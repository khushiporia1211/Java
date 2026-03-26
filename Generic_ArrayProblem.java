class MyArray<T>{
    @SuppressWarnings("unchecked")
    T A[] = (T[]) new Object[10];
    int length = 0;
    public void append(T v){
        A[length++] = v;
    }
    public void display(){
        for(int i = 0; i<length; i++){
            System.out.println(A[i]);
        }
    }
}
public class Generic_ArrayProblem {
    public static void main(String[] args) {
        MyArray<Integer> ma = new MyArray<>();
        ma.append(23);
        ma.append(67);
        ma.append(78);
        ma.display();
    }
}
