class Mine1{
    final int MIN = 1;
    final static int NORMAL;
    final int MAX;

    static{
        NORMAL = 132;
    }
    Mine1(){
        MAX = 10;
    }
}
public class finalKeyward_Variable {
    public static void main(String[] args) {
        Mine1 m = new Mine1();
        System.out.println(m.NORMAL);

    }
}
