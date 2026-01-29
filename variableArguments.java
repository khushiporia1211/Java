public class variableArguments {
    public static void main(String[] args) {
        fun(10);
        fun(10,20,30,40);

    }
    public static void fun(int...x){
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
}
