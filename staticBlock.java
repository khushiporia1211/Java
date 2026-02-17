//class Mine{
//    static int s;
//    static{
//        System.out.println("Block1");
//        s=10;
//    }
//    static{
//        System.out.println("Block2");
//
//    }
//}
public class staticBlock {
    static int s;
    static{
        System.out.println("Block1");
        s=10;
    }

    public static void main(String[] args) {
        //Mine m = new Mine();
        System.out.println("main");


    }
    static{
        System.out.println("Block2");

    }
}
