class Mine <T>{
    @SafeVarargs
    private void show(T...arg){
        for(T x : arg){
            System.out.println(x);
        }
    }

}
public class safeVarArgsAnnotation {
    public static void main(String[] args) {

    }
}
